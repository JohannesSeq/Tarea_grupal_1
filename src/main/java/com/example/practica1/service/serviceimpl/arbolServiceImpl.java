
package com.example.practica1.service.serviceimpl;

import com.example.practica1.dao.arbolDao;
import com.example.practica1.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practica1.service.arbolService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class arbolServiceImpl implements arbolService {
    
    @Autowired
    private arbolDao ArbolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(){
        var lista = ArbolDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return ArbolDao.findById(arbol.getId_arbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        ArbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        ArbolDao.delete(arbol);
    }
}
