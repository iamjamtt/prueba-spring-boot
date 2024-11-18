package examen.parcial.examenparcial.repositories;

import examen.parcial.examenparcial.models.AlumnoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositoryInterface extends CrudRepository<AlumnoModel, Long> {
}
