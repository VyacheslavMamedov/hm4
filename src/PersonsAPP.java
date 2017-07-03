import personsView.PersonsView;

import java.util.Scanner;

/**
 * Created by asus on 21.06.17.
 */
public class PersonsAPP {

    public static void main(String[] args) {
        PersonsView view = new PersonsView();
        boolean controlExit = false;


        int chooseInMenu = 0;

        while (controlExit != true) {
            view.mainMenu();
            chooseInMenu = view.testResultScanner(new Scanner(System.in),"You not enter digital");
            switch (chooseInMenu) {
                case 4: {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter id: ");
                    int id = view.testResultScanner(new Scanner(System.in),"You not enter digital");

                    System.out.print("Enter first name: ");
                    String fName =in.next();

                    System.out.print("Enter last name: ");
                    String lName =in.next();


                    System.out.print("Enter expirients: ");
                    int exp =view.testResultScanner(new Scanner(System.in),"you not enter digital");

                    System.out.print("Enter salery: ");

                    int salery =view.testResultScanner(new Scanner(System.in),"you not enter digital");

                    view.toSavePersons(id, fName,lName, exp, salery);
                    controlExit = false;
                    break;
                }
                case 2: {

                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter id when you have to update: ");
                    int id = view.testResultScanner(new Scanner(System.in),"You not enter digital");

                    System.out.print("Enter first name: ");
                    String fName =in.next();

                    System.out.print("Enter last name: ");
                    String lName =in.next();


                    System.out.print("Enter expirients: ");
                    int exp =view.testResultScanner(new Scanner(System.in),"you not enter digital");

                    System.out.print("Enter salery: ");

                    int salery =view.testResultScanner(new Scanner(System.in),"you not enter digital");

                    view.updatePersons(id,fName,lName,exp,salery);

                    controlExit = false;
                    break;
                }
                case 3: {
                    System.out.print("Enter id when you delete to persons: ");
                    int id = view.testResultScanner(new Scanner(System.in),"You not enter digital");

                    view.deletePersons(id);
                    controlExit = false;
                    break;
                }
                case 5: {

                    System.out.print("Enter id persons: ");
                    int id = view.testResultScanner(new Scanner(System.in),"You not enter digital");

                    view.getById(id);
                    controlExit = false;
                    break;
                }
                case 1: {
                    System.out.println(view.getAll());
                    controlExit = false;
                    break;
                }
                case 6: {
                    controlExit = true;
                    break;

                }
            }



//
//        view.mainMenu();
//        view.toSavePersons(1, "1", "2", 1, 1_000);
//        view.toSavePersons(2, "2", "2", 3, 2_000);
//        view.toSavePersons(3, "3", "3", 4, 3_000);
//        view.toSavePersons(4, "4", "4", 5, 4_000);
//        view.getById(3);
//        System.out.println(view.getAll());
//        view.deletePersons(2);
//        System.out.println(view.getAll());
//        view.updatePersons(3, "qqq", "sss", 33, 33_333);

}


    }


}