package com.example.bilabonnoment3.models;

public class Skader {

    int skadeId;
    String skadeRapport;
    int skadePris;
    int bilId;

    public Skader(){}

    public Skader(int skadeId, String skadeRapport, int skadePris, int bilId){
        this.skadePris=skadePris;
        this.skadeRapport=skadeRapport;
        this.bilId=bilId;
        this.skadeId=skadeId;
    }

    public int getSkadeId() {
        return skadeId;
    }

    public void setSkadeId(int skadeId) {
        this.skadeId = skadeId;
    }

    public String getSkadeRapport() {
        return skadeRapport;
    }

    public void setSkadeRapport(String skadeRapport) {
        this.skadeRapport = skadeRapport;
    }

    public int getSkadePris() {
        return skadePris;
    }

    public void setSkadePris(int skadePris) {
        this.skadePris = skadePris;
    }

    public int getBilId() {
        return bilId;
    }

    public void setBilId(int bilId) {
        this.bilId = bilId;
    }

    @Override
    public String toString() {
        return "Skader{" +
                "skadeId=" + skadeId +
                ", skadeRapport='" + skadeRapport + '\'' +
                ", skadePris=" + skadePris +
                ", bilId=" + bilId +
                '}';
    }
}
