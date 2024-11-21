package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class truyxuatxeconghetrong implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String username = (String) execution.getVariable("username");
        String busType = (String) execution.getVariable("bustype");
        String busroute = (String) execution.getVariable("busroute");
        String phonenumber = (String) execution.getVariable("phonenumber");
        String shedule = (String) execution.getVariable("schedule");
        System.out.println("Xin chao: " +username);
        if(shedule.equals("0h-5h") || shedule.equals("Không chọn") ){
            execution.setVariable("quantity",0);
        }else {
            execution.setVariable("quantity",10);
        }
        System.out.println("Ban da chon loai xe: " +busType + ", cho tuyen duong: " + busroute);
        System.out.println("Khung gio: " + shedule);


    }
}
