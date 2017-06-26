package persons;

import java.security.PrivateKey;

/**
 * Created by asus on 21.06.17.
 */
public class Persons {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer salery;
    private Integer expirients;

    public Persons() {
    }

    public Persons(Integer id, String firstName, String lastName, Integer salery, Integer expirients) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salery = salery;
        this.expirients = expirients;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salery=" + salery +
                ", expirients=" + expirients +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalery() {
        return salery;
    }

    public void setSalery(Integer salery) {
        this.salery = salery;
    }

    public Integer getExpirients() {
        return expirients;
    }

    public void setExpirients(Integer expirients) {
        this.expirients = expirients;
    }
}
