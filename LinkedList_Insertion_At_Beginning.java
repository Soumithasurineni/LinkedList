/*
Given the head of a Singly Linked List and a value x, insert that value x at the beginning of the LinkedList and return the modified Linked List.
*/
class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        Node node=new Node(x);
        node.next=head;
        head=node;
        return head;
    }
}
