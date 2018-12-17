package com.amit.katas.integration.role;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RestEndpoints {

    RoleService service;

    @GetMapping(path = "/findAll")
    List<RoleEntity> findAll() {
        return service.findAll();
    }

}
