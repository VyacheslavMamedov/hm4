package personsView;

import controller.ControllerPersons;
import persons.Persons;

import java.io.IOException;

/**
 * Created by asus on 21.06.17.
 */
public class PersonsView {

    ControllerPersons controllerPersons = new ControllerPersons();

    public void mainMenu(){
        System.out.println("    Main menu:");
        System.out.println("1.Print all persons.");
        System.out.println("2.Update persons on id.");
        System.out.println("2.Delete persons on id.");
        System.out.println("2.Add new persons.");
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

}
