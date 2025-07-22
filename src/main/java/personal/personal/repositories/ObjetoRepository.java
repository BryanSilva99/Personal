package personal.personal.repositories;

import personal.personal.entities.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto,Integer> {
}
