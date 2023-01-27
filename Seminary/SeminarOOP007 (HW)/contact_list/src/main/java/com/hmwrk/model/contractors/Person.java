package com.hmwrk.model.contractors;

import java.util.List;

import com.hmwrk.model.contact_ways.Contact;

public class Person extends Contractor{
    
    public Person(String name, List<Contact> contacts) {
        super(name, contacts);
    }
    
}
