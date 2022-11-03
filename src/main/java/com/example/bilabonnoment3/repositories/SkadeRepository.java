package com.example.bilabonnoment3.repositories;

import com.example.bilabonnoment3.SQL_Manager;
import com.example.bilabonnoment3.SQL_Models;
import com.example.bilabonnoment3.SQL_String;
import com.example.bilabonnoment3.models.Biler;
import com.example.bilabonnoment3.models.Skader;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SkadeRepository {
    SQL_Manager sql = new SQL_Manager();
    SQL_String sqlString = new SQL_String();
    SQL_Models sqlModels = new SQL_Models();
    SQL_Manager sqlManager = new SQL_Manager();

    private final String database = "Skader";
    private final String primaryKey = "skadeId";
    private final String sections = " (skadeId, skadeRapport, skadePris, bilId)";
    public ArrayList<Skader> getSkaderList(){
        ArrayList<Skader> skader = new ArrayList<>();
        try{
            Statement stmt = sql.establishConnection();
            ResultSet rs = stmt.executeQuery(sqlString.getDataList(database, primaryKey));
            while(rs.next()){
                skader.add(generateSkader(rs));
            }
            return skader;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private Skader generateSkader(ResultSet rs) {
        try{
            return new Skader(
                    rs.getInt("skadeId"),
                    rs.getString("skadeRapport"),
                    rs.getInt("skadePris"),
                    rs.getInt("bilId")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
