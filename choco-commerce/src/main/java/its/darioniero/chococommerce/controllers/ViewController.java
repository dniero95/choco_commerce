package its.darioniero.chococommerce.controllers;

import its.darioniero.chococommerce.entities.Product;
import its.darioniero.chococommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    ProductService productService;

    @GetMapping("order/insert")
    public String getProductNewView(Model model){

        List<Product> products = productService.fetchAllProducts();

        model.addAttribute("products", products);

        return "order-insert";
    }
}
