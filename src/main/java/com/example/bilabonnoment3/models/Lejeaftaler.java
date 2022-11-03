package com.example.bilabonnoment3.models;
import java.sql.Date;

public class Lejeaftaler {
    int lejeId;
    String kundeNavn;
    int kundeTlf;
    String kundeMail;
    String kundeAdresse;
    int bilId;
    int startDato;
    int slutDato;
    String afhentLokation;
    String afleveringsLokation;

    public Lejeaftaler(int lejeId, String kundeNavn, int kundeTlf, String kundeMail, String kundeAdresse, int bilId, int startDato, int slutDato, String afhentLokation, String afleveringsLokation) {
        this.lejeId = lejeId;
        this.kundeNavn = kundeNavn;
        this.kundeTlf = kundeTlf;
        this.kundeMail = kundeMail;
        this.kundeAdresse = kundeAdresse;
        this.bilId = bilId;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.afhentLokation = afhentLokation;
        this.afleveringsLokation = afleveringsLokation;
    }

    public int getLejeId() {
        return lejeId;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public int getKundeTlf() {
        return kundeTlf;
    }

    public String getKundeMail() {
        return kundeMail;
    }

    public String getKundeAdresse() {
        return kundeAdresse;
    }

    public int getBilId() {
        return bilId;
    }

    public int getStartDato() {
        return startDato;
    }

    public int getSlutDato() {
        return slutDato;
    }

    public String getAfhentLokation() {
        return afhentLokation;
    }

    public String getAfleveringsLokation() {
        return afleveringsLokation;
    }

    public void setLejeId(int lejeId) {
        this.lejeId = lejeId;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public void setKundeTlf(int kundeTlf) {
        this.kundeTlf = kundeTlf;
    }

    public void setKundeMail(String kundeMail) {
        this.kundeMail = kundeMail;
    }

    public void setKundeAdresse(String kundeAdresse) {
        this.kundeAdresse = kundeAdresse;
    }

    public void setBilId(int bilId) {
        this.bilId = bilId;
    }

    public void setStartDato(int startDato) {
        this.startDato = startDato;
    }

    public void setSlutDato(int slutDato) {
        this.slutDato = slutDato;
    }

    public void setAfhentLokation(String afhentLokation) {
        this.afhentLokation = afhentLokation;
    }

    public void setAfleveringsLokation(String afleveringsLokation) {
        this.afleveringsLokation = afleveringsLokation;
    }

    @Override
    public String toString() {
        return "Lejeaftaler{" +
                "lejeId=" + lejeId +
                ", kundeNavn='" + kundeNavn + '\'' +
                ", kundeTlf=" + kundeTlf +
                ", kundeMail='" + kundeMail + '\'' +
                ", kundeAdresse='" + kundeAdresse + '\'' +
                ", bilId=" + bilId +
                ", startDato=" + startDato +
                ", slutDato=" + slutDato +
                ", afhentLokation='" + afhentLokation + '\'' +
                ", afleveringsLokation='" + afleveringsLokation + '\'' +
                '}';
    }
}
