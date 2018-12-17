package com.amit.katas.integration;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.amit.katas.integration.role.RoleEntity;
import com.amit.katas.integration.role.RoleRepository;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest()
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@ActiveProfiles("test")
@Slf4j
public class TestUsingMysql {

    @Autowired
    RoleRepository roleRepo;

    @Test
    public void testSaving() {
        RoleEntity r = new RoleEntity();
        r.setRole("test_role");
        r.setRoleDescription("test description");
        RoleEntity role = roleRepo.save(r);
        RoleEntity role2 = roleRepo.findOne(role.getRoleId());
        
        log.debug("role:{}",role2);
        assertEquals("test_role", role2.getRole());
        log.debug("All the roles:{}",roleRepo.findAll());
    }
}
