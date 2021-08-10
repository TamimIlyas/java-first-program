package com.h2;
import java.time.LocalDate;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        return 0.0f;                            //6
    }

    private float sumOfDebits() {               //7
        //return sumOfCredits();                //8
        float sum = 0.0f;
        return 0.0f;
    }
    private static  int  remainingDaysInMonth(int data, LocalDate date){            //9, 10
        LocalDate yearMonth = LocalDate.of(1, 2, 2);
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = date.getDayOfMonth();
        return 0;
    }
}