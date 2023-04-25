package com.example.payroll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeePayrollInformation {
    public static void main(String[] args) {
        //Read employee data from file
        //Generate info
        //Print it out
        try {
            FileReader fileReader = new FileReader("PayDataFile");
            BufferedReader buferedReader = new BufferedReader(fileReader);
            String input;
            while ((input = buferedReader.readLine()) != null) {
                String[] subStrings =
                        input.split("//|");
                Employee e =
                        new Employee(subStrings[0],subStrings[1],Double.parseDouble(subStrings[2]),Double.parseDouble(subStrings[3]));
                System.out.printf("%s %s $%.2f\n",e.getEmployeeID(),e.getEmployeeName(),e.getGrossPay());


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
