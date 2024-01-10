package Operators.Conditional;

public class minOfThreeNum {
    public static void main(String[] args) {
        int a,b,c,d;
        a = 6;
        b = 4;
        c = 12;
        d = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        System.out.println(d);
    }
}
