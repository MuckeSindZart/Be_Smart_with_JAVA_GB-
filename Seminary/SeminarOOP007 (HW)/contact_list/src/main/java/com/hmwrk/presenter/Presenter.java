package com.hmwrk.presenter;

import java.util.Scanner;

import com.hmwrk.model.Model;
import com.hmwrk.view.View;

public class Presenter {
    
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        Scanner usrInput = new Scanner(System.in);

        while (true) {
            view.showMenu();
            int menuChoice = usrInput.nextInt();

            switch (menuChoice) {
                case (1):
                    view.showAllContacts(model.getContractors());
                    break;

                case (2):
                    System.out.println("Введите имя контакта для поиска:");
                    String name = usrInput.next();
                    view.showContractor(model.findContractorByName(name));
                    break;

                case (3):
                    view.addContractorMenu();
                    int addAgentMenuChoise = usrInput.nextInt();
                    System.out.println("Введите наименование нового контакта:");
                    String newName = usrInput.next();
                    model.addContractor(addAgentMenuChoise, newName, view.contactMenu(usrInput));
                    System.out.println("Контакт добавлен.");
                    break;

                case (4):
                    System.out.println("Введите имя контакта, который нужно удалить:");
                    String removeName = usrInput.next();
                    model.removeContractor(removeName);
                    System.out.println("Контакт удален.");
                    break;

                case (5):
                    model.addNewContact(view.getContactName(usrInput), view.contactMenu(usrInput));
                    System.out.println("Способ связи добавлен");
                    break;

                case (6):
                    model.removeContact(view.getContactName(usrInput), view.getContactValue(usrInput));
                    System.out.println("Способ связи удален.");
                    break;

                case (0):
                    usrInput.close();
                    return;
            }
        }
    }
}
