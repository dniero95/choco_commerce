package its.darioniero.chococommerce.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "timestamp", nullable = false)
    private LocalDate timestamp;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "state", nullable = false)
    private String state;


}