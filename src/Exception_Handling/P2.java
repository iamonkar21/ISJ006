package Exception_Handling;

public class P2 {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("Number is not divisible by Zero ! Try different Number");
        }
        finally {
            System.out.println("This is onkar date ....");
        }
    }
}
