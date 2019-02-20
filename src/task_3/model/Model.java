package task_3.model;

import java.util.Date;

public class Model {
    private String surname;
    private String name;
    private String patronymic;
    private String combinedName;
    private String nickname;
    private String comment;
    private String group;
    private String phone_home;
    private String phone_mob;
    private String phone_mob_2 = "-";
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String building;
    private String apartament;
    private String combinedAddress;


    private String input_date;
    private String edited_date;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronomic) {
        this.patronymic = patronomic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone_home() {
        return phone_home;
    }

    public void setPhone_home(String phone_home) {
        this.phone_home = phone_home;
    }

    public String getPhone_mob() {
        return phone_mob;
    }

    public void setPhone_mob(String phone_mob) {
        this.phone_mob = phone_mob;
    }

    public String getPhone_mob_2() {
        return phone_mob_2;
    }

    public void setPhone_mob_2(String phone_mob_2) {
        this.phone_mob_2 = phone_mob_2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartament;
    }

    public void setApartment(String apartament) {
        this.apartament = apartament;
    }

    public String getInput_date() {
        return input_date;
    }

    public void setInput_date(String input_date) {
        this.input_date = input_date;
    }

    public String getEdited_date() {
        return edited_date;
    }

    public void setEdited_date(String edited_date) {
        this.edited_date = edited_date;
    }

    public String nameCombining() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.surname)
                .append(" ")
                .append(this.name, 0, 1)
                .append(".")
                .append(this.patronymic, 0, 1)
                .append(".");
        return sb.toString();
    }

    public String addressCombining() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.index)
                .append(", ")
                .append(this.city)
                .append(", ")
                .append(this.street)
                .append(", ")
                .append(this.building)
                .append(", ")
                .append(this.apartament)
                .append(".");
        return sb.toString();
    }

    public enum Group {
        HOME,
        WORK,
        UNIVERSITY,
        FRIENDS
    }


}