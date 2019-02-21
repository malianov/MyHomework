package task_3.controller;

import task_3.model.Model;
import task_3.view.View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static task_3.view.View.*;

public class Controller {

    String strInput;
    Map<String, String> map = new HashMap<>();
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        view.showMessage(INVITATION);
        Scanner sc = new Scanner(System.in);

        view.showMessage(SURNAME);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkName(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Surname", strInput);
                break;
            }
        } while (true);

        view.showMessage(NAME);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkName(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Name", strInput);
                break;
            }
        } while (true);

        view.showMessage(PATRONYMIC);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkName(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Patronymic", strInput);
                break;
            }
        } while (true);

        view.showMessage(NICKNAME);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkNickName(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Nickname", strInput);
                break;
            }
        } while (true);

        view.showMessage(COMMENT);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkComment(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Comment", strInput);
                break;
            }
        } while (true);

        view.showMessage(GROUP, GROUP_ADVICE);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkGroup(strInput)) {
                view.showMessage(INPUT_ERROR, GROUP_ADVICE);
                continue;
            } else {
                map.put("Group", strInput);
                break;
            }
        } while (true);

        view.showMessage(PHONE_HOME, PHONE_ADVICE);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkPhone(strInput)) {
                view.showMessage(INPUT_ERROR, PHONE_ADVICE);
                continue;
            } else {
                map.put("Phone_home", strInput);
                break;
            }
        } while (true);

        view.showMessage(PHONE_MOB, PHONE_ADVICE);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkPhone(strInput)) {
                view.showMessage(INPUT_ERROR, PHONE_ADVICE);
                continue;
            } else {
                map.put("Phone_mob", strInput);
                break;
            }
        } while (true);

        view.showMessage(PHONE_MOB_2, PHONE_ADVICE, OR_NOT);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkSecondMobPhone(strInput)) {
                view.showMessage(INPUT_ERROR, PHONE_ADVICE, OR_NOT);
                continue;
            } else {
                map.put("Phone_mob_2", strInput);
                break;
            }
        } while (true);

        view.showMessage(EMAIL);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkEmail(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Email", strInput);
                break;
            }
        }
        while (true);

        view.showMessage(SKYPE);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkSkype(strInput)) {
                view.showMessage(INPUT_ERROR);
                continue;
            } else {
                map.put("Skype", strInput);
                break;
            }
        } while (true);

        view.showMessage(View.ADDRESS_INDEX);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkIndex(strInput)) {
                view.showMessage(ADDRESS_INDEX, INPUT_ERROR);
                continue;
            } else {
                map.put("Index", strInput);
                break;
            }
        } while (true);


        view.showMessage(View.ADDRESS_CITY);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkCity(strInput)) {
                view.showMessage(ADDRESS_CITY, INPUT_ERROR);
                continue;
            } else {
                map.put("City", strInput);
                break;
            }
        } while (true);


        view.showMessage(View.ADDRESS_STREET);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkStreet(strInput)) {
                view.showMessage(ADDRESS_STREET, INPUT_ERROR);
                continue;
            } else {
                map.put("Street", strInput);
                break;
            }
        } while (true);


        view.showMessage(View.ADDRESS_BUILDING);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkBuilding(strInput)) {
                view.showMessage(ADDRESS_BUILDING, INPUT_ERROR);
                continue;
            } else {
                map.put("Building", strInput);
                break;
            }
        } while (true);


        view.showMessage(View.ADDRESS_APARTMENT);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkAppartment(strInput)) {
                view.showMessage(ADDRESS_APARTMENT, INPUT_ERROR);
                continue;
            } else {
                map.put("Apartment", strInput);
                break;
            }
        } while (true);

        view.showMessage(View.DATA_OF_ENTERING);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkDate(strInput)) {
                view.showMessage(DATA_OF_ENTERING, INPUT_ERROR);
                continue;
            } else {
                map.put("Input", strInput);
                break;
            }
        } while (true);

        view.showMessage(View.DATA_LAST_CHANGES);
        do {
            strInput = sc.nextLine();
            if (!RegexChecker.checkDate(strInput)) {
                view.showMessage(DATA_LAST_CHANGES, INPUT_ERROR);
                continue;
            } else {
                map.put("Edited", strInput);
                break;
            }
        } while (true);

        System.out.println("Please, check entered information: ");
        System.out.println(SURNAME + map.get("Surname"));
        System.out.println(SURNAME + map.get("Name"));
        System.out.println(SURNAME + map.get("Patronymic"));
        System.out.println(NICKNAME + map.get("Nickname"));
        System.out.println(COMMENT + map.get("Comment"));
        System.out.println(GROUP + map.get("Group"));
        System.out.println(PHONE_HOME + map.get("Phone_home"));
        System.out.println(PHONE_MOB + map.get("Phone_mob"));
        System.out.println(PHONE_MOB_2 + map.get("Phone_mob_2"));
        System.out.println(EMAIL + map.get("Email"));
        System.out.println(SKYPE + map.get("Skype"));
        System.out.println(ADDRESS_INDEX + map.get("Index"));
        System.out.println(ADDRESS_CITY + map.get("City"));
        System.out.println(ADDRESS_STREET + map.get("Street"));
        System.out.println(ADDRESS_BUILDING + map.get("Building"));
        System.out.println(ADDRESS_APARTMENT + map.get("Apartment"));
        System.out.println(DATA_OF_ENTERING + map.get("Input"));
        System.out.println(DATA_LAST_CHANGES + map.get("Edited"));
        System.out.println("Is it correct (y/n)?");
        strInput = sc.nextLine();

        if (strInput.equals("y")) {
            model.setSurname(map.get("Surname"));
            model.setName(map.get("Name"));
            model.setPatronymic(map.get("Patronymic"));
            model.setNickname(map.get("Nickname"));
            model.setComment(map.get("Comment"));
            model.setGroup(map.get("Group"));
            model.setPhone_home(map.get("Phone_home"));
            model.setPhone_mob(map.get("Phone_mob"));
            model.setPhone_mob_2(map.get("Phone_mob_2"));
            model.setEmail(map.get("Email"));
            model.setSkype(map.get("Skype"));
            model.setIndex(map.get("Index"));
            model.setCity(map.get("City"));
            model.setStreet(map.get("Street"));
            model.setBuilding(map.get("Building"));
            model.setApartment(map.get("Apartment"));
            model.setInput_date(map.get("Input"));
            model.setEdited_date(map.get("Edited"));

        } else {
            System.out.println("ok. Please, restart the program");
        }

        System.out.println("Into MODEL written: ");
        System.out.println(model.nameCombining());
        System.out.println(model.getNickname());
        System.out.println(model.getComment());
        System.out.println(model.getGroup());
        System.out.println(model.getPhone_home());
        System.out.println(model.getPhone_mob());
        System.out.println(model.getPhone_mob_2());
        System.out.println(model.getEmail());
        System.out.println(model.getSkype());
        System.out.println(model.addressCombining());
        System.out.println(model.getInput_date());
        System.out.println(model.getEdited_date());
    }
}
