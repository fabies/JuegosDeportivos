/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import java.sql.Date;

/**
 *
 * @author Martinez
 */
public class Single extends Competitor{
    private String lastName1;
    private String lastName2;
    private Date dateOfBirth;
    private String occupation;
    private String city;
    private String age;

    public Single(String lastName1, String lastName2, Date dateOfBirth, String occupation, String city, String age, int competitorId, String country, String name, boolean gender, String trainer, boolean type, int lodgingId) {
        super(competitorId, country, name, gender, trainer, type, lodgingId);
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.city = city;
        this.age = age;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
    
}