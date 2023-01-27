package com.hmwrk.model.contractors;

import java.util.List;

import com.hmwrk.model.contact_ways.Contact;

public class Contractor {
    
    protected String name;
    protected List<Contact> contacts;

    public String getName() {
        return name;
    }

    public Contractor(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nИмя: " + name + "\n");
        if (contacts != null) {
            for (Contact contact : contacts) {
                sb.append("\t" + contact.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
