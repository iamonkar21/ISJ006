package Operators.Conditional;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;
        System.out.println((year%4==0) ? year + " " + "is a leap year" : year + " " + "is not a leap year");
    }

}
