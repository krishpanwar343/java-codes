enum Status {
    ACTIVE, INACTIVE, PENDING
}

public class EnumExample {
    public static void main(String[] args) {
        Status s = Status.ACTIVE;
        if (s == Status.ACTIVE) {
            System.out.println("Running");
        }
    }
}
