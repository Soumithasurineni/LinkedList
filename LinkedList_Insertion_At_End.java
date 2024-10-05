/*
Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.
*/
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node node=new Node(x);
        Node temp=head;
        if(head==null)
        {
            return node;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        return head;
        
    }
}
