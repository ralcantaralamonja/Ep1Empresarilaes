package pe.isil.Saturno_1431.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.Saturno_1431.model.Estudiante;
@Repository
public interface EstudianteRepository extends  JpaRepository<Estudiante,Integer>{
}
