package org.example.myapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<score, Long> {
    // İhtiyaca göre özel sorgular eklenebilir
}
