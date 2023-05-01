package com.example.jwtrefreshtoken.security.repository;

import com.example.jwtrefreshtoken.security.model.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    @Query(value = "SELECT t FROM RefreshToken t INNER JOIN" +
            " User u ON t.user.id = u.id WHERE u.id = :id" +
            " AND (t.expired = false or t.revoked = false)")
    List<RefreshToken> findAllValidTokenByUser(Long id);
}
