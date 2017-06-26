package personsDAO;


import persons.Persons;

import java.io.*;
import java.util.Collection;

public class PerosnsDAO implements PersonsInterface{

    private File fileBase = new File("/home/asus/IdeaProjects/hm4/src/DataBase.txt");

    @Override
    public void getByIdPersons(Integer id) {
        Persons persons = new Persons();
        try {
            FileReader fileReader = new FileReader(fileBase);
            BufferedReader br = new BufferedReader(fileReader);

            String buffer;
            while((buffer = br.readLine()) != null){
                if (buffer.isEmpty()){
                    continue;
                }

                String[] arrayDataForFile = buffer.split("#");
                for (int i = 0; i < arrayDataForFile.length; i++) {
                    System.out.println(" -- "+arrayDataForFile[i]);
                }
            }
        
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void toSavePersons(Persons persons) {
        String personsToString = "";

        personsToString += persons.getId()+"#";
        personsToString += persons.getFirstName()+"#";
        personsToString += persons.getLastName()+"#";
        personsToString += persons.getExpirients()+"#";
        personsToString += persons.getSalery()+"/\n";

//        try (FileOutputStream fileOuputStream = new FileOutputStream(fileBase)){
//            fileOuputStream.write(personsToString.getBytes());
//            System.out.println("Persons" +persons+" to saved.");
        try (FileWriter fileWriter = new FileWriter(fileBase)){
            fileWriter.append(personsToString);
            System.out.println("Persons" +persons+" to saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void toUpadtePersons(Persons entity) {

    }

    @Override
    public void toDelete(Integer id) {

    }

    @Override
    public Collection<Persons> getAllPersons() {
        return null;
    }
}
