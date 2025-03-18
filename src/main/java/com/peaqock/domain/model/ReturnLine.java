package com.peaqock.domain.model;

import com.peaqock.domain.Product;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReturnLine {
    private Product product;
    private int returnedQuantity;
    private String comments;
}
