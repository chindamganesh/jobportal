package com.luv2code.jobportal.repository;

import com.luv2code.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.attribute.IntegerSyntax;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, IntegerSyntax> {

    Optional<Users> findByEmail(String email);
}
