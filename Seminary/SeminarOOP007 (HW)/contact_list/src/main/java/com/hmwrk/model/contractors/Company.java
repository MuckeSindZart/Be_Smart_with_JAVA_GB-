package com.hmwrk.model.contractors;

import java.util.List;

import com.hmwrk.model.contact_ways.Contact;

public class Company extends Contractor{
    
    public Company(String name, List<Contact> contacts) {
        super(name, contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nНазвание: " + super.name + "\n");
        for (Contact contact : super.contacts) {
            sb.append("\t" + contact.toString() + "\n");
        }
        return sb.toString();
    }
}
