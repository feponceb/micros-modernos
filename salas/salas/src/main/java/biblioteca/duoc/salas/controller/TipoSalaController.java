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

import biblioteca.duoc.salas.model.TipoSala;
import biblioteca.duoc.salas.service.TipoSalaService;

@RestController
@RequestMapping("api/tipoSalas")
public class TipoSalaController {
    
    @Autowired
    private TipoSalaService tipoSalaService;

    @GetMapping
    public List<TipoSala> findAllSalas(){
        return tipoSalaService.findAll();
    }

    @GetMapping("/{id}")
    public TipoSala getTipoSalaById(@PathVariable Long id){
        return tipoSalaService.findById(id);
    }

    @PostMapping
    public TipoSala createTipoSala(@RequestBody TipoSala tipoSala){
        return tipoSalaService.save(tipoSala);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        tipoSalaService.deleteById(id);
    }

}
