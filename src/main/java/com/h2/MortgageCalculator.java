package com.h2;

public class MortgageCalculator {
    private long loanAmount;
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;

    public MortgageCalculator(long loanAmount, int termInYears, float annualRate) {
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.annualRate = annualRate;
    }
    private int getNumberOfPayments(){
        termInYears = termInYears *12;
        return termInYears;
    }
    private float getMonthlyInterestRate(){
        float interestRate = (annualRate / 100) + (termInYears / 12);  //7
        return  interestRate;
    }
    public void calculateMonthlyPayment(){
        long p = loanAmount;
        float r = getMonthlyInterestRate();
        int n = getNumberOfPayments();
        p *(((r * Math.pow(1 + r, n ))) / ((Math.pow((1 + r), n) - 1));
        double M = this.monthlyPayment;
    }
}
