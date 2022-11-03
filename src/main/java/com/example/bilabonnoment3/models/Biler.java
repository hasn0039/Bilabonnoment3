package com.example.bilabonnoment3.models;

public class Biler {
    int bilId;
    String maerke;
    String model;
    int aargang;
    String braendstof;
    int pris;

    public Biler(){}

    public Biler(int bilId, String mærke, String model, int årgang, String brændstof, int pris) {
        this.bilId = bilId;
        this.maerke = mærke;
        this.model = model;
        this.aargang = årgang;
        this.braendstof = brændstof;
        this.pris = pris;
    }

    public int getBilId() {
        return bilId;
    }

    public void setBilId(int bilId) {
        this.bilId = bilId;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String mærke) {
        this.maerke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int årgang) {
        this.aargang = årgang;
    }

    public String getBraendstof() {
        return braendstof;
    }

    public void setBraendstof(String brændstof) {
        this.braendstof = brændstof;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Biler{" +
                "bilId=" + bilId +
                ", mærke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + aargang +
                ", brændstof='" + braendstof + '\'' +
                ", pris=" + pris +
                '}';
    }
}

