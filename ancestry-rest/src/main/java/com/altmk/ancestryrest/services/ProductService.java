package com.altmk.ancestryrest.services;

import com.altmk.ancestryrest.model.dto.ProductRequest;
import com.altmk.ancestryrest.model.dto.ProductResponse;
import org.springframework.stereotype.Service;

public interface ProductService {

    public ProductResponse searchCatalogByName(ProductRequest productRequest);

}
