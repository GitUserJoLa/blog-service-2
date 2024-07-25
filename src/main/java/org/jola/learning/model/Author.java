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

    //primary key, bigint, not null, autoincrement, autogenerate
    private Long id;
    //string, not null
    private String firstName;
    //string, not null
    private String lastName;
    //string, not null, unique
    private String alias;
    //string, not null, unique
    private String email;
    //hashed string, not null
    // should also be stored hashed in db and never be clear text
    private String password;
}
