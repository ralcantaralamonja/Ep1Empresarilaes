package pe.isil.Saturno_1431.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.Saturno_1431.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
