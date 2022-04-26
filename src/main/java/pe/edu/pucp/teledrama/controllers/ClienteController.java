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

    // Operador (No funcionan los estilos en el operador controller x alguna razon :'( )

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

    @GetMapping("crearObra")
    public String crearObra(){
        return "operador/crearObra";
    }

    @GetMapping("editarObra")
    public String editarObra(){
        return "operador/editarObra";
    }

    //Administrador

    @GetMapping("teatrosAdmi")
    public String teatrosAdmi(){
        return "administrador/teatro";
    }

//    @GetMapping("/teatro")
//    public String homeTeatro() {
//        return "/administrador/teatro";
//    }

    @GetMapping("salasTD")
    public String salasTeatro(){return "administrador/salas";}
    @GetMapping("salaX")
    public String salaX(){return "administrador/salaX";}

    @GetMapping("operadores")
    public String operadores(){return "administrador/operadores";}

    @GetMapping("clientes")
    public String clientes(){return "administrador/clientes";}

    @GetMapping("nuevoOperador")
    public String newOperador(){return "administrador/newOperador";}

    @GetMapping("crearTeatro")
    public String crearTeatro(){
        return "administrador/newTeatro";
    }

    @GetMapping("editarTeatro")
    public String editarTeatro(){
        return "administrador/editarTeatro";
    }

    @GetMapping("buscadorPrincipal")
    public String buscador(){
        return "cliente/buscadorPrincipal";
    }

    @GetMapping("/elenco")
    public String homeElenco() {
        return "/administrador/elenco";
    }



    @GetMapping("/teatroMaps")
    public String homeTeatroMaps() {
        return "/administrador/teatroMaps";
    }

    @GetMapping("/nuevoElenco")
    public String nuevoElenco() {
        return "/administrador/nuevoElenco";
    }

    @GetMapping("/editarElenco")
    public String editarElenco() {
        return "/administrador/editarElenco";
    }
    @GetMapping("/editarOperador")
    public String editarOperador() {
        return "/administrador/editarOperador";
    }




    @GetMapping("crearPerfil")
    public String crearPerfil(){
        return "cliente/crearPerfil";
    }

    @GetMapping("editarPerfil")
    public String editarPerfil(){
        return "cliente/editPerfil";
    }

    @GetMapping("Teatros")
    public String teatrosCliente(){
        return "cliente/teatros";
    }



    @GetMapping("descargaQR")
    public String descargarQR(){
        return "cliente/descargaQR";
    }

    @GetMapping("detallesObra")
    public String detallesObra(){
        return "cliente/detallesObra";
    }
    @GetMapping("historial")
    public String historialPedidos(){
        return "cliente/historial";
    }


}
