package notas.api_notas.notas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasService {
    @Autowired NotasRepository productoRepository;

    public Notas save(Notas entity){
        return productoRepository.save(entity);
    }

    public Notas findById( Long id){
        return productoRepository.findById(id).orElse(new Notas());
    }

    public void deleteById(Long id){
        productoRepository.deleteById(id);
    }

    public List<Notas> findAll(){
        return productoRepository.findAll();
    }
}
