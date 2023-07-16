package its.darioniero.chococommerce.repositories;

import its.darioniero.chococommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}