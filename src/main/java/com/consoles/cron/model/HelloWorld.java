package com.consoles.cron.model;

import com.solmelia.util.managers.UserManager;

import javax.annotation.ManagedBean;
import javax.inject.Named;

@Named
public class HelloWorld {

    private UserManager userManager;

    private String firstName = "John";
    private String lastName = "Doe";

    public HelloWorld() {
        userManager = new UserManager();
        try {
            userManager.getRegionalUser("ES");
        } catch (Exception e) {

        }
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

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
