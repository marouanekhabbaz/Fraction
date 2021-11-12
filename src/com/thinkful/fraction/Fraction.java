package com.thinkful.fraction;

import java.util.Objects;

public class Fraction {
    public int numerator ;
    private  int denominator ;

    public Fraction(){
        this(1, 1);
    }

    public   Fraction( int numerator , int denominator){
        if(denominator == 0){
            try {
                throw new Exception("denominator should be different than 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0){
            try {
                throw new Exception("denominator should be different than 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator  + "/"+
               + denominator ;
    }

    public Fraction add( Fraction fraction){

        int communDenominator;
        int communNumerator;
        if(denominator == fraction.denominator){
            communDenominator = denominator;
            communNumerator = this.numerator + fraction.getNumerator();
        }else{
            communDenominator = this.denominator * fraction.getDenominator();
            communNumerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        }



        return new Fraction(communNumerator, communDenominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }


}
