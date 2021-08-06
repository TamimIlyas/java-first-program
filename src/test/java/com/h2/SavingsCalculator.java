package com.h2;

public class SavingsCalculator {
    private float credits;
    private float debits;

    public SavingsCalculator(float credits, float debits) {
        this.credits = credits;
        this.debits = debits;
    }
    private float sumOfCredits(){
        float sum = 0.0f;
        return sum;
    }
    private float sumOfDebits(){
        float sum = 0.0f;
        return sum;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public float getDebits() {
        return debits;
    }

    public void setDebits(float debits) {
        this.debits = debits;
    }
}
