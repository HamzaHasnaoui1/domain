package com.peaqock.domain;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.common.AbstractEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = CollectionName.SUPPLIER_PRODUCTS)
public class SupplierProduct extends AbstractEntity {
    private Supplier supplier;
    private Product product;
    private double price;
    private int quantity;
}
