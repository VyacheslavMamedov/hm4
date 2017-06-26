import personsView.PersonsView;

/**
 * Created by asus on 21.06.17.
 */
public class PersonsAPP {
    public static void main(String[] args) {
        PersonsView view =new PersonsView();

        view.mainMenu();
        view.toSavePersons(1,"1","2",1,1_000);
        view.toSavePersons(2,"2","2",3,5_000);
        view.getById(2);
       // view.getById(1);
    }
}
