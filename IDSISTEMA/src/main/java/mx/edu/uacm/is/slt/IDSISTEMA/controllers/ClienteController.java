package mx.edu.uacm.is.slt.IDSISTEMA.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @PostMapping("/registrar")
    public String registrarCliente(
            @RequestParam String curp,
            @RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam String direccion,
            @RequestParam Date fechaNacimiento) {
        
        return "Simulación: Cliente con CURP " + curp + " registrado correctamente.";
    }

    @PutMapping("/modificar/{curp}")
    public String modificarCliente(
            @PathVariable String curp,
            @RequestParam String direccion) {
        
        return "Simulación: Dirección del cliente con CURP " + curp + " modificada a: " + direccion;
    }
}