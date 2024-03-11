package com.example.practica1.controller;

import com.example.practica1.domain.Arbol;
import com.example.practica1.service.arbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/arbol")
public class arbolcontroller {
    @Autowired
    private arbolService ArbolService;

    @PostMapping("/guardar")
    public String arbolGuardar(Arbol arbol,
                                   @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            ArbolService.save(arbol);
        }

        ArbolService.save(arbol);
        return "redirect:/arbol/listado";
    }


    @GetMapping("/listado")
    public String inicio(Model model) {
        var arboles = ArbolService.getArboles();
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalarboles", arboles.size());
        return "/arbol/listado";
    }

    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }

    @GetMapping("/eliminar/{id_arbol}")
    public String arbolEliminar(Arbol arbol) {
        ArbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{id_arbol}")
    public String arbolModificar(Arbol arbol, Model model) {
        arbol = ArbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }

}
