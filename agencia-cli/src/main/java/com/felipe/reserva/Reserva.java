package com.felipe.reserva;

import com.felipe.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reserva {

    private Cliente cliente;

    private Reserva(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva of(Cliente cliente) {
        return new Reserva(cliente);
    }
}
