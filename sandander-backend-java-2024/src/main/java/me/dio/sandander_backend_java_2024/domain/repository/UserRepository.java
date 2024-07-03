package me.dio.sandander_backend_java_2024.domain.repository;

import me.dio.sandander_backend_java_2024.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
