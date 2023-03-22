
package com.AaronTarea.dao;

import com.AaronTarea.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao  extends CrudRepository <Cliente, Long>  {
    
}
