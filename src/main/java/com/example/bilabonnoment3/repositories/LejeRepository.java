package com.example.bilabonnoment3.repositories;

import com.example.bilabonnoment3.SQL_Manager;
import com.example.bilabonnoment3.SQL_Models;
import com.example.bilabonnoment3.SQL_String;
import com.example.bilabonnoment3.models.Lejeaftaler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LejeRepository {
    SQL_Manager sqlManager = new SQL_Manager();
    SQL_String sqlString = new SQL_String();
    SQL_Models sqlModels = new SQL_Models();
    private final String database = "Lejeaftaler";
    private final String primaryKey = "LejeId";
    private final String sections = " (LejeId, KundeNavn, KundeTlf, KundeMail, KundeAdresse, BilId, " +
            "StartDato, SlutDato, AfhentLokation, AfleveringsLokation) ";

    public Lejeaftaler getLejeaftaler(int lejeId){
        try {
            Statement stmt = sqlManager.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getData(database, primaryKey, String.valueOf(lejeId)));
            //it returns a string with the sql query to get a specific row from a table
            //query er sql kode der henter en specifik række fra en tabel
            rs.next();
            return generatesubscribtion(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Lejeaftaler opretLejeaftale(Lejeaftaler lejeaftaler){
        try {
            Statement stmt = sqlManager.establishConnection();
            stmt.executeUpdate(sqlString.createData(database, sections, sqlModels.generateLejeaftalerValues(lejeaftaler)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
return lejeaftaler;
    }

    private Lejeaftaler generatesubscribtion(ResultSet rs) {
        try {
            return new Lejeaftaler(
                    rs.getInt("LejeId"),
                    rs.getString("KundeNavn"),
                    rs.getInt("KundeTlf"),
                    rs.getString("KundeMail"),
                    rs.getString("KundeAdresse"),
                    rs.getInt("BilId"),
                    rs.getInt("StartDato"),
                    rs.getInt("SlutDato"),
                    rs.getString("AfhentLokation"),
                    rs.getString("AfleveringsLokation")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Lejeaftaler> getLejeaftalerList(){
        ArrayList<Lejeaftaler> lejeaftaler = new ArrayList<>();
        try {
            Statement stmt = sqlManager.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getDataList(database, primaryKey));
            while(rs.next()){
                lejeaftaler.add(generatesubscribtion(rs));
            }
            return lejeaftaler;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void sletLejeaftale(int lejeId){
        try {
            Statement stmt = sqlManager.establishConnection();
            stmt.executeUpdate(sqlString.deleteData(database, primaryKey, String.valueOf(lejeId)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void redigerLejeaftale(Lejeaftaler lejeaftaler){
        try {
            Statement stmt = sqlManager.establishConnection();
            stmt.executeUpdate(sqlString.updateData(database, "KundeNavn", lejeaftaler.getKundeNavn(), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "KundeTlf", String.valueOf(lejeaftaler.getKundeTlf()), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "KundeMail", lejeaftaler.getKundeMail(), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "KundeAdresse", lejeaftaler.getKundeAdresse(), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "BilId", String.valueOf(lejeaftaler.getBilId()), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "StartDato", String.valueOf(lejeaftaler.getStartDato()), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "SlutDato", String.valueOf(lejeaftaler.getSlutDato()), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "AfhentLokation", lejeaftaler.getAfhentLokation(), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
            stmt.executeUpdate(sqlString.updateData(database, "AfleveringsLokation", lejeaftaler.getAfleveringsLokation(), primaryKey, String.valueOf(lejeaftaler.getLejeId())));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




    /*public int getId() throws SQLException{
        PreparedStatement pstms = JDBC
    }*/

}


