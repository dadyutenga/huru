package com.example.huru.repository;

import com.example.huru.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
    List<Transaction> findByUserIdAndDateBetween(Long userId, LocalDateTime startDate, LocalDateTime endDate);
    List<Transaction> findByUserIdAndType(Long userId, Transaction.TransactionType type);
    List<Transaction> findByUserIdAndCategory(Long userId, String category);
}