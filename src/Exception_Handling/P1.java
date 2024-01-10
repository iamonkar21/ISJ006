package Exception_Handling;

public class P1 {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("Number is not divisible by Zero ! Try different Number");
        }
    }
}
