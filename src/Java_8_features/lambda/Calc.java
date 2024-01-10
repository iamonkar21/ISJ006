package Java_8_features.lambda;
public class Calc {
@FunctionalInterface
interface Cal {
    int add(int i , int j);
}
    public static void main(String[] args) {
        Cal calc = (i, j) -> i+j ;
        {
            System.out.println(calc.add(1,5));
        }
    }
}