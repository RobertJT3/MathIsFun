package com.mycompany.mathisfun;

/**
 * Creates a parent with name, last name, and email address
 *
 * @author Sumirah Hunter
 */
public class Parent {

    private String username;
    private String name;
    private String lastName;
    private String emailAd;

    /**
     * default constructor
     */
    public Parent() {

    }

    /**
     * Constructs a parent with initial values
     *
     * @param username username of the parent
     * @param name the parents name
     * @param lastName the parents last name
     * @param emailAd the parents email address
     */
    public Parent(String username, String name, String lastName, String emailAd) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.emailAd = emailAd;

    }

    /**
     * gets username
     *
     * @return returns username
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets the name
     *
     * @return returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * gets last name
     *
     * @return returns the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * gets the email
     *
     * @return returns the email
     */
    public String getEmail() {
        return emailAd;
    }

}
