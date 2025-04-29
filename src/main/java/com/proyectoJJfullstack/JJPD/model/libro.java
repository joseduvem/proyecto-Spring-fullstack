package com.proyectoJJfullstack.JJPD.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@noarg

public class libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechapublicacion;
    private String autor;
}
