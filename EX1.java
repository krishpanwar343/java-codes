public class EX1{
    public static void main(String[]args){
        int a = 10, b = 0;
        try{
        int result = a/b;
        System.out.print(result);
        }
        catch(ArithmeticException exception){
            System.out.print("Error: not defined");
        }
    }
}