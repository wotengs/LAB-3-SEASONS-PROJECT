package com.company;
public class YearRange {
    public int year1;
    public  int year2;
    public int modulus1;
    public int modulus2;
    public  int firstDivisor=14;
    public  int secondDivisor= 20;
    public int rangeType;



    public YearRange(int a, int b){
        this.year1=a;
        this.year2=b;
    }
    public void setRangeType(int c){
        rangeType=c;

    }
    public int  getFirstDivisor(){
        if(rangeType==1){
         System.out.println( firstDivisor);}
        else {
            firstDivisor=3;
        }
         return firstDivisor;
    }
    public int getSecondDivisor(){
        System.out.println(secondDivisor);
        return secondDivisor;
    }
    public void printYears(){
        if(rangeType==1) {
            while (year1 <= year2) {
                modulus1 = year1 % 14;
                modulus2 = year1 % 20;

                if (modulus1 == 0 && modulus2 == 0) {
                    System.out.println(year1);
                }
                year1++;
            }
        }
        else if(rangeType==2){
            while(year1<=year2){
                modulus1=year1%4;
                if(modulus1==0){
                    System.out.println( year1);
                }
                year1++;
            }
        }
        else{
            while(year1<=year2){
                modulus2=year1%4;
                modulus1=year1%3;
                if(modulus1==0 && modulus2==0){
                    System.out.println( year1);
                }
                year1++;
            }
        }
    }
    public int  getFirstYear(){

       return year1;
    }
    public int  getSecondYear(){

        return year2;
    }


}


