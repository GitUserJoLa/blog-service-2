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
    // auto-generation; should be set by database only
    @Setter(AccessLevel.NONE)
    // primary key, bigint, not null, autoincrement, autogenerate
    private Long id;

    @NotNull
    // varchar(255), not null
    private String firstName;

    @NotNull
    // varchar(255), not null
    private String lastName;

    @NotNull
    // varchar(255), not null, unique
    private String alias;

    @NotNull
    @Setter(AccessLevel.NONE)
    // varchar(255), not null, unique
    private String email;

    @NotNull
    @Getter(AccessLevel.NONE)
    // hashed varchar(255), not null
    // should also be stored hashed in db and never be clear text
    private String password;
}
