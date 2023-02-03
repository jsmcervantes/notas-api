package notas.api_notas.notas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/notas")
@CrossOrigin({"*"})
public class NotasController {
    @Autowired NotasService notasService;

    @GetMapping("/")
    public List<Notas> findAll(){
        return notasService.findAll();
    }

    @GetMapping("/{id}")
    public Notas findById(@PathVariable Long id){
        return notasService.findById(id);
    }

    @PostMapping("/")
    public Notas save(@RequestBody Notas entity){
        return notasService.save(entity);
    }

    @PutMapping("/")
    public Notas update(@RequestBody Notas entity){
        return notasService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        notasService.deleteById(id);
    }
}

