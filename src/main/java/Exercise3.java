import java.util.Stack;

public class Exercise3 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        reverseStackByRecursion(st);
        System.out.println(st);

    }

    //all 3 methods of reverse will be called..then the insert function is called..
    //when we reach the exit case..
    //top will be holding the 3 values of stack then..
    public static void reverseStackByRecursion(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }//every recursion needs an exit strategy to avoid stackoverflow error

        int top = stack.pop(); // to get to base case to exit .. we need this line

        reverseStackByRecursion(stack);//recursive call

        insertInOppositeDirection(stack, top); // runs after recursive calls is done
    }

    //reverse method #3 calls insert first and lets it push 1(last popped element)
    //then insert method returns to reverse #2 .. which calls
    //insert method again .. now top will be 1 (we just inserted) and same method will
    //be called again .. now it is empty so 2 will be pushed..
    //after that .. 1 will be pushed before we got reverse #1 .. which will bring
    //the 3 that will be checking is stack is empty(it is not!) so it will pop the
    //1 first (which will be top value).. then will be called again ..and pop the 2
    //another top value..then stack is empty...then it will call the isempty which is
    //true now(exit case reached)..then will push the 2..then the 1(LIFO)
    public static void insertInOppositeDirection(Stack<Integer> stack,int num) {
        if (stack.isEmpty()) {
            stack.push(num);
            return;
        }
        // hold the top element and remove it
        int top = stack.pop();

        // recursively call to reach the bottom
        insertInOppositeDirection(stack, num);

        stack.push(top);
    }


    // my solution..and it is correct...but you want recursion..which is above
    public static void reverseStackElementsYahyaWay(Stack<Integer> st) {
        Stack<Integer> stack = new Stack<>();

        while (!st.isEmpty()) {
            int val = st.pop();
            stack.push(val);
        }

        st.addAll(stack);
    }
}
