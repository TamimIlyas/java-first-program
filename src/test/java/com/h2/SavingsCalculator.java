package com.h2;
import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for (int i = 0; i <= credits.length; i++) {
            sum = + credits[i];
        }
    }
    private float sumOfDebits() {
        float sum = 0.0f;
        for (int i = 0; i <= debits.length; i++) {
            sum = + debits[i];
        }
    }
    private static  int  remainingDaysInMonth(LocalDate date) {            //9, 10
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
    }
    public float calculate(){
        return sumOfCredits() - sumOfDebits();

    }
    public static void main(String[] args){
        String[] creditsAsString = args[0].split(",");
        String[] debitsAsString = args[1].split(",");
        float[] credits = new float .length


    }

}