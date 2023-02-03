package notas.api_notas.notas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long estudianteId;
    private String cedula;
    private double nota1;
    private double nota2;
    private double notafinal;
    private String estado;
    private String nombres;
}
