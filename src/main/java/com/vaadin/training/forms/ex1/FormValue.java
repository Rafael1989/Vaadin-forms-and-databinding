/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.training.forms.ex1;

/**
 *
 * @author User
 */
public class FormValue {
    
    private double doubleValue;
    private int integerValue;
    String emailValue;
    String stringValue;
    String vaadinValue;

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getVaadinValue() {
        return vaadinValue;
    }

    public void setVaadinValue(String vaadinValue) {
        this.vaadinValue = vaadinValue;
    }
    
}
