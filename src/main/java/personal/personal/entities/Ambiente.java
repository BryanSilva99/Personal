package personal.personal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Ambiente {
    @Id
    private Integer numeroUbicacion;
    private String nombre;
    @OneToMany
    private List<Objeto> objetos;

}
