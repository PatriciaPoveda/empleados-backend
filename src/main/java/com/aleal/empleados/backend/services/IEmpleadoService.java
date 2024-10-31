package com.aleal.empleados.backend.services;

import java.util.List;

import com.aleal.empleados.backend.model.Empleado;

public interface IEmpleadoService {

    List<Empleado> buscar();

    Empleado buscarPorId(String id);

    Empleado guardar(Empleado empleado);

    void eliminar(String id);
}
