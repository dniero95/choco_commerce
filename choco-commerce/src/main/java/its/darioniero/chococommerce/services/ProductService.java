package its.darioniero.chococommerce.services;


import its.darioniero.chococommerce.entities.Product;
import its.darioniero.chococommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> fetchAllProducts(){
        return productRepository.findAll();
    }
}
