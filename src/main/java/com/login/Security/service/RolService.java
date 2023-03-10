package com.login.Security.service;

import com.login.Security.entity.Rol;
import com.login.Security.enumerado.RolNombre;
import com.login.Security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
    return rolRepository.findByRolNombre(rolNombre);
    }
}
