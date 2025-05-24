import Class.Product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cookie = new Product("Cookie",5.99);
        Product egg = new Product("egg",1.99);
        List<Product> productList = new ArrayList<>();
        productList.add(egg);
        productList.add(cookie);
        Collections.sort(productList);
        Main.getProductsName(productList);
    }
    public static void getProductsName(List<Product> productList) {
         for(Product product : productList) {
             System.out.println(product.getPRODUCT_NAME());
         }
         }
    }

