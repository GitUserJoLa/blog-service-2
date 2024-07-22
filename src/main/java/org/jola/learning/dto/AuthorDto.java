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
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String alias;

    @NotNull
    @Setter(AccessLevel.NONE)
    private String email;

    @NotNull
    @Getter(AccessLevel.NONE)
    // should also be stored hashed in db and never be clear text
    private String password;
}
