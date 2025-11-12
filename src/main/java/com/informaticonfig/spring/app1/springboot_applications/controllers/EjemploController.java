package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfig.spring.app1.springboot_applications.controllers.models.Empleados;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){
              Empleados empleado1 = new Empleados("Mario", "Valladares", "Calle agua blanca", "Developer JR", 
                                                    25, 621014281, 007 );
    model.addAttribute("Empleado", empleado1);

        


        return "detalles_info";
    }

}
