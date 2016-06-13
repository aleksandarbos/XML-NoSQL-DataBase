package controllers;

import converter.Converter;
import converter.types.UnmarshallType;
import dal.AmendmentsDAO;
import models.rs.gov.parlament.amandmani.Amandman;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

import javax.xml.bind.JAXBException;

@With(Secure.class)
public class Amendments extends Controller {

    public static void show() {
        String userType = session.get("user-type");
    	render(userType);
    }

    public static void create(String amandmentName, String affectedRegulationUri,
                              int affectedClause, String affectedType, String user,
                              String amendmentContent) throws JAXBException {

        System.out.println("dodaj akt: " + amandmentName + ", predlozio korisnik: " + user + ", sadrzaj dokumenta: "+amendmentContent+", menja se dokument sa id: "+affectedRegulationUri+", id clana: "+affectedClause+", tip izmene "+affectedType);

        Amandman amendment = (Amandman) Converter.unmarshall(UnmarshallType.FROM_STRING, amendmentContent, Amandman.class);
        amendment.setNaziv(amandmentName);
        // amendment.setRegulationUri(affectedRegulationUri); TODO: add property regulationUri to amendment schema

        Amandman.DeoZaIzmenu editingPart = new Amandman.DeoZaIzmenu(); // TODO: make DeoZaIzmenu global
        editingPart.setOznakaClana(affectedClause);
        amendment.setDeoZaIzmenu(editingPart);
        // amendment.setAffectedType(affectedType); TODO: add property affected type

        AmendmentsDAO.addAmandment(amendment);

        show();
    }
    
    @Before(unless="time")
    public static void checkAccess() {
    	if (session.get("user-type").equals("GRADJANIN"))
    		Overview.show();
    }
}