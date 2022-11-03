package com.example.bilabonnoment3.controllers;

import com.example.bilabonnoment3.models.Lejeaftaler;
import com.example.bilabonnoment3.repositories.LejeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class lejeController {
    LejeRepository lejeRepository = new LejeRepository();
    @GetMapping("/opretlejeaftale")
    public String opretlejeaftale() {
        return "opretlejeaftale";
    }

    @PostMapping("/opretlejeaftale")
    public String opretLejeaftale(HttpSession session, WebRequest dataFromForm) {
        LejeRepository lejeRepository = new LejeRepository();
        int lejeId = Integer.parseInt(dataFromForm.getParameter("lejeId"));
        String kundeNavn = dataFromForm.getParameter("kundeNavn");
        int kundeTlf = Integer.parseInt(dataFromForm.getParameter("kundeTlf"));
        String kundeEmail = dataFromForm.getParameter("kundeEmail");
        String kundeAdresse = dataFromForm.getParameter("kundeAdresse");
        int bilId = Integer.parseInt(dataFromForm.getParameter("bilId"));
        int startDato = Integer.parseInt(dataFromForm.getParameter("startDato"));
        int slutDato = Integer.parseInt(dataFromForm.getParameter("slutDato"));
        String afhentLokation = dataFromForm.getParameter("afhentLokation");
        String afleveringsLokation = dataFromForm.getParameter("afleveringsLokation");
        Lejeaftaler aftaler = new Lejeaftaler(lejeId, kundeNavn, kundeTlf, kundeEmail, kundeAdresse, bilId, startDato, slutDato,
                afhentLokation, afleveringsLokation);
        lejeRepository.opretLejeaftale(aftaler);
        return "redirect:/lejeaftaler";
    }


    @GetMapping("/lejeaftaler")
    public String viewAllRentals(Model model) {
        ArrayList<Lejeaftaler> lejeaftaler = lejeRepository.getLejeaftalerList();
        model.addAttribute("lejeaftaler", lejeaftaler);
        return "lejeaftaler";
    }
    //@pathvariables henter data fra formen og sender videre til metoden deleteLejeaftale
    @GetMapping("/slet/{lejeId}")
    public String deleteLejeaftale( @PathVariable(value = "lejeId") int lejeId) {
        lejeRepository.sletLejeaftale(lejeId);
        return "redirect:/lejeaftaler";
    }

    @GetMapping ("/rediger/{lejeId}")
    public String redigerLejeaftale(@PathVariable(value = "lejeId") int lejeId, Model model) {
        Lejeaftaler lejeaftaler = lejeRepository.getLejeaftaler(lejeId);
        model.addAttribute("lejeaftaler", lejeaftaler);
        return "rediger";
    }

    /*@PostMapping("/rediger/{lejeId}")
    public String redigeringLejeaftale(HttpSession session, WebRequest dataFromForm, @PathVariable(value = "lejeId") int lejeId) {
        lejeRepository.redigerLejeaftale(lejeId);

        String kundeNavn = dataFromForm.getParameter("kundeNavn");
        int kundeTlf = Integer.parseInt(dataFromForm.getParameter("kundeTlf"));
        String kundeEmail = dataFromForm.getParameter("kundeEmail");
        String kundeAdresse = dataFromForm.getParameter("kundeAdresse");
        int bilId = Integer.parseInt(dataFromForm.getParameter("bilId"));
        int startDato = Integer.parseInt(dataFromForm.getParameter("startDato"));
        int slutDato = Integer.parseInt(dataFromForm.getParameter("slutDato"));
        String afhentLokation = dataFromForm.getParameter("afhentLokation");
        String afleveringsLokation = dataFromForm.getParameter("afleveringsLokation");
        Lejeaftaler aftaler = new Lejeaftaler(lejeId, kundeNavn, kundeTlf, kundeEmail, kundeAdresse, bilId, startDato, slutDato,
                afhentLokation, afleveringsLokation);
        lejeRepository.opretLejeaftale(aftaler);
        return "redirect:/lejeaftaler";
    }*/
}
