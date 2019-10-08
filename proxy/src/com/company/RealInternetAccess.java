package com.company;

public class RealInternetAccess implements UIOfficeInternetAccess {
    private String _employeeName;
    private int _role;
    public RealInternetAccess(String empName, int role) {
        this._employeeName = empName;
        this._role = role;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ _employeeName);
    }
}
