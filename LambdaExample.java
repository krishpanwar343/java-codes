interface Calculator {
    int compute(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        int result = add.compute(5, 3);
    }
}
