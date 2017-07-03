package personsView;

import controller.ControllerPersons;
import persons.Persons;

import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by asus on 21.06.17.
 */
public class PersonsView {

    ControllerPersons controllerPersons = new ControllerPersons();

    public void mainMenu(){
        System.out.println("    Main menu:");
        System.out.println("1.Print all persons.");
        System.out.println("2.Update persons on id.");
        System.out.println("3.Delete persons on id.");
        System.out.println("4.Add new persons.");
        System.out.println("5.Get persons by id.");
        System.out.println("6.Exit.");

    }

    public void toSavePersons (Integer id, String fName, String lName, Integer exp, Integer salery){
        Persons persons = new Persons();
            persons.setId(id);
            persons.setFirstName(fName);
            persons.setLastName(lName);
            persons.setExpirients(exp);
            persons.setSalery(salery);
        controllerPersons.toSavePersons(persons);
    }

public void getById(Integer id){
        controllerPersons.getById(id);
}

public Collection<Persons> getAll(){
    return controllerPersons.getAllPersons();
    }

    public void deletePersons(Integer id){
    controllerPersons.deletePersons(id);
    }

    public void updatePersons(Integer id, String fName, String lName, Integer exp, Integer salery){
        Persons persons =new Persons();
        persons.setId(id);
        persons.setFirstName(fName);
        persons.setLastName(lName);
        persons.setExpirients(exp);
        persons.setSalery(salery);

        controllerPersons.uodatePersons(id,persons);
    }

    public int testResultScanner(Scanner keyboadr, String errMessage) {
        while (!keyboadr.hasNextInt()) {
            System.err.println(errMessage);
            keyboadr.next();
        }
        return keyboadr.nextInt();
    }
}
