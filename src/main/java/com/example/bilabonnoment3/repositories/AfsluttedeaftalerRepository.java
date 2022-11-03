package com.example.bilabonnoment3.repositories;

import com.example.bilabonnoment3.SQL_Manager;
import com.example.bilabonnoment3.SQL_Models;
import com.example.bilabonnoment3.SQL_String;
import com.example.bilabonnoment3.models.Afsluttedeaftaler;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AfsluttedeaftalerRepository {
    SQL_Manager sqlManager = new SQL_Manager();
    SQL_String sqlString = new SQL_String();
    SQL_Models sqlModels = new SQL_Models();


    private final String database = "Afsluttedeaftaler";
    private  final String primaryKey = "Afslutid";

    private final String sections = "(AfslutId, kundeNavn, kundeTlf, kundeMail, kundeAdresse, bilId, " +
            "StartDato, SlutDato, afhentLokation, afleveringLokation)";

    public Afsluttedeaftaler getAfsluttedeaftaler(int afslutId){
        try{
            Statement stmt = sqlManager.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getData(database, primaryKey, String.valueOf(afslutId)));
            rs.next();
            return generateAsluttedeaftaler(rs);//skal have skiftet til en Generate-afsluttetaftaler
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    private Afsluttedeaftaler generateAsluttedeaftaler(ResultSet rs){
    try {
        return new Afsluttedeaftaler(
                rs.getInt("afslutId"),
                rs.getString("kundeNavn"),
                rs.getInt("kundeTlf"),
                rs.getString("kundeMail"),
                rs.getString("kundeAdresse"),
                rs.getInt("bilId"),
                rs.getInt("StartDato"),
                rs.getInt("SlutDato"),
                rs.getString("afhentLokation"),
                rs.getString("afleveringsLokation")
        );
    }catch (SQLException e){
        throw new RuntimeException(e);
    }}
}
