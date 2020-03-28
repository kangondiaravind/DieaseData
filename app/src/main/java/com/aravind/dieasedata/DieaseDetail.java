package com.aravind.dieasedata;

class DieaseDetail {
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String disease_id;
    private String disease_name;
    private String month;
    private String month_letter;
    private String cattle;
    private String buaffalo;
    private String goat;
    private String sheep;
    private String pig;
    private String predicted;
    private String outcome;

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(String disease_id) {
        this.disease_id = disease_id;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth_letter() {
        return month_letter;
    }

    public void setMonth_letter(String month_letter) {
        this.month_letter = month_letter;
    }

    public String getCattle() {
        return cattle;
    }

    public void setCattle(String cattle) {
        this.cattle = cattle;
    }

    public String getBuaffalo() {
        return buaffalo;
    }

    public void setBuaffalo(String buaffalo) {
        this.buaffalo = buaffalo;
    }

    public String getGoat() {
        return goat;
    }

    public void setGoat(String goat) {
        this.goat = goat;
    }

    public String getSheep() {
        return sheep;
    }

    public void setSheep(String sheep) {
        this.sheep = sheep;
    }

    public String getPig() {
        return pig;
    }

    public void setPig(String pig) {
        this.pig = pig;
    }

    public String getPredicted() {
        return predicted;
    }

    public void setPredicted(String predicted) {
        this.predicted = predicted;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "DieaseDetail{" +
                "state_id='" + state_id + '\'' +
                ", state_name='" + state_name + '\'' +
                ", district_id='" + district_id + '\'' +
                ", district_name='" + district_name + '\'' +
                ", disease_id='" + disease_id + '\'' +
                ", disease_name='" + disease_name + '\'' +
                ", month='" + month + '\'' +
                ", month_letter='" + month_letter + '\'' +
                ", cattle='" + cattle + '\'' +
                ", buaffalo='" + buaffalo + '\'' +
                ", goat='" + goat + '\'' +
                ", sheep='" + sheep + '\'' +
                ", pig='" + pig + '\'' +
                ", predicted='" + predicted + '\'' +
                ", outcome='" + outcome + '\'' +
                '}';
    }
}
