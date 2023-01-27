package com.hmwrk;

import java.util.ArrayList;
import java.util.List;

import com.hmwrk.model.Model;

import com.hmwrk.model.contact_ways.Address;
import com.hmwrk.model.contact_ways.Contact;
import com.hmwrk.model.contact_ways.Email;
import com.hmwrk.model.contact_ways.Phone;
import com.hmwrk.model.contact_ways.Telegram;
import com.hmwrk.model.contact_ways.Vkontakte;

import com.hmwrk.model.contractors.Company;
import com.hmwrk.model.contractors.Contractor;
import com.hmwrk.model.contractors.Person;

import com.hmwrk.presenter.Presenter;
import com.hmwrk.view.View;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // ------------------------------------------//

        List<Contractor> contractorsListRead = new ArrayList<>();
        
        List<Contact> bobContactList = new ArrayList<>();
        bobContactList.add(new Phone("555-35-35"));
        bobContactList.add(new Telegram("BobTornton"));
        bobContactList.add(new Email("Bob1961@yahoo.com"));

        Person bob = new Person("Bob", bobContactList);
        contractorsListRead.add(bob);

        List<Contact> companyContactList = new ArrayList<>();
        companyContactList.add(new Address("г.Колотушкино, ул. Пушкина, д. 16 индкс: 666000"));
        companyContactList.add(new Vkontakte("ооо\"Рога_и_Копыта\""));
        companyContactList.add(new Phone("5-555-555-55-55"));

        Company horns = new Company("Horns", companyContactList);
        contractorsListRead.add(horns);

        // ------------------------------------------//

        Presenter presenter = new Presenter(new View(), new Model(contractorsListRead));
        presenter.start();
    }
}
