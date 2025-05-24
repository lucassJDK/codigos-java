package Class.Product;

public class Product implements Comparable<Product>{
    private final String PRODUCT_NAME;
    private final Double PRODUCT_PRICE;

    public Product(String productName, Double productPrice) {
        PRODUCT_NAME = productName;
        PRODUCT_PRICE = productPrice;
    }

    @Override
    public int compareTo(Product product) {
        return PRODUCT_NAME.compareTo(product.getPRODUCT_NAME());
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public Double getPRODUCT_PRICE() {
        return PRODUCT_PRICE;
    }
}
