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

    @GetMapping("/login")
    public String home() {
        return "/cliente/login/login";}

    @GetMapping(value={"", "/"})
    public String home1() {
        return "news-single";}

    @GetMapping("vigente")
    public String home2() {
        return "/cliente/detalledecompras2";
    }
    @GetMapping(value={"/ga"})
    public String home3() {
        return "/operador/dashboard";}

    @GetMapping("cancelado")
    public String home2detalle() {
        return "/cliente/detalledecompra3";
    }

    @GetMapping("asistido")
    public String homedetalle() {
        return "/cliente/detalledecompra4";
    }
    @GetMapping("/register")
    public String home5() {
        return "/cliente/login/register";
    }
    @GetMapping("/contraseña")
    public String password1() {
        return "/cliente/login/contraseña1";
    }
    @GetMapping("/contraseñaNew")
    public String password() {
        return "/cliente/login/recuperar_contraseña";
    }
    @GetMapping("/home")
    public String home6() {
        return "/cliente/home";
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

    @GetMapping("carrito")
    public String carrito(){
        return "cliente/carritodecompras";
    }
    @GetMapping("obrasList")
    public String listadeobras(){
        return "cliente/listadeobras";
    }


    // Operador (No funciona en el operador controller :'( )

    @GetMapping("dashboard")
    public String dashboard() {
        return "operador/dashboard";
    }

    @GetMapping("obras")
    public String obras() {
        return "operador/obras";
    }

    @GetMapping("detalleobra")
    public String obraDetalle() {
        return "operador/obraDetalles";
    }

    @GetMapping("teatros")
    public String teatros() {
        return "operador/teatros";
    }

    @GetMapping("teatrosAdmi")
    public String teatrosAdmi(){
        return "administrador/teatro";
    }


}
