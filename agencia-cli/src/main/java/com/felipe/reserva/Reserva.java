package com.felipe.reserva;

import com.felipe.cliente.Cliente;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Reserva {

    private Long id;
    private Long clienteId;

    public static Reserva of(Long id, Long clienteId) {
        return new Reserva(id, clienteId);
    }
}
