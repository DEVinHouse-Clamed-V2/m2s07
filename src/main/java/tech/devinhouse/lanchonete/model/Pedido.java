package tech.devinhouse.lanchonete.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import java.time.LocalDateTime;

@Entity
@Table(name = "PEDIDOS")
@Data
public class Pedido {

    @Id
    private Integer id;

    private LocalDateTime dataPedido;

    @ManyToOne
    @JoinColumn(name = "CPF_CLIENTE", referencedColumnName = "CPF")
    private Cliente cliente;

    @OneToMany
    private List<ItemPedido> itens;

    @Transient  // nao eh mapeado para nenhuma coluna do BD
    private Float valorTotal;

}
