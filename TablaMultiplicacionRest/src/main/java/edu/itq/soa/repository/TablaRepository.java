/**
 * 
 */
package edu.itq.soa.repository;

import org.springframework.data.repository.CrudRepository;

import edu.itq.soa.model.Tabla;

/**
 * Capa de persistencia para la tabla de multiplicacion.
 */
public interface TablaRepository extends CrudRepository<Tabla, Integer> {

}
