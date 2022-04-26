package pe.edu.pucp.teledrama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ClienteController {
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

    @GetMapping("/elenco")
    public String homeElenco() {
        return "/administrador/elenco";
    }

    @GetMapping("/teatro")
    public String homeTeatro() {
        return "/administrador/teatro";
    }

    @GetMapping("/teatroMaps")
    public String homeTeatroMaps() {
        return "/administrador/teatroMaps";
    }

    @GetMapping("/index")
    public String homeCliente() {
        return "cliente/PaginaPrincipal";
    }

    @GetMapping("dashboard")
    public String dashboard() {
        return "operador/dashboard";
    }

    @GetMapping("obra")
    public String obra() {
        return "obras";
    }

    @GetMapping("carrito")
    public String carrito(){
        return "cliente/carritodecompras";
    }

}
