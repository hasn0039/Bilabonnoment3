package com.example.bilabonnoment3.repositories;

import com.example.bilabonnoment3.SQL_Manager;
import com.example.bilabonnoment3.SQL_Models;
import com.example.bilabonnoment3.SQL_String;
import com.example.bilabonnoment3.models.Biler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BilRepository {

    SQL_Manager sql = new SQL_Manager();
    SQL_String sqlString = new SQL_String();
    SQL_Models sqlModels = new SQL_Models();
    SQL_Manager sqlManager = new SQL_Manager();

    private final String database = "Biler";
    private final String primaryKey = "BilId";
    private final String sections = " (BilId, Mærke, Model, Årgang, Brændstof, Pris) ";

    public Biler opretBiler(Biler biler) {
        try {
            Statement stmt = sqlManager.establishConnection();
            stmt.executeUpdate(sqlString.createData(database, sections, sqlModels.generateBilerValues(biler)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return biler;
    }

    public void sletBil(int bilId){
        try {
            Statement stmt = sqlManager.establishConnection();
            stmt.executeUpdate(sqlString.deleteData(database, primaryKey, String.valueOf(bilId)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Biler getBiler(int bilId){
        try {
            Statement stmt = sql.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getData(database, primaryKey, String.valueOf(bilId)));
            rs.next();
            return generateBiler(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private Biler generateBiler(ResultSet rs) {
        try{
            return new Biler(
                    rs.getInt("BilId"),
                    rs.getString("Mærke"),
                    rs.getString("Model"),
                    rs.getInt("Årgang"),
                    rs.getString("Brændstof"),
                    rs.getInt("Pris")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Biler> getBilerList(){
        ArrayList<Biler> biler = new ArrayList<>();
        try {
            Statement stmt = sql.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getDataList(database, primaryKey));
            while(rs.next()){
                biler.add(generateBiler(rs));
            }
            return biler;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
