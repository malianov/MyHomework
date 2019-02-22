package task_3.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static task_3.model.Model.Group.*;

public class RegexChecker {

    static Pattern pattern;

    public static boolean checkGroup(String string) {
        if (string.equals(FRIENDS.name()) | string.equals(HOME.name()) | string.equals(UNIVERSITY.name()) | string.equals(WORK.name())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Checker(String type, String string) {

        if (type.equals("checkName")) {
            pattern = Pattern.compile("^[A-ZА-ЯҐІЇЄa-zа-яґіїє'\\-]{2,30}$");
        } else if (type.equals("checkNickName")) {
            pattern = Pattern.compile("^[A-ZА-ЯҐІЇЄa-zа-яґіїє'0-9\\-]{2,30}$");
        } else if (type.equals("checkComment")) {
            pattern = Pattern.compile("^[a]|[^a]$");
        } else if (type.equals("checkGroup")) {
            pattern = Pattern.compile("FRIENDS|HOME|UNIVERSITY|WORK");
        } else if (type.equals("checkPhone")) {
            pattern = Pattern.compile("^\\+38\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        } else if (type.equals("checkSecondMobPhone")) {
            pattern = Pattern.compile("^\\+38\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$|^(-)$");
        } else if (type.equals("checkEmail")) {
            pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$");
        } else if (type.equals("checkSkype")) {
            pattern = Pattern.compile("^[A-Za-z0-9_.]+$");
        } else if (type.equals("checkIndex")) {
            pattern = Pattern.compile("^[0-9]{5}+$");
        } else if (type.equals("checkCity")) {
            pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z- ]+$");
        } else if (type.equals("checkStreet")) {
            pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z0-9- ]+$");
        } else if (type.equals("checkBuilding")) {
            pattern = Pattern.compile("^[а-яА-ЯёЁa-zA-Z0-9- ]+$");
        } else if (type.equals("checkApartment")) {
            pattern = Pattern.compile("^[0-9]+$");
        } else if (type.equals("checkDate")) {
            pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$");
        }
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
