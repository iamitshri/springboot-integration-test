package com.amit.katas.integration.role;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoleService {
    RoleRepository repo;

    List<RoleEntity> findAll() {
        return repo.findAll();
    }
}