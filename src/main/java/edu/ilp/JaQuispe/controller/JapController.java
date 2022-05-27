package edu.ilp.JaQuispe.controller;

import edu.ilp.JaQuispe.entity.Curso;
import edu.ilp.JaQuispe.entity.Estidiante;
import edu.ilp.JaQuispe.entity.Persona;
import edu.ilp.JaQuispe.service.ICursoService;
import edu.ilp.JaQuispe.service.IEstudianteSevice;
import edu.ilp.JaQuispe.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class JapController {
   @Autowired
    private IPersonaService personaService;
   @Autowired
   private ICursoService cursoService;
   @GetMapping("/lisatarpersona")
    public List<Persona> listarPer(){
       return this.personaService.listarPersona();
   }
   @Autowired
    private IEstudianteSevice estudianteSevice;
   @GetMapping("/buscar")
    public Estidiante buscarPorCodigo(@RequestParam String codigo){
       return this.estudianteSevice.buscaPorCodigp(codigo);
   }
   @GetMapping("/buscarp/{nom}")
    public List<Persona>listarPorNombre(@PathVariable String nom){
       return this.personaService.listarPorNombre(nom);
   }

   @GetMapping("/buscarc/{nom}")
    public List<Curso>listarPorcu(@PathVariable String nom){
        return this.cursoService.listarPorNombre(nom);
    }
}
