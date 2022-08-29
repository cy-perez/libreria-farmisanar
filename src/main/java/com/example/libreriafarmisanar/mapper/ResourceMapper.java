package com.example.libreriafarmisanar.mapper;

import com.example.libreriafarmisanar.collections.Resource;
import com.example.libreriafarmisanar.dto.ResourceDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResourceMapper {

    //DTO to resource
    public Resource fromDTO(ResourceDTO resourceDTO) {
        Resource resource = new Resource();
        resource.setId(resourceDTO.getIdLibro());
        resource.setAutorId(resourceDTO.getIdAutorLibro());
        resource.setCategoryId(resourceDTO.getIdCategoriaLibro());
        resource.setIsbn(resourceDTO.getIsbnLibro());
        resource.setPublishDate(resourceDTO.getFechaPublicacion());
        resource.setTitle(resourceDTO.getTituloLibro());
        resource.setPrice(resourceDTO.getPrecioLibro());
        resource.setDescription(resourceDTO.getDescripcionLibro());
        resource.setImage(resourceDTO.getImagenLibro());
        resource.setMimeType(resourceDTO.getTipoMimeLibro());
        resource.setFileName(resourceDTO.getNombreArchivo());
        resource.setImageLastUpdate(resourceDTO.getUltimaActualizacionImagen());
        return resource;
    }

    //Resource to DTO
    public ResourceDTO fromResource(Resource resource) {
        ResourceDTO resourceDTO = new ResourceDTO();
        resourceDTO.setIdLibro(resource.getId());
        resourceDTO.setIdAutorLibro(resource.getAutorId());
        resourceDTO.setIdCategoriaLibro(resource.getCategoryId());
        resourceDTO.setIsbnLibro(resource.getIsbn());
        resourceDTO.setFechaPublicacion(resource.getPublishDate());
        resourceDTO.setTituloLibro(resource.getTitle());
        resourceDTO.setPrecioLibro(resource.getPrice());
        resourceDTO.setDescripcionLibro(resource.getDescription());
        resourceDTO.setImagenLibro(resource.getImage());
        resourceDTO.setTipoMimeLibro(resource.getMimeType());
        resourceDTO.setNombreArchivo(resource.getFileName());
        resourceDTO.setUltimaActualizacionImagen(resource.getImageLastUpdate());
        return resourceDTO;
    }

    //Resource list to DTO list
    public List<ResourceDTO> fromCollectionList(List<Resource> collection) {
        if (collection == null) {
            return null;
        }

        List<ResourceDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while (listTracks.hasNext()) {
            Resource resource = (Resource) listTracks.next();
            list.add(fromResource(resource));
        }
        return list;
    }
}
