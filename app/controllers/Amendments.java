package controllers;

import converter.Converter;
import converter.types.UnmarshallType;
import dal.AmendmentsDAO;
import dal.RegulationsDAO;
import models.rs.gov.parlament.amandmani.Amandman;
import models.rs.gov.parlament.propisi.Propis;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

@With(Secure.class)
public class Amendments extends Controller {

    public static void show() throws IOException, JAXBException {
        String userType = session.get("user-type");

        HashMap<String, Propis> regulationsSearch = RegulationsDAO.fetchAllRegulations();
        Collection<Propis> regulations = regulationsSearch.values();
        render(regulations);

    	// render(userType);
    }

    public static void create(String amandmentName, String affectedRegulationUri,
                              int affectedClause, String affectedType, String user,
                              String amendmentContent) throws JAXBException, IOException {

        System.out.println("dodaj akt: " + amandmentName + ", predlozio korisnik: " + user + ", sadrzaj dokumenta: "+amendmentContent+", menja se dokument sa id: "+affectedRegulationUri+", id clana: "+affectedClause+", tip izmene "+affectedType);

        Amandman amendment = (Amandman) Converter.unmarshall(UnmarshallType.FROM_STRING, amendmentContent, Amandman.class);
        amendment.setNaziv(amandmentName);

        AmendmentsDAO.addAmandment(amendment);

        show();
    }
    
    @Before(unless="time")
    public static void checkAccess() {
    	if (session.get("user-type").equals("GRADJANIN"))
    		Overview.show();
    }
}
