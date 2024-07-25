package org.jola.learning.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorDto {

    @NotNull
    @Setter(AccessLevel.NONE)
    //primary key, bigint, not null, autoincrement, autogenerate
    private Long id;

    @NotNull
    //string, not null
    private String firstName;

    @NotNull
    //string, not null
    private String lastName;

    @NotNull
    //string, not null, unique
    private String alias;

    @NotNull
    @Setter(AccessLevel.NONE)
    //string, not null, unique
    private String email;

    @NotNull
    @Getter(AccessLevel.NONE)
    //hashed string, not null
    // should also be stored hashed in db and never be clear text
    private String password;
}
