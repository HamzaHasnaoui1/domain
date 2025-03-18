package com.peaqock.domain.model;

import com.peaqock.domain.Product;
import lombok.*;
import org.bson.types.ObjectId;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceptionLine {
    @Builder.Default
    private String id = new ObjectId().toString();
    private Product product;
    private int receivedQuantity;
    private double unitPrice;
    private double discountPercentage;
    private double lineAmount;
    private String comments;
    private String orderLineId;
}
