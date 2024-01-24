package com.oliwiatrojniak.saveapenny.income;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IncomeRepository extends JpaRepository<Income, Long> {

}
