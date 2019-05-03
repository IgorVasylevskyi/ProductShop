package Shop.controller;

import Shop.model.Product;
import Shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @RequestMapping(value = "/allproducts", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getById(@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @RequestMapping(value = "/findbyname/{name}", method = RequestMethod.GET)
    public List<Product> getByName(@PathVariable("name") String name){
        return productService.getByName(name);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }

}
