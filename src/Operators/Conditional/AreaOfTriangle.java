package Operators.Conditional;

public class AreaOfTriangle {
    public static void main(String[] args){

        char c = 'D';
        System.out.println((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? c + " is an alphabet.": c + " is not an alphabet.");
    }
}
