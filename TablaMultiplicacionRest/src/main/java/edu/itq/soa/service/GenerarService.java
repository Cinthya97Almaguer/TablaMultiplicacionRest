package edu.itq.soa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.itq.soa.model.Tabla;
import edu.itq.soa.repository.TablaRepository;

@Service
public class GenerarService {
    @Autowired
    private TablaRepository tablaRepository;

    /**
     * Genera la tabla de multiplicar de un número.
     * @param numero Número a generar la tabla.
     * @return Lista con la tabla de multiplicar.
     */
    public List<String> generarTabla(Integer numero) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Tabla registro = new Tabla();
            registro.setNumero(numero);
            registro.setOperacion(numero + " x " + i + " = " + (numero * i));
            tablaRepository.save(registro);
            tabla.add(numero + " x " + i + " = " + (numero * i));
        }
        return tabla;
    }

}
