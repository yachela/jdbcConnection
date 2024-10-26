package ar.edu.davinci;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImplH2 implements ProductDao{
    private final Connection connection;

    public ProductDaoImplH2(Connection connection) throws SQLException {
        this.connection = JdbcConfiguration.getInstance();
    }

    @Override
    public void insertProduct(ProductDto productDto) {

    }

    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int productId) {

    }
}
