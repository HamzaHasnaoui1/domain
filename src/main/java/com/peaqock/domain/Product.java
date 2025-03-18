package com.peaqock.domain;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.common.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = CollectionName.PRODUCTS)
public class Product extends AbstractEntity {
    private String name;
    private String reference;
    @DocumentReference(lazy = true)
    private ProductCategory category;

}
