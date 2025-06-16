package com.example.huru.services;

import com.example.huru.models.Transaction;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void deleteTransaction(Long transactionId);
    Optional<Transaction> getTransactionById(Long id);
    List<Transaction> getAllTransactionsByUserId(Long userId);
    List<Transaction> getTransactionsByDateRange(Long userId, LocalDateTime startDate, LocalDateTime endDate);
    List<Transaction> getTransactionsByType(Long userId, Transaction.TransactionType type);
    List<Transaction> getTransactionsByCategory(Long userId, String category);
}