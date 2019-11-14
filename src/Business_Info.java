/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocomo;

/**
 * This class will store the information of the organization that will
 * be developing a software product.
 * Stores number of employees, average hours worked per month of each employee,
 * average employee monthly pay, and company budget for this software. -ke
 */


/************************************************************************
 * This class has no use yet, so it will probably end up being deleted  *
 ************************************************************************/

public class Business_Info {
    
    private int numEmployees;
    private double avgTimeWorked;
    private double avgMonthlyPay;
    
    //the lower and upper bounds of the company's budget
    private double companyBudgetLow;
    private double companyBudgetHigh;
    
    
    Business_Info() {
        
        numEmployees = 10;
        avgTimeWorked = 160.00;
        avgMonthlyPay = 5000.00;
        companyBudgetLow = 50000;
        companyBudgetHigh = 100000;
        
    }
    
    
    
    
    
    
    
}
