package controller;


import org.omg.CORBA.INTERNAL;
import persons.Persons;
import personsDAO.PerosnsDAO;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControllerPersons {

    PerosnsDAO perosnsDAO = new PerosnsDAO();

    public void toSavePersons(Persons persons){
        perosnsDAO.toSavePersons(persons);
    }

    public void getById(Integer id){
        perosnsDAO.getByIdPersons(id);
    }

    public Collection<Persons>getAllPersons(){
        //List<Persons> list = new ArrayList<>();
        return perosnsDAO.getAllPersons();
    }

    public void deletePersons(Integer id){
        perosnsDAO.toDelete(id);
    }

    public void uodatePersons(Integer id, Persons persons){
        perosnsDAO.toUpadtePersons(id, persons);
    }
}
