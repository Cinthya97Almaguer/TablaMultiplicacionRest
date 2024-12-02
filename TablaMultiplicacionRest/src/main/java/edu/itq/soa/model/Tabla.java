/**
 * 
 */
package edu.itq.soa.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * Registro que representa una operacion de multiplicacion.
 */
@Data
public class Tabla {
    @Id
    private Integer id;
    private Integer numero;
    private String operacion;
}
