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
        float sum = 0.0f;    //6
        for (int i = 0; i <= credits.length; i++) {
            sum = +credits[i];


        }
    }
    private float sumOfDebits() {
        float sum = 0.0f;
        for (int i = 0; i <= debits.length; i++) {
            sum = +debits[i];
        }
    }
    private static  int  remainingDaysInMonth(int data, LocalDate date){            //9, 10
        LocalDate yearMonth = LocalDate.of(1, 2, 2);
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = date.getDayOfMonth();
        return 0;
    }
}