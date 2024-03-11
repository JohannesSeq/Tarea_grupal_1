
package com.example.practica1.service;

import com.example.practica1.domain.Arbol;
import java.util.List;

public interface arbolService {
    public List<Arbol> getArboles();

    public Arbol getArbol(Arbol arbol);
    public void save(Arbol arbol);
    public void delete(Arbol arbol);
}
