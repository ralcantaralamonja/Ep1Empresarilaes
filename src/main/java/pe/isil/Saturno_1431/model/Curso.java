package pe.isil.Saturno_1431.model;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Curso {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremental
    private Integer id;

    @Column(unique = true)
    private String nrc;

    private String nombre;
    private Integer creditos;
    private Integer horas;
    private String modalidad;
    private String area;
    private LocalDateTime fecha_creacion; //fechaCreacion
    private LocalDateTime fecha_actualizacion; //fechaActualizacion

    @PrePersist //pre(antes de insertar asignar el valor en la fecha de creacion)
    void prePersist(){
        fecha_creacion = LocalDateTime.now();
    }

    @PreUpdate //pre(antes de actualizar asignar el valor en la fecha de actualizacion)
    void preUpdate(){
        fecha_actualizacion = LocalDateTime.now();
    }


}
