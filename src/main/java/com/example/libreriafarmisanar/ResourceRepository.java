package com.example.libreriafarmisanar;

import com.example.libreriafarmisanar.collections.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ResourceRepository extends CrudRepository {

    @Transactional(readOnly = true)
    Optional<List<Resource>> findByAreaThemeId(String areaThemeId);

    @Transactional(readOnly = true)
    Optional<List<Resource>> findByResourceType(String resourceType);

    @Transactional(readOnly = true)
    Optional<List<Resource>> findByAreaThemeIdAndResourceType(String areaThemeId, String resourceType);
}
