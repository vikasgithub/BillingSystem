package com.mckinsey.exercise.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 20/10/12
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    /**
     * Unique Id of the user
     */
    private String userId;

    /**
     * First name of the user.
     */
    private String firstName;

    /**
     * Last name of the user.
     */
    private String lastName;

    /**
     * Type of user
     */
    private UserType userType;

    /**
     * Date of first transactionDate/registration date
     */
    private Date registrationDate;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
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

    public User(String userId, String firstName, String lastName, UserType userType, Date registrationDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        this.registrationDate = registrationDate;
    }
}
