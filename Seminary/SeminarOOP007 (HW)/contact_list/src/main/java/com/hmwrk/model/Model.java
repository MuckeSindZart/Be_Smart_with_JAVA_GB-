package com.hmwrk.model;

import java.util.ArrayList;
import java.util.List;

import com.hmwrk.model.contact_ways.Contact;
import com.hmwrk.model.contractors.Company;
import com.hmwrk.model.contractors.Contractor;
import com.hmwrk.model.contractors.Person;

public class Model {
    
    private List<Contractor> contractors;

    public List<Contractor> getContractors() {
        return contractors;
    }

    public Model(List<Contractor> contractor) {
        this.contractors = contractor;
    }

    public List<Contractor> findContractorByName(String name) {

        List<Contractor> foundContractors = new ArrayList<>();
        for (Contractor contractor : contractors) {
            if (contractor.getName().equalsIgnoreCase(name)) {
                foundContractors.add(contractor);
            }
        }
        return foundContractors;

    }

    public void addContractor(int choise, String name, Contact contact) {

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        if (choise == 1) {
            contractors.add(new Person(name, contacts));
        } else if (choise == 2) {
            contractors.add(new Company(name, contacts));
        }

    }

    public void removeContractor(String name) {

        contractors.removeAll(findContractorByName(name));

    }

    public void addNewContact(String name, Contact contact) {

        for (Contractor contractor : findContractorByName(name)) {
            contractor.addContact(contact);
        }

    }

    public void removeContact(String name, String value) {

        for (Contractor contractor : findContractorByName(name)) {
            Contact contactForRemove = null;
            for (Contact contact : contractor.getContacts()) {
                if (contact.getName().equalsIgnoreCase(value)) {
                    contactForRemove = contact;
                    break;
                }
            }
            contractor.getContacts().remove(contactForRemove);
        }

    }
}
