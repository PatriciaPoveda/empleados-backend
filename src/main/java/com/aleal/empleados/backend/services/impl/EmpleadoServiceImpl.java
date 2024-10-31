package com.aleal.empleados.backend.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleal.empleados.backend.dao.IEmpleadoDao;
import com.aleal.empleados.backend.model.Empleado;
import com.aleal.empleados.backend.services.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoDao empleado;

    @Override
    public List<Empleado> buscar() {
        return empleado.findAll();
    }

    @Override
    public Empleado buscarPorId(String id) {
        Optional<Empleado> empl = empleado.findById(id);
        if (empl.isPresent()) {
            return empl.get();
        }
        return null;
    }

    @Override
    public Empleado guardar(Empleado empl) {
        return empleado.save(empl);
    }

    @Override
    public void eliminar(String id) {
        empleado.deleteById(id);
    }

}
