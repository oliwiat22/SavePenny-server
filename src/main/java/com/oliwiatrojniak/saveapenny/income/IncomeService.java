package com.oliwiatrojniak.saveapenny.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IncomeService {

  IncomeRepository incomeRepository;

  @Autowired
  IncomeService(IncomeRepository incomeRepository) {
    this.incomeRepository = incomeRepository;
  }

  IncomeDto addIncome(AddIncome newIncome){

    Income income = new Income(newIncome.name, newIncome.price);
    incomeRepository.save(income);
    return income.convertToDto();

  }

  void deleteIncome(DeleteIncome toDeleteIncome){
    incomeRepository.deleteById(toDeleteIncome.id);
  }

  IncomeDto findIncome(Long id) {
    final Optional<Income> foundIncome = incomeRepository.findById(id);
    if (foundIncome.isPresent()) {
      return foundIncome.get().convertToDto();
    } else {
      throw new IncomeNotFound(id.toString());
    }
  }

  List<IncomeDto> showIncomes() {
    return incomeRepository.findAll().stream()
        .map(income -> income.convertToDto())
        .collect(Collectors.toList());
  }

}
