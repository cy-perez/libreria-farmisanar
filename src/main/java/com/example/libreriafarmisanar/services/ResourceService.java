package com.example.libreriafarmisanar.services;

import com.example.libreriafarmisanar.ResourceRepository;
import com.example.libreriafarmisanar.collections.Resource;
import com.example.libreriafarmisanar.dto.ResourceDTO;
import com.example.libreriafarmisanar.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    ResourceMapper mapper = new ResourceMapper();

    //Get all resources
    public List<ResourceDTO> getAll(){
        List<Resource> resources = (List<Resource>) resourceRepository.findAll();
        return mapper.fromCollectionList(resources);
    }

    //Get resource by id
    public ResourceDTO getById (String id) throws Throwable {
        Resource resource = (Resource) resourceRepository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found"));
        return mapper.fromResource(resource);
    }

    //Create resource
    public ResourceDTO create(ResourceDTO resourceDTO){
        Resource resource = mapper.fromDTO(resourceDTO);
        return mapper.fromResource((Resource) resourceRepository.save(resource));
    }

    //Modify resource
    public ResourceDTO modify(ResourceDTO resourceDTO) throws Throwable {
        Resource resource = mapper.fromDTO(resourceDTO);
        resourceRepository.findById(resource.getId()).orElseThrow(() -> new RuntimeException("Resource not found"));
        return mapper.fromResource((Resource) resourceRepository.save(resource));
    }

    //Delete resource
    public void delete (String id){
        resourceRepository.deleteById(id);
    }
}