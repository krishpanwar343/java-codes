public class insert { 
    public static void main(String[] args) { 
        StringBuffer buffer = new StringBuffer("Hello"); 
         
        buffer.insert(5, " Java"); 
         
        System.out.println("After insert: " + buffer); 
    } 
} 