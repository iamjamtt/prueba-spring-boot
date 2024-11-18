package examen.parcial.examenparcial.controllers;

import examen.parcial.examenparcial.models.AlumnoModel;
import examen.parcial.examenparcial.services.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    final
    AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping()
    public List<AlumnoModel> getAll(){
        return alumnoService.getAll();
    }

    @PostMapping()
    public AlumnoModel save(AlumnoModel alumno) {
        return alumnoService.save(alumno);
    }

    @PutMapping("/{id}")
    public AlumnoModel update(AlumnoModel alumno) {
        return alumnoService.update(alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        alumnoService.delete(id);
    }

    @GetMapping("/{id}")
    public AlumnoModel findById(@PathVariable Long id) {
        return alumnoService.findById(id);
    }

}
