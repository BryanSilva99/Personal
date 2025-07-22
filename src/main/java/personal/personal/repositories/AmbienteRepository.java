package personal.personal.repositories;

import personal.personal.entities.Ambiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente,Integer> {
}
