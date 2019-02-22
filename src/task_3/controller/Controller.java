package task_3.controller;

import task_3.model.Model;
import task_3.view.View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static task_3.controller.RegexChecker.Checker;
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

    public void userInput(String exactData, String errorMessage, String mapDataName, Scanner sc, String checkSmth) {
        view.showMessage(exactData);
        do {
            strInput = sc.nextLine();
            if (!Checker(checkSmth, strInput)) {
                view.showMessage(errorMessage);
                continue;
            } else {
                map.put(mapDataName, strInput);
                break;
            }
        } while (true);
    }

    public void processUserInput() {
        view.showMessage(INVITATION);
        Scanner sc = new Scanner(System.in);

        userInput(SURNAME,      INPUT_ERROR,"Surname",      sc, "checkName");
        userInput(NAME,         INPUT_ERROR,"Name",         sc, "checkName");
        userInput(PATRONYMIC,   INPUT_ERROR,"Patronymic",   sc, "checkName");
        userInput(NICKNAME,     INPUT_ERROR,"Nickname",     sc, "checkNickName");
        userInput(COMMENT,      INPUT_ERROR,"Comment",      sc, "checkComment");
        userInput(GROUP         + GROUP_ADVICE,   INPUT_ERROR + GROUP_ADVICE,"Group",         sc,         "checkGroup");
        userInput(PHONE_HOME    + PHONE_ADVICE,   INPUT_ERROR + PHONE_ADVICE,"Phone_home",    sc,         "checkPhone");
        userInput(PHONE_MOB     + PHONE_ADVICE,   INPUT_ERROR + PHONE_ADVICE,"Phone_mob",     sc,         "checkPhone");
        userInput(PHONE_MOB_2   + PHONE_ADVICE + OR_NOT,  INPUT_ERROR + PHONE_ADVICE + OR_NOT,"Phone_mob_2", sc,  "checkSecondMobPhone");
        userInput(EMAIL,        INPUT_ERROR,"Email", sc, "checkEmail");
        userInput(SKYPE,        INPUT_ERROR,"Skype", sc, "checkSkype");
        userInput(ADDRESS_INDEX,ADDRESS_INDEX   + INPUT_ERROR,"Index",  sc, "checkIndex");
        userInput(ADDRESS_CITY, ADDRESS_CITY    + INPUT_ERROR,"City",   sc, "checkCity");
        userInput(ADDRESS_STREET,       ADDRESS_STREET      + INPUT_ERROR,"Street",       sc, "checkStreet");
        userInput(ADDRESS_BUILDING,     ADDRESS_BUILDING    + INPUT_ERROR,"Building",   sc, "checkBuilding");
        userInput(ADDRESS_APARTMENT,    ADDRESS_APARTMENT   + INPUT_ERROR,"Apartment",  sc, "checkApartment");
        userInput(DATA_OF_ENTERING,     DATA_OF_ENTERING    + INPUT_ERROR,"Input",      sc, "checkDate");
        userInput(DATA_LAST_CHANGES,    DATA_LAST_CHANGES   + INPUT_ERROR,"Edited",     sc, "checkDate");



        System.out.println("Please, check entered information: ");
        System.out.println(SURNAME              + map.get("Surname"));
        System.out.println(NAME                 + map.get("Name"));
        System.out.println(PATRONYMIC           + map.get("Patronymic"));
        System.out.println(NICKNAME             + map.get("Nickname"));
        System.out.println(COMMENT              + map.get("Comment"));
        System.out.println(GROUP                + map.get("Group"));
        System.out.println(PHONE_HOME           + map.get("Phone_home"));
        System.out.println(PHONE_MOB            + map.get("Phone_mob"));
        System.out.println(PHONE_MOB_2          + map.get("Phone_mob_2"));
        System.out.println(EMAIL                + map.get("Email"));
        System.out.println(SKYPE                + map.get("Skype"));
        System.out.println(ADDRESS_INDEX        + map.get("Index"));
        System.out.println(ADDRESS_CITY         + map.get("City"));
        System.out.println(ADDRESS_STREET       + map.get("Street"));
        System.out.println(ADDRESS_BUILDING     + map.get("Building"));
        System.out.println(ADDRESS_APARTMENT    + map.get("Apartment"));
        System.out.println(DATA_OF_ENTERING     + map.get("Input"));
        System.out.println(DATA_LAST_CHANGES    + map.get("Edited"));


        System.out.println("Is it correct (y/n)?");
        strInput = sc.nextLine();

        if (strInput.equals("y")) {
            model.setSurname(       map.get("Surname"));
            model.setName(          map.get("Name"));
            model.setPatronymic(    map.get("Patronymic"));
            model.setNickname(      map.get("Nickname"));
            model.setComment(       map.get("Comment"));
            model.setGroup(         map.get("Group"));
            model.setPhone_home(    map.get("Phone_home"));
            model.setPhone_mob(     map.get("Phone_mob"));
            model.setPhone_mob_2(   map.get("Phone_mob_2"));
            model.setEmail(         map.get("Email"));
            model.setSkype(         map.get("Skype"));
            model.setIndex(         map.get("Index"));
            model.setCity(          map.get("City"));
            model.setStreet(        map.get("Street"));
            model.setBuilding(      map.get("Building"));
            model.setApartment(     map.get("Apartment"));
            model.setInput_date(    map.get("Input"));
            model.setEdited_date(   map.get("Edited"));

        } else {
            System.out.println("ok. Please, restart the program to write your changes.");
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
