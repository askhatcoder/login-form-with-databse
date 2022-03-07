/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author oXCToo
 */
public class User {

    private String id;

    private String course;

    private String gpa;

    private String dob;

    private String lastname;

    private String firstname;




    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }









    public String getCource ()
    {
        return course;
    }

    public void setCource (String cource)
    {
        this.course = cource;
    }













    public String getDob ()
    {
        return dob;
    }

    public void setDob (String dob)
    {
        this.dob= dob;
    }











    public String getGpa ()
    {
        return gpa;
    }

    public void setGpa (String gpa)
    {
        this.gpa = gpa;
    }

    public String getLastname ()
    {
        return lastname;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname ()
    {
        return firstname;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }





    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", course = "+ course +", dob = "+dob+", gpa = "+gpa+", lastname = "+lastname+", firstname = "+firstname+"]";
    }
}