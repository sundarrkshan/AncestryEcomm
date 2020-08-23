package com.altmk.ancestryrest.controller;

import com.altmk.ancestryrest.model.Product;
import com.altmk.ancestryrest.model.dto.ProductRequest;
import com.altmk.ancestryrest.model.dto.ProductResponse;
import com.altmk.ancestryrest.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/search/catalog/{name}" , method = RequestMethod.GET)
    public @ResponseBody String searchProduct(@PathVariable String name){
        String response=null;
        ProductResponse productResponse;
        ProductRequest productRequest=generateRequest( name,null );
        productResponse=productService.searchCatalogByName( productRequest );

        response=productResponse.toString();
        return response;
    }

    public ProductRequest generateRequest(String name,String price){
        ProductRequest productRequest=new ProductRequest();
        Product product=new Product();
        product.setProductName( name );
        if(price!=null){
        product.setPrice( price);}
        productRequest.setProductRequest( product );
        return productRequest;
    }

}
