package its.darioniero.chococommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_order_id", nullable = false)
    private Long id;


    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @Column(name = "barcode", nullable = false)
    private String barcode;

    @Column(name = "quatity", nullable = false)
    private int quantity;
}


