package DataStructure.stack;

import java.util.EmptyStackException;

public class Stack {

    private class ListNode {
        ListNode next;
        int data;

        ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode top;

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;

    }


    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        return data;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);





    }
}
