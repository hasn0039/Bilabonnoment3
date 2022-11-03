package com.example.bilabonnoment3.controllers;

import com.example.bilabonnoment3.models.Biler;
import com.example.bilabonnoment3.repositories.BilRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Controller
public class bilController {
    BilRepository bilRepository = new BilRepository();

    @GetMapping("/biler")
    public String viewAllBiler(Model model) {
        BilRepository bilRepository = new BilRepository();
        ArrayList<Biler> biler = bilRepository.getBilerList();
        model.addAttribute("biler", biler);
        return "biler";
    }

    @GetMapping("/opretbiler")
    public String opretbiler() {
        return "opretbiler";
    }

    @PostMapping("/opretbiler")
    public String opretBiler(WebRequest dataFromForm) {
        BilRepository bilRepository = new BilRepository();
        int bilId = Integer.parseInt(dataFromForm.getParameter("bilId"));
        String maerke = dataFromForm.getParameter("mærke");
        String model = dataFromForm.getParameter("model");
        int aargang = Integer.parseInt(dataFromForm.getParameter("årgang"));
        String braendstof = dataFromForm.getParameter("brændstof");
        int pris = Integer.parseInt(dataFromForm.getParameter("pris"));
        Biler bil = new Biler(bilId, maerke, model, aargang, braendstof, pris);
        bilRepository.opretBiler(bil);
        return "biler";
    }

    @GetMapping("/sletbil/{bilId}")
    public String deleteBil( @PathVariable(value = "bilId") int bilId) {
        bilRepository.sletBil(bilId);
        return "redirect:/biler";
    }
}
