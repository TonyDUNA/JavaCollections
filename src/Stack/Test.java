package Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 <- 3 <- 1

        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek()); // показ элемента
        System.out.println(stack.pop()); // вывод последнего элемента

        while (!stack.empty()) {
            System.out.println(stack.pop()); // для получения последних добавленных элементов
        }


    }
}
