package task_3.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static task_3.model.Model.Group.*;

public class RegexChecker {


    public static boolean checkName(String string) {
        Pattern pattern = Pattern.compile("^[A-ZА-ЯҐІЇЄa-zа-яґіїє'0-9\\-]{2,30}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkGroup(String string) {
        if (string.equals(FRIENDS.name()) | string.equals(HOME.name()) | string.equals(UNIVERSITY.name()) | string.equals(WORK.name())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkComment(String string) {
        Pattern pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z0-9 ]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkPhone(String string) {
        Pattern pattern = Pattern.compile("^\\+38\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkSecondMobPhone(String string) {
        Pattern pattern = Pattern.compile("^\\+38\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$|^(.)$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkEmail(String string) {
        Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkSkype(String string) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_.]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkIndex(String string) {
        Pattern pattern = Pattern.compile("^[0-9]{5}+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkCity(String string) {
        Pattern pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z- ]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkStreet(String string) {
        Pattern pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z0-9- ]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkBuilding(String string) {
        Pattern pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z0-9- ]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkAppartment(String string) {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean checkDate(String string) {
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
