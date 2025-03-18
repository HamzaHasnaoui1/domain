package com.peaqock.domain;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.common.AbstractEntity;
import com.peaqock.domain.model.ReceptionLine;
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
@Document(collection = CollectionName.RECEPTIONS)
public class Reception extends AbstractEntity {
    private int receptionNumber;
    private LocalDate receptionDate;
    private String comments;
    private List<String> files;
    private double totalGross;
    private double totalDiscount;
    private double totalNet;
    @Builder.Default
    private List<Order> orders = new ArrayList<>();
    @Builder.Default
    private List<ReceptionLine> receptionLines = new ArrayList<>();
}
