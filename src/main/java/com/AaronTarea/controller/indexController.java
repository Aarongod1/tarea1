package com.AaronTarea.controller;

import com.AaronTarea.dao.ClienteDao;
import com.AaronTarea.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class indexController {
 @Autowired
 ClienteDao clienteDao;
    @GetMapping("/")
    public String inicio (Model model) {
//        log.info("Ahora desde mvc");
//        model.addAttribute("Mensaje","Hola desde el controllador");
//        Cliente cliente = new Cliente("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//        model.addAttribute("objetoCliente", cliente);
//        
//        Cliente cliente2 = new Cliente("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//        Cliente cliente3 = new Cliente("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//       
//        List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);
     var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
}
