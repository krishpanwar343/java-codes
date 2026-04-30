public class EX2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("invailid index");
        }
    }
}
