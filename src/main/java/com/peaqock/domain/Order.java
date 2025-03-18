package com.peaqock.domain;

import com.peaqock.domain.common.AbstractEntity;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.model.OrderLine;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = CollectionName.ORDERS)
public class Order extends AbstractEntity {
    private int orderNumber;
    private LocalDate orderDate;
    private String status;
    private String comments;
    private List<String> files;
    private double totalGross;
    private double totalDiscount;
    private double totalNet;
    private String userId;
    private Supplier supplier;
    @Builder.Default
    private List<OrderLine> orderLines = new ArrayList<>();
}
