import java.util.*;

public class Prob {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push element to stack
        public void push(int data) {
            // Always add to the non-empty queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // Move elements from q1 to q2 or vice versa, leaving one element
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // Peek the top element of stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // Move elements to the  other queue and return the last removed element
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
