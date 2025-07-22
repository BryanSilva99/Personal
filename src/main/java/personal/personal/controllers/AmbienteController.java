package personal.personal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.personal.entities.Ambiente;
import personal.personal.services.AmbienteService;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class AmbienteController {

    @Autowired
    private AmbienteService ambienteService;

    @GetMapping
    public HashMap<String,Integer> obtenerAmbientes(){
        HashMap<String,Integer> ambientes = new HashMap<>();
        for(var ambiente:ambienteService.obtenerAmbientes()){
            ambientes.put(ambiente.getNombre(),ambiente.getNumeroUbicacion());
        }

        return ambientes;
    }

    @PostMapping
    public ResponseEntity<Ambiente> agregarAmbiente(@RequestBody Ambiente ambiente){
        return new ResponseEntity<Ambiente>(ambiente,HttpStatus.OK);
    }
}
