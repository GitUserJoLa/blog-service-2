package org.jola.learning.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String alias;
    private String email;
    private String password;
}
