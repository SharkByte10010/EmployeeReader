package com.example.payroll;

public class Employee {
    private String employeeID;
    private String EmployeeName;
    private double HoursWorked;

    private double payRate;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", HoursWorked=" + HoursWorked +
                ", payRate=" + payRate +
                '}';
    }


    public Employee(String employeeID, String employeeName, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        EmployeeName = employeeName;
        HoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return HoursWorked * payRate;
    }
}
