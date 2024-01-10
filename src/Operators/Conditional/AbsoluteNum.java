package Operators.Conditional;

public class AbsoluteNum {
    public static void main(String[] args) {
        int abs;
        int number = -5;
        abs= (number<0)? (-number): number;
        System.out.println(abs);
    }
}
