package pe.isil.Saturno_1431.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.isil.Saturno_1431.model.Curso;
import pe.isil.Saturno_1431.repository.CursoRepository;

import java.util.List;

@Controller
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository; //DAO-Curso

    //INDEX: CUANDO CARGA LA PAGINA: SELECT * FROM curso
    //GET
    //si se desea devolver una vista(HTML) se debe devolver un STRING
    @GetMapping("") //localhost:8080/cursos
    String index(Model model){
        List<Curso> cursos = cursoRepository.findAll();
        model.addAttribute("cursos", cursos);
        return "index"; //retornamos el nombre de la vista o HTML con el atributo cursos
    }

    //NUEVO: Mostrar un formulario para registrar un nuevo curso
    //GET
    @GetMapping("/nuevo") //localhost:8080/cursos/nuevo
    String nuevo(Model model){
        //se agrega como atributo un nuave instancia o objecto de de la clase Curso
        model.addAttribute("curso", new Curso());
        return "nuevo"; //hacia una VISTA o HTML
    }

    //CREAR: REGISTRAR UN NUEVO CURSO: INSERT INTO curso
    //POST
    @PostMapping("/nuevo") //localhost:8080/cursos/nuevo
    String crear(Model model, Curso curso){
        cursoRepository.save(curso);
        return "redirect:/cursos"; //hacia una RUTA URL
    }

    //ACTUALIZAR UN CURSO: UPDATE curso
    //POST

    //ELIMINAR UN CURSO: DELETE FROM curso
    //POST
}
