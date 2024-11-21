package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class thongbaothanhtoanthatbaivahuydatxe implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Thanh toan that bai huy dat xe");
    }
}
