package com.oliwiatrojniak.saveapenny.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/income")
class IncomeController {

  private final IncomeService service;

  @Autowired
  public IncomeController(IncomeService service) {
    this.service = service;
  }

  @PostMapping("/add")
  public IncomeDto addIncome(@RequestBody AddIncome addIncome) {
    return service.addIncome(addIncome);
  }

  @GetMapping("/")
  public List<IncomeDto> showIncomes() {
    return service.showIncomes();
  }


  @DeleteMapping("/delete/{id}")
  public void deleteIncome(@PathVariable long id) {
    service.deleteIncome(new DeleteIncome(id));
  }

}
