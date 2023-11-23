package College;

class Parent {
    private int privateVariable;

    public void setPrivateVariable(int value) {
        privateVariable = value;
    }

    public int getPrivateVariable() {
        return privateVariable;
    }
}

class Child extends Parent {
    public void changePrivateVariable(int value) {
        // Accessing the private variable using setter method from the parent class
        setPrivateVariable(value);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        // Accessing and modifying private variable indirectly
        child.changePrivateVariable(42);

        // Accessing private variable using getter method from the parent class
        System.out.println("Private Variable Value: " + child.getPrivateVariable());
    }
}
