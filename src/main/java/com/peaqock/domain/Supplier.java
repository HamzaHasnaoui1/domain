package com.peaqock.domain;

import com.peaqock.domain.Abstract.AbstractEntity;
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
@Document(collection = CollectionName.SUPPLIERS)
public class Supplier extends AbstractEntity {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
}
