package org.example.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

    private ProductStorage productStorage;
    private long count;
    private double sum;

    public Product(ProductStorage productStorage, long count){
        this.productStorage = productStorage;
        this.count = count;

        this.sum = count * productStorage.getPriceByCount();
    }


}
