package pe.edu.pucp.teledrama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "operador")
public class OperadorController {

    @GetMapping(value = {"", "dashboard"})
    public String dashboard() {
        return "operador/dashboard";
    }

    @GetMapping("obras")
    public String obras() {
        return "obraDetalles";
    }

    @GetMapping("teatros")
    public String teatros() {
        return "operador/teatros";
    }

}
