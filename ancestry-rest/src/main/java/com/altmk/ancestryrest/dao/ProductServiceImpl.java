package com.altmk.ancestryrest.dao;

import com.altmk.ancestryrest.model.Product;
import com.altmk.ancestryrest.model.dto.ProductRequest;
import com.altmk.ancestryrest.model.dto.ProductResponse;
import com.altmk.ancestryrest.model.dto.Status;
import com.altmk.ancestryrest.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public ProductResponse searchCatalogByName(ProductRequest productRequest) {

        ProductResponse productResponse=new ProductResponse();
        Status status=new Status();
        Product product=new Product();

        //implement  logic and set response
        product.setProductId( "10201233" );
        product.setProductName( "Testname" );
        product.setPrice("10000");
        product.setDescription( "This is for dummy product" );


        if(product!=null){

            status.setStatusCode( "100" );
            status.setStatusDescription( "Success" );
        }else{
            status.setStatusCode( "101" );
            status.setStatusDescription( "Failed" );
        }


        //setting all response
        productResponse.setProduct( product );
        productResponse.setStatus( status );

        return productResponse;
    }
}
