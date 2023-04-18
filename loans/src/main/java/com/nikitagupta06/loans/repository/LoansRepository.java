package com.nikitagupta06.loans.repository;

import com.nikitagupta06.loans.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loan, Long> {
    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}