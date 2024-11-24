package services;

import models.Clientes;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImplement implements ProductoService {
    @Override
    public List<Clientes> listar() {
        return Arrays.asList(new Clientes(1L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(2L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(3L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(4L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(5L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(6L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(7L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(8L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(9L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513),
                new Clientes(10L, "Mateo Arroyo", "Quitumbe", "cedula", 1755069513)
                );
    }
}
