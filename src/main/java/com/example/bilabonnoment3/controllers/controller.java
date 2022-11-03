package com.example.bilabonnoment3.controllers;

import com.example.bilabonnoment3.models.Biler;
import com.example.bilabonnoment3.models.Lejeaftaler;
import com.example.bilabonnoment3.repositories.BilRepository;
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

public class controller {

    @GetMapping("/forside")
    public String forside1() {
        return "forside";
    }



    @GetMapping("/")
    public String forside() {
        return "forside";
    }



    @GetMapping("/skader")
    public String skader() {
        return "skader";
    }
}

/*  @GetMapping("/lejeaftaler")
    public String lejeaftaler() {
        return "lejeaftaler";
    }*/

