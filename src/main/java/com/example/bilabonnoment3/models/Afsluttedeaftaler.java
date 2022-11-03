package com.example.bilabonnoment3.models;

public class Afsluttedeaftaler {
    int afslutId;
    String kundeNavn;
    int kundeTlf;
    String kundeMail;
    String kundeAdresse;
    int bilId;
    int StartDato;
    int SlutDato;
    String afhentLokation;
    String afleveringsLokation;


    public Afsluttedeaftaler(int afslutId, String kundeNavn, int kundeTlf, String kundeMail, String kundeAdresse, int bilId, int startDato, int slutDato, String afhentLokation, String afleveringsLokation) {
        this.afslutId = afslutId;
        this.kundeNavn = kundeNavn;
        this.kundeTlf = kundeTlf;
        this.kundeMail = kundeMail;
        this.kundeAdresse = kundeAdresse;
        this.bilId = bilId;
        StartDato = startDato;
        SlutDato = slutDato;
        this.afhentLokation = afhentLokation;
        this.afleveringsLokation = afleveringsLokation;
    }

    public int getAfslutId() {
        return afslutId;
    }

    public void setAfslutId(int afslutId) {
        this.afslutId = afslutId;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public int getKundeTlf() {
        return kundeTlf;
    }

    public void setKundeTlf(int kundeTlf) {
        this.kundeTlf = kundeTlf;
    }

    public String getKundeMail() {
        return kundeMail;
    }

    public void setKundeMail(String kundeMail) {
        this.kundeMail = kundeMail;
    }

    public String getKundeAdresse() {
        return kundeAdresse;
    }

    public void setKundeAdresse(String kundeAdresse) {
        this.kundeAdresse = kundeAdresse;
    }

    public int getBilId() {
        return bilId;
    }

    public void setBilId(int bilId) {
        this.bilId = bilId;
    }

    public int getStartDato() {
        return StartDato;
    }

    public void setStartDato(int startDato) {
        StartDato = startDato;
    }

    public int getSlutDato() {
        return SlutDato;
    }

    public void setSlutDato(int slutDato) {
        SlutDato = slutDato;
    }

    public String getAfhentLokation() {
        return afhentLokation;
    }

    public void setAfhentLokation(String afhentLokation) {
        this.afhentLokation = afhentLokation;
    }

    public String getAfleveringsLokation() {
        return afleveringsLokation;
    }

    public void setAfleveringsLokation(String afleveringsLokation) {
        this.afleveringsLokation = afleveringsLokation;
    }


}
