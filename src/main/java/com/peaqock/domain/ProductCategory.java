package com.peaqock.domain;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.common.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = CollectionName.PRODUCT_CATEGORIES)
public class ProductCategory extends AbstractEntity {
    private String name;
    private ProductCategory parentCategory;
    private int level;
}
