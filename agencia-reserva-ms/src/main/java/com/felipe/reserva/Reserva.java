package com.felipe.reserva;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Reserva")
@Getter
@Setter
public class Reserva extends PanacheEntity {

    private Long clienteId;
}
