/*
Given an array of integer arr. Your task is to construct the linked list from arr & return the head of the linked list.
*/
/*
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}
*/
class Solution {
    static Node constructLL(int arr[]) {
        // code here
        if(arr.length==0)
        {
            Node head=new Node();
            return head;
        }
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node currentNode=new Node(arr[i]);
            temp.next=currentNode;
            temp=temp.next;
        }
        return head;
    }
}
