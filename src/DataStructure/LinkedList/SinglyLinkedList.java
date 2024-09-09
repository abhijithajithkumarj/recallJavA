package DataStructure;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;


    private static class  ListNode{
    private int data;
    private ListNode nextNode;
    public  ListNode (int data){
        this.data=data;
        this.nextNode=null;
    }

    }

    public void  display(){
        ListNode current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.nextNode;
        }
    }

    public  int  findSize(){
        int count =0;
        ListNode current=head;
        while (current!=null){
            count++;
            current =current.nextNode;
        }
        return count;
    }


    public void add(int value){
        ListNode newNode=new ListNode(value);
        newNode.nextNode=head;
        head=newNode;
    }


    public void  remove(int value){

        ListNode current=head;

        while(head!=null && head.data==value){
            head=head.nextNode;
        }

        while(current!=null && current.nextNode!=null){
            if (current.nextNode.data==value){
                current.nextNode=current.nextNode.nextNode;
            }
            else {
                current=current.nextNode;
            }
        }
    }

    public void removeOdd() {

        while (head != null && head.data % 2 != 0) {
            head = head.nextNode;
        }

        ListNode current = head;
        while (current != null && current.nextNode != null) {
            if (current.nextNode.data % 2 != 0) {
                current.nextNode = current.nextNode.nextNode;
            } else {
                current = current.nextNode;
            }
        }

        display();
    }

    public void removeDuplicateSorted(){

        ListNode current=head;
        while(current!=null && current.nextNode!=null){
            if (current.data==current.nextNode.data){
                current.nextNode=current.nextNode.nextNode;
            }else {
                current = current.nextNode;
            }
        }



        display();

    }

    public void removeDuplicate() {
        ListNode current = head;

        while (current != null) {
            ListNode runner = current;

            while (runner.nextNode != null) {
                if (runner.nextNode.data == current.data) {

                    runner.nextNode = runner.nextNode.nextNode;
                } else {
                    runner = runner.nextNode;
                }
            }

            current = current.nextNode;
        }

        display();
    }

    public void sort() {
        if (head == null || head.nextNode == null) {
            return;
        }

        ListNode current = head;

        while (current != null) {
            ListNode runner = current.nextNode;

            while (runner != null) {

                if (current.data > runner.data) {

                    ListNode temp = current;
                    current = runner;
                    runner = temp;
                }
                runner = runner.nextNode;
            }

            current = current.nextNode;
        }
        display();
    }


    public boolean  detectLoop(){
        ListNode fasterPoint=head;
        ListNode slowPointer=head;

        while (fasterPoint!=null && fasterPoint.nextNode!=null){
            fasterPoint=fasterPoint.nextNode.nextNode;
            slowPointer=slowPointer.nextNode;
            if (fasterPoint==slowPointer) {
                System.out.println(getStartingNode(slowPointer).data);
                return true;
            }
        }
        return false;
    }


    private ListNode getStartingNode(ListNode slowerNode){
        ListNode temp =head;
        while (slowerNode!=temp){
            temp=temp.nextNode;
            slowerNode=slowerNode.nextNode;
        }
        return temp;
    }





    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);


        System.out.println("Original Linked List:");
        sll.display();


        ListNode loopNode = sll.head.nextNode.nextNode;
        ListNode lastNode = sll.head;


        while (lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
        }

        lastNode.nextNode = loopNode;

        System.out.println("Checking for loop in the linked list:");
        boolean hasLoop = sll.detectLoop();
        System.out.println("Does the linked list have a loop? " + hasLoop);
    }


}
