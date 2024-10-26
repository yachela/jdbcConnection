package ar.edu.davinci;

import java.util.List;

public interface ProductDao {

    void insertProduct(ProductDto productDto);
    List<Product> getProducts();
    void updateProduct(Product product);
    void deleteProduct(int productId);

}
