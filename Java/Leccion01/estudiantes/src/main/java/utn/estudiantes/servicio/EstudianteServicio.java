import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiante;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante2022> listarEstudiantes() {
        List<Estudiante2022> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante2022) {
        Estudiante2022 estudiante = estudianteRepositorio.findById(idEstudiante2022).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante2022 estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante2022 estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
