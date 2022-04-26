package pe.edu.pucp.teledrama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ClienteController {
    @GetMapping(value={"", "/"})
    public String home2() {
        return "news-single";
    }

    @GetMapping(value={"/ga"})
    public String home3() {
        return "/operador/dashboard";
    }

    @GetMapping("/administrador")
    public String homeAdmin() {
        return "/administrador/main";
    }

    @GetMapping("/aaaa")
    public String obras() {
        return "obras";
    }

    @GetMapping("/index")
    public String homeCliente() {
        return "cliente/index";
    }
}
