package com.artofcoding.factoryMethod.demo;

//import com.artofcoding.factoryMethod.demo.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

//public class ProductsController extends SharpController
public class ProductsController extends Controller {
    public void listProducts() {
//        Get products from a database
        Map<String, Object> context = new HashMap<>();
//        context.put(products)
        render("products.html", context);
    }
}
