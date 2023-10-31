package tech.devinhouse.lanchonete.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ITENS_PEDIDOS")
@IdClass(IdItemPedido.class)
public class ItemPedido {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
    private Pedido pedido;

    @Id
    @Column(name = "COD_PRODUTO")
    private Integer codigoProduto;

    private int quantidade;

    @Column(name = "VL_ITEM")
    private float valor;


    @Override
    public String toString() {
        return "ItemPedido{" +
                "codigoProduto=" + codigoProduto +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }

}
