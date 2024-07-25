package org.jola.learning.controller;

import org.jola.learning.dto.AuthorDto;
import org.jola.learning.model.Author;
import org.jola.learning.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
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

        List<Author> authorList = authorService.getAuthors(lastName, firstName);
        List<AuthorDto> authorDtoList = new ArrayList<>();

        if (!authorList.isEmpty()) {
            // pre-Java8 approach: convert from model to dto for each element in the list
            for (Author element : authorList) {
                AuthorDto authorDto = new AuthorDto();
                // caveat in using BeanUtils.copyProperties(): uses reflections, might cause performance issues
                // advantage:  no dependency needed
                // throws BeansException (extends RuntimeException). Beans exceptions are usually fatal; there is no reason for them to be checked.
                BeanUtils.copyProperties(element, authorDto);
                authorDtoList.add(authorDto);
            }

            // post-Java8: use lambdas/ stream mapping
            // work in progress
//            authorList.stream().map();

        }

        //BeanUtils.copyProperties(sourceObj, targetObj);

        return createResponseEntity(authorDtoList);
    }

    private ResponseEntity<List<AuthorDto>> createResponseEntity(List<AuthorDto> list) {

        if (list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
