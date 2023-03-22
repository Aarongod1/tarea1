package com.AaronTarea.service;

import com.AaronTarea.domain.Cliente;
import java.util.List;


public interface ClienteService {
   
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente); // para meter o modificar idcliente o no
    
    public void delete (Cliente cliente);
    
    
    
}
