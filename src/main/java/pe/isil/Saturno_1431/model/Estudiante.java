package pe.isil.Saturno_1431.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Estudiante {
    @Id //prIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
    private String nombres;
    private String apellidos;
    @Column(unique = true)
    private  Integer dni;
    private  String correo;


  // id INT AUTO_INCREMENT PRIMARY KEY,
   // nombres VARCHAR(200),
  //  apellidos VARCHAR(200),
   // dni VARCHAR(15) NOT NULL,
   // correo VARCHAR(200) NOT NULL,
   // id_carrera INT,
   // FOREIGN KEY (id_carrera) REFERENCES Carrera(id)
}
