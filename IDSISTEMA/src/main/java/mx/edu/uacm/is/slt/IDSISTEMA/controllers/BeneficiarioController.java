package mx.edu.uacm.is.slt.IDSISTEMA.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/beneficiarios")
public class BeneficiarioController {

    @PostMapping("/registrar")
    public String registrarBeneficiario(
            @RequestParam String clavePoliza,
            @RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam int porcentaje) {
        
        return "Simulación: Beneficiario " + nombres + " " + apellidos + " agregado a la póliza " + clavePoliza + " con " + porcentaje + "%";
    }

    @DeleteMapping("/eliminar/{clavePoliza}/{nombre}")
    public String eliminarBeneficiario(
            @PathVariable String clavePoliza,
            @PathVariable String nombre) {
        
        return "Simulación: Beneficiario " + nombre + " eliminado de la póliza " + clavePoliza;
    }
}