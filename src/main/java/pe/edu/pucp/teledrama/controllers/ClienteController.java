package pe.edu.pucp.teledrama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ClienteController {

    @GetMapping("")
    public String home() {
        return "/cliente/home";
    }

    @GetMapping("/administrador")
    public String homeAdmin() {
        return "/administrador/main";
    }

}
