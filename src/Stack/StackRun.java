package Stack;


import static java.lang.System.out;

public class StackRun {
    public static void main(String args[]) {
        int x = 10;
        StackDemo stack = new StackDemo(10);

        stack.pop(x);

        for (int i = 0; i < x; i++){
            out.println(stack.push());
        }
    }
}