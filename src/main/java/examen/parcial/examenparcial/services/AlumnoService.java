package examen.parcial.examenparcial.services;

import examen.parcial.examenparcial.models.AlumnoModel;
import examen.parcial.examenparcial.repositories.AlumnoRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements AlumnoServiceInterface{

    final
    AlumnoRepositoryInterface alumnoRepository;

    public AlumnoService(AlumnoRepositoryInterface alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public AlumnoModel save(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public AlumnoModel update(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }

    @Override
    public List<AlumnoModel> getAll() {
        return (List<AlumnoModel>) alumnoRepository.findAll();
    }

    @Override
    public AlumnoModel findById(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }
}
