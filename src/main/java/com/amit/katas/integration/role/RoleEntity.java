package com.amit.katas.integration.role;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "role")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long roleId;
    String role;
    String roleDescription;
    Date dateCreated;
    Date dateUpdated;

}