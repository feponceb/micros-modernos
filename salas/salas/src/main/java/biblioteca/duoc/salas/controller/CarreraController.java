package biblioteca.duoc.salas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.duoc.salas.model.Carrera;
import biblioteca.duoc.salas.service.CarreraService;

@RestController
@RequestMapping
public class CarreraController {
    
    @Autowired
    private CarreraService salaService;

    @GetMapping
    public List<Carrera> findAllSalas(){
        return salaService.findAll();
    }

    @GetMapping("/{id}")
    public Carrera getTipoSalaById(@PathVariable String id){
        return salaService.findById(id);
    }

    @PostMapping
    public Carrera createTipoSala(@RequestBody Carrera sala){
        return salaService.save(sala);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        salaService.deleteById(id);
    }

}
