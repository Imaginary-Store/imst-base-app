package org.imaginarystore.application.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/base")
public class BaseApplicationController {

    @GetMapping("/entry")
    public ResponseEntity<String> entryPage () {
        return new ResponseEntity<>("Working", HttpStatus.OK);
    }
}
