package org.jola.learning.controller;

import org.jola.learning.dto.AuthorDto;
import org.jola.learning.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping(value = "/authors")
    public ResponseEntity<List<AuthorDto>> getAuthors(
            @RequestParam(name = "lastname", required = false) String lastName,
            @RequestParam(name = "firstname", required = false) String firstName
    ) {

        List<AuthorDto> authorList = authorService.getAuthors(lastName, firstName);
        return createResponseEntity(authorList);
    }

    private ResponseEntity<List<AuthorDto>> createResponseEntity(List<AuthorDto> list) {

        if (list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
