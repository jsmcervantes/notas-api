package notas.api_notas.notas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotasRepository extends JpaRepository<Notas, Long> {

    public List<Notas> findAll();
    
}

