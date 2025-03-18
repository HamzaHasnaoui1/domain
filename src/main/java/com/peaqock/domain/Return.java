package com.peaqock.domain;

import com.peaqock.constant.CollectionName;
import com.peaqock.domain.common.AbstractEntity;
import com.peaqock.domain.model.ReturnLine;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = CollectionName.RETURNS)
public class Return extends AbstractEntity {
    private int returnNumber;
    private LocalDate returnDate;
    private String status;
    private String comments;
    private List<String> files;
    @DocumentReference(lazy = true)
    private Reception reception;
    @Builder.Default
    private List<ReturnLine> returnLines = new ArrayList<>();
}
