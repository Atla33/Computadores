package com.example.computadores.controller;

import com.example.computadores.domain.Computador;
import com.example.computadores.service.ComputadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComputadorController {

    private ComputadorService service;

    public ComputadorController(ComputadorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/cadastrar")
    public String doCadastrar(Model model){
        Computador c = new Computador();
        model.addAttribute("computador", c);

        return "cadastrar";

    }

    @PostMapping("/salvar")
    public String doSalvaFilme(@ModelAttribute Computador c){
        service.update(c);
        return "redirect:/";
    }
}
