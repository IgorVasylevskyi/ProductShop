package Shop.service;

import Shop.model.Product;
import Shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product){
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> getByName(String name){
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.delete(getById(id));
    }
}

