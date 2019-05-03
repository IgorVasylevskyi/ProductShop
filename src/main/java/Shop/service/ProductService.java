package Shop.service;

import Shop.model.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    Product getById(Long id);
    List <Product> getByName(String name);
    List<Product> getAllProducts();
    void deleteProduct(Long id);

}
