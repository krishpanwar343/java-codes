public class loop4{
    public static void main(String args[]){
        int Stockcount = 5;
        int i = Stockcount;
        while(i >= 0){
            System.out.println("available stock is :" +i);
            i--;
            if(i==0){
                System.out.println("stock is not available!");
                break;
            }
        }
        
    }
}