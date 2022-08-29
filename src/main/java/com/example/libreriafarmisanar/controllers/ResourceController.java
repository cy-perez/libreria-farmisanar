package com.example.libreriafarmisanar.controllers;

import com.example.libreriafarmisanar.dto.ResourceDTO;
import com.example.libreriafarmisanar.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    public ResourceService resourceService;

    @GetMapping("/{id}")
    public ResponseEntity<ResourceDTO> findById(@PathVariable("id") String id) throws Throwable {
        return new ResponseEntity(resourceService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/lists")
    public ResponseEntity<List<ResourceDTO>> findAll() {
        return new ResponseEntity(resourceService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResourceDTO> create(@RequestBody ResourceDTO resourceDTO) {
        return new ResponseEntity(resourceService.create(resourceDTO), HttpStatus.CREATED);
    }

    @PutMapping("/modify")
    public ResponseEntity<ResourceDTO> update(@RequestBody ResourceDTO resourceDTO) throws Throwable {
        if (!StringUtils.isEmpty(resourceDTO.getIdLibro())) {
            return new ResponseEntity(resourceService.modify(resourceDTO), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        try {
            resourceService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}