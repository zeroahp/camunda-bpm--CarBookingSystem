package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class xacnhanthutucthanhtoan implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String totalcost = (String) execution.getVariable("totalcost");
        String payment = (String) execution.getVariable("payment");

        System.out.println("Moi ban lua chon phuong thuc thanh toan!");
        System.out.println("Tong tien can phai thanh toan la: " + totalcost);
        System.out.println("Ban lua chon phuong thuc thanh toan: " + payment);


    }
}
