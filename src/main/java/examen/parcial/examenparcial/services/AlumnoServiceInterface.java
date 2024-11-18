package examen.parcial.examenparcial.services;


import examen.parcial.examenparcial.models.AlumnoModel;

import java.util.List;

public interface AlumnoServiceInterface {

    public AlumnoModel save(AlumnoModel alumno);

    public AlumnoModel update(AlumnoModel alumno);

    public void delete(Long id);

    public List<AlumnoModel> getAll();

    public AlumnoModel findById(Long id);
}
