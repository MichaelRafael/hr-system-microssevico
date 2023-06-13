package br.com.michael.payrollapi.controller;

import br.com.michael.payrollapi.model.Payroll;
import br.com.michael.payrollapi.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @GetMapping(value = "/{workedId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workedId, @RequestBody Payroll payment) {

        return ResponseEntity.ok().body(payrollService.getPayroll(workedId, payment));
    }
}
