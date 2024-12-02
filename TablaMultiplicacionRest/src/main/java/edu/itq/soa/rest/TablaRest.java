/**
 * 
 */
package edu.itq.soa.rest;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.itq.soa.service.GenerarService;

/**
 * 
 */
@RestController
@RequestMapping("/tabla-multiplicar")
public class TablaRest {

    @Autowired
    private GenerarService generarService;

    @GetMapping("/{id}")
    public List<String> getTabla(@PathVariable Integer id) {
        return generarService.generarTabla(id);
    }
}

