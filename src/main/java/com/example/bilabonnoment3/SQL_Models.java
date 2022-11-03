package com.example.bilabonnoment3;

import com.example.bilabonnoment3.models.Biler;
import com.example.bilabonnoment3.models.Lejeaftaler;

import java.sql.Date;

public class SQL_Models {
    public String generateValues(Object object){
        if(object instanceof Lejeaftaler){
            return generateLejeaftalerValues((Lejeaftaler) object);
        }
        if(object instanceof Biler){
            return generateBilerValues((Biler) object);
        }
        else {
            return "oof";
        }

    }



    public String generateLejeaftalerValues(Lejeaftaler lejeaftaler){
        return "('" + lejeaftaler.getLejeId() + "', '" +
                lejeaftaler.getKundeNavn() + "', '" +
                lejeaftaler.getKundeTlf() + "', '" +
                lejeaftaler.getKundeMail() + "', '" +
                lejeaftaler.getKundeAdresse() + "', '" +
                lejeaftaler.getBilId() + "', '" +
                lejeaftaler.getStartDato() + "', '" +
                lejeaftaler.getSlutDato() + "', '" +
                lejeaftaler.getAfhentLokation() + "', '" +
                lejeaftaler.getAfleveringsLokation() + "')";

    }

    public String generateBilerValues(Biler biler){
        return "('" + biler.getBilId() + "', '" +
                biler.getMaerke() + "', '" +
                biler.getModel() + "', '" +
                biler.getAargang() + "', '" +
                biler.getBraendstof() + "', '" +
                biler.getPris() + "')";

    }
}
