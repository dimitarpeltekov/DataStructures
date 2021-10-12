import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(13);

        stack.push(24);


        stack.push(73);


       stack.forEach(System.out::println);


    }
}
