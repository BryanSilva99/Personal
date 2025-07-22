package personal.personal.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import personal.personal.entities.Objeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personal.personal.services.ObjetoServiceImpl;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ObjetoController {

    @Autowired
    private ObjetoServiceImpl objetoServiceImpl;

    @GetMapping("/listaObjetos")
    public HashMap<String,Integer> mostrarObejetos(){
        HashMap<String,Integer> objetos = new HashMap<>();
        for(var objeto:objetoServiceImpl.obtenerObjetos()){
            objetos.put(objeto.getNombre(),objeto.getCantidad());
        }
        return objetos;
    }


    @PostMapping("/agregarObjeto")
    public ResponseEntity<Objeto> agregarObjeto(@RequestBody Objeto objeto){
        objetoServiceImpl.agregarObjeto(objeto);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

}


