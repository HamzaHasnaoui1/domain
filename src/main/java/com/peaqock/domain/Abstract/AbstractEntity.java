package com.peaqock.domain.Abstract;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Document
public abstract class AbstractEntity {

    @Id
    private String id = UUID.randomUUID().toString();

    @Builder.Default
    private LocalDateTime createdOn = LocalDateTime.now();

    private LocalDateTime deletedOn;
}
