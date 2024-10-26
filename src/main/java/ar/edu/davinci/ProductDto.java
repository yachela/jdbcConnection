package ar.edu.davinci;

public class ProductDto {
    private int id;
    private String name;
    private String description;
    private int price;
    private int stock;
    private String category;
    public ProductDto(int id,String name, String description, int price, int stock, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
    public ProductDto() {}

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public String getCategory() {
        return category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setCategory(String category) {
        this.category = category;
    }


}
