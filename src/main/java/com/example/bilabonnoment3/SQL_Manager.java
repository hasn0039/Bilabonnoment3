package com.example.bilabonnoment3;

import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class SQL_Manager {
    private Statement stmt;

private String dburl="jdbc:mysql://localhost:3306/bilabonnoment3";

private String dbuser="root";

private String dbpassword="pumpkin1";


    public Statement establishConnection(){ //her laver jeg en metode som forbinder til database
        //jeg har lavet den private og returnerer statement objektet så jeg kan bruge det i andre metoder
        try {
            //jeg lave en try for at kunne læse fra application.properties filen
            /*Properties properties = new Properties();
            properties.load(propertiesFiles);
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");*/
            Connection con = DriverManager.getConnection(dburl, dbuser, dbpassword);
            //her laver jeg en connection til databasen
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //her laver jeg et statement objekt som jeg kan bruge til at sende sql kommandoer til databasen
            //type scroll insensitive gør at jeg kan scrolle igennem resultsettet
            //concur read only gør at jeg ikke kan ændre i databasen
        }catch (SQLException e){
            e.printStackTrace();
        }
        return stmt;
    }


}
