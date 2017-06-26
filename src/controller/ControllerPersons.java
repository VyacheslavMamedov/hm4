package controller;


import org.omg.CORBA.INTERNAL;
import persons.Persons;
import personsDAO.PerosnsDAO;

public class ControllerPersons {

    PerosnsDAO perosnsDAO = new PerosnsDAO();

    public void toSavePersons(Persons persons){
        perosnsDAO.toSavePersons(persons);
    }

    public void getById(Integer id){
        perosnsDAO.getByIdPersons(id);
    }
}
