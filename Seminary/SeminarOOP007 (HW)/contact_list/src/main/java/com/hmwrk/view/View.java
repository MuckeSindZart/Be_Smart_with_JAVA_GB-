package com.hmwrk.view;

import java.util.List;
import java.util.Scanner;

import com.hmwrk.model.contact_ways.Address;
import com.hmwrk.model.contact_ways.Contact;
import com.hmwrk.model.contact_ways.Email;
import com.hmwrk.model.contact_ways.Phone;
import com.hmwrk.model.contact_ways.Telegram;
import com.hmwrk.model.contact_ways.Vkontakte;
import com.hmwrk.model.contractors.Contractor;

public class View {
    
    public void showMenu() {

        System.out.println("Выберите пункт меню: ");
        System.out.println("1 - Посмотреть список всех контактов");
        System.out.println("2 - Найти контакт");
        System.out.println("3 - Добавить контакт");
        System.out.println("4 - Удалить контакт");
        System.out.println("5 - Добавить новый способ связи с контактом");
        System.out.println("6 - Удалить способ связи с контактом");
        System.out.println("0 - Выход из приложения");

    }
    
    private void showContactMenu() {

        System.out.println("Выберите тип способа связи:");
        System.out.println("1- Телефон");
        System.out.println("2 - Email");
        System.out.println("3 - VK");
        System.out.println("4 - Telegram");
        System.out.println("5 - Адрес");

    }


    public void addContractorMenu() {

        System.out.println("Выберите тип:");
        System.out.println("1 - Физическое лицо");
        System.out.println("2 - Юридическое лицо");

    }

    public Contact contactMenu(Scanner sc) {

        showContactMenu();

        int addContactMenuChoice = sc.nextInt();
        String value = "";
        Contact contact = null;

        switch (addContactMenuChoice) {
            case 1:
                System.out.println("Введите номер телефона:");
                value = sc.next();
                contact = new Phone(value);
                break;

            case 2:
                System.out.println("Введите Email:");
                value = sc.next();
                contact = new Email(value);
                break;

            case 3:
                System.out.println("Введите id VK:");
                value = sc.next();
                contact = new Vkontakte(value);
                break;

            case 4:
                System.out.println("Введите id Telegram:");
                value = sc.next();
                contact = new Telegram(value);
                break;

            case 5:
                System.out.println("Введите адрес:");
                value = sc.next();
                contact = new Address(value);
                break;

        }
        return contact;

    }

    public String getContactName(Scanner sc) {

        System.out.println("Введите имя, для которого добавить/удалить способ связи:");
        String getContactName = sc.next();
        return getContactName;

    }

    public String getContactValue(Scanner sc) {

        System.out.println("Введите способ связи, который хотете удалить: ");
        return sc.next();

    }

    public void showContractor(List<Contractor> counterAgents) {

        if (counterAgents.isEmpty()) {
            System.out.println("Не найдено, попробуйте еще раз...");
        } else {
            for (Contractor CounterAgent : counterAgents) {
                System.out.println(CounterAgent.toString());
                System.out.println();
            }
        }

    }

    public void showAllContacts(List<Contractor> counterAgents) {

        System.out.println();
        if (counterAgents.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            for (Contractor counterAgent : counterAgents) {
                System.out.println("-'"+counterAgent.getName()+"'");
            }
            System.out.println();
        }

    }
}
