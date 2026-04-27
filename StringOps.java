public class StringOps {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        boolean isEqual = s1.equals(s2);

        String replaced = s1.replace('e', 'a');

        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(0, 2);
    }
}