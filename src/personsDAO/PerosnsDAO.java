package personsDAO;


import persons.Persons;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
                if (Integer.parseInt(arrayDataForFile[0])==id){
                    System.out.println("id = " +arrayDataForFile[0]+
                                        "First name = "+arrayDataForFile[1]+
                                        "Last name = "+arrayDataForFile[2]+
                                        "Expirients = "+arrayDataForFile[3]+
                                        "Salery = "+arrayDataForFile[4]);
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
        personsToString += persons.getSalery()+"\n";

        try {
            FileWriter fileWriter = new FileWriter(fileBase,true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(personsToString);
            bufferedWriter.close();
            System.out.println("Persons" +persons+" to saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void toUpadtePersons(Integer id, Persons persons) {

     //   Persons persons = new Persons();
        try {
            FileReader fileReader = new FileReader(fileBase);
            BufferedReader br = new BufferedReader(fileReader);

            File outFIle = new File("/home/asus/IdeaProjects/hm4/src/DataBase2.txt");
            String buffer;
            String str = null;
            while((buffer = br.readLine()) != null){
                if (buffer.isEmpty()){
                    continue;
                }

                String[] arrayDataForFile = buffer.split("#");
                if (Integer.parseInt(arrayDataForFile[0])!=id){
                    str =arrayDataForFile[0]+"#"+
                            arrayDataForFile[1]+"#"+
                            arrayDataForFile[2]+"#"+
                            arrayDataForFile[3]+"#"+
                            arrayDataForFile[4]+"\n";
                    } else
                if (Integer.parseInt(arrayDataForFile[0])==id){
                    str += id+"#";
                    str += persons.getFirstName()+"#";
                    str += persons.getLastName()+"#";
                    str += persons.getExpirients()+"#";
                    str += persons.getSalery()+"\n";
                }
                    try {
                        FileWriter fileWriter= new FileWriter(outFIle,true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(str);
                        bufferedWriter.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                //}

            }


            fileReader.close();
            fileBase.delete();
            outFIle.renameTo(fileBase);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void toDelete(Integer id){

        Persons persons = new Persons();
        try {
            FileReader fileReader = new FileReader(fileBase);
            BufferedReader br = new BufferedReader(fileReader);

            File outFIle = new File("/home/asus/IdeaProjects/hm4/src/DataBase2.txt");



            String buffer;
            String str = null;
        while((buffer = br.readLine()) != null){
            if (buffer.isEmpty()){
                continue;
            }

            String[] arrayDataForFile = buffer.split("#");
            if (Integer.parseInt(arrayDataForFile[0])!=id){
                str =arrayDataForFile[0]+"#"+
                        arrayDataForFile[1]+"#"+
                        arrayDataForFile[2]+"#"+
                        arrayDataForFile[3]+"#"+
                        arrayDataForFile[4]+"\n";
                ;
                try {
                    FileWriter fileWriter= new FileWriter(outFIle,true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(str);
                    bufferedWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
             //   bufferedWriter.close();
            }

            }


        fileReader.close();
            fileBase.delete();
       outFIle.renameTo(fileBase);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        }

        @Override
    public Collection<Persons> getAllPersons() {
        List<Persons> allPersons = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileBase);
            BufferedReader br = new BufferedReader(fileReader);

            String buffer;
            while((buffer = br.readLine()) != null){
                if (buffer.isEmpty()){
                    continue;
                }

                String[] aDataFile = buffer.split("#");

                    allPersons.add(new Persons(Integer.parseInt(aDataFile[0]),aDataFile[1],aDataFile[2],Integer.parseInt(aDataFile[4]),Integer.parseInt(aDataFile[3])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

       // System.out.println(allPersons);
        return allPersons;
    }
}
