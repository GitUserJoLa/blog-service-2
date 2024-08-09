package org.jola.learning.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticleDto {

    @NotNull
    // auto-generation; should be set by database only
    @Setter(AccessLevel.NONE)
    // primary key, bigint, not null, autoincrement, autogenerate
    private Long id;

    @NotNull
    // varchar(255), not null, unique
    private String title;

    // varchar(255), nullable
    private String description;

    @NotNull
    @Setter(AccessLevel.NONE)
    // ManyToOne
    // foreign key, not null
    private AuthorDto author;

    @NotNull
    // boolean default false, not null
    private boolean published;

    // bigint default 0, nullable
    private Long readCount;

    // int default 1
    private Integer readingTime;

    // text
    private String content;

    // timestamp
    private Timestamp timestamp;

    // varchar(255)[]
    private String[] hashTags;
}
