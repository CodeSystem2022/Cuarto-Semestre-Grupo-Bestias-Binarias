package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiante2022;

import java.util.List;

public interface iEstudianteServicio {
    // va a tener los métodos básicos para trabajar con la entidad Estudiante
    // usando la interface repositorio
    public List<Estudiante> listarEstudiantes();
    public Estudiante2022 buscarEstudianteporId(Integer idEstudiante2022);
    public void guardarEstudiante(Estudiante2022 estudiante);
    public void eliminarEstudiante(Estudiante2022 estudiante);

}
