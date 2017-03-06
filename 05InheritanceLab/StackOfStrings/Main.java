package StackOfStrings;

public class Main {
    public static void main(String[] args) throws Exception {

        StackOfStrings sos = new StackOfStrings();
        sos.push("pesho");
        sos.push("gosho");
        sos.push("mimi");

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
