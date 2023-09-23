package pe.isil.Saturno_1431.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.isil.Saturno_1431.model.Estudiante;

import pe.isil.Saturno_1431.repository.EstudianteRepository;

import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @GetMapping("")
    String index(Model model) {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        model.addAttribute("estudiante", estudiantes);
        return "indexEstudiante"; // Cambiamos el nombre de la vista
    }
    @GetMapping("/nuevoEstudiante")
    String nuevo(Model model){
        model.addAttribute("estudiante",new Estudiante());
                return "nuevoEstudiante";

    }
    @PostMapping("/nuevoEstudiante")
    String crear(Model model, Estudiante estudiante){
        estudianteRepository.save(estudiante);
        return "redirect:/estudiantes";
    }
    @DeleteMapping("/eliminarEstudiante")
    String eliminar(Model model, Estudiante estudiante){
        estudianteRepository.delete(estudiante);
        return "redirect:/estudiantes";
    }


}
