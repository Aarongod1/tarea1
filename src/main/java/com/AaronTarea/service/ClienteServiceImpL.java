
package com.AaronTarea.service;

import com.AaronTarea.dao.ClienteDao;
import com.AaronTarea.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpL implements ClienteService{
    
 @Autowired
 ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
      return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
      return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
        
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
      clienteDao.deleteById(cliente.getIdCliente());
    }
    
}
