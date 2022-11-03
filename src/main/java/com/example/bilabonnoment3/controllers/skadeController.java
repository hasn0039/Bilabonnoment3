package com.example.bilabonnoment3.controllers;

import com.example.bilabonnoment3.models.Skader;
import com.example.bilabonnoment3.repositories.SkadeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class skadeController {
    SkadeRepository skadeRepository = new SkadeRepository();
     @GetMapping("/skade")
    public String viewAllSkader(Model model){
         SkadeRepository skadeRepository = new SkadeRepository();
         ArrayList<Skader> skader = skadeRepository.getSkaderList();
         model.addAttribute("skader", skader);
            return "skade";
     }





}
