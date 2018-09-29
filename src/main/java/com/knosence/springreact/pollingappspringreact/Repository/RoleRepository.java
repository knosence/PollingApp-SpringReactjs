package com.knosence.springreact.pollingappspringreact.Repository;

import java.util.Optional;

import com.knosence.springreact.pollingappspringreact.Models.Role;
import com.knosence.springreact.pollingappspringreact.Models.RoleName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(RoleName roleName);
}