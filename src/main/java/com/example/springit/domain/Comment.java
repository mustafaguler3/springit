package com.example.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    @ManyToOne
    private Link link;
}
