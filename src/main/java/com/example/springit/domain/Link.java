package com.example.springit.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
