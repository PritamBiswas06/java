package EnumExamples;

public class AB {
    void ab() {
        System.out.println("It cannot be extended by enum");
    }

    public static void main(String[] args) {
        AB a =new AB();
        a.ab();
    }
}
