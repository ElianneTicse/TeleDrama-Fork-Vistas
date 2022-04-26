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

    @GetMapping("detalle")
    public String hom1() {
        return "/cliente/detallestickets";
    }

    @GetMapping("vigente")
    public String home1() {
        return "/cliente/detalledecompras2";
    }

    @GetMapping("cancelado")
    public String home2detalle() {
        return "/cliente/detalledecompra3";
    }

    @GetMapping("asistido")
    public String homedetalle() {
        return "/cliente/detalledecompra4";
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
