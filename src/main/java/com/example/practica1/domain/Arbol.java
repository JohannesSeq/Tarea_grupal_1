package com.example.practica1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable{
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long id_arbol;
    
    private String nombre_comun; 
    private String tipo_flor; 
    private int dureza_madera;
    private long otro_campo_numerico; 
    private String otro_campo_texto;
    private String ruta_imagen;

    public Arbol(){}
    
}
