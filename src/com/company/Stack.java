package com.company;
class StackEmptyException extends RuntimeException{
    private static final int serialVer = 39;
    public StackEmptyException(){
        super();
    }
    public StackEmptyException(String message){
        super(message);
    }
}
public class Stack {
    private class Node{
        String data;
        Node next;
    }
    private Node head;
    public Stack(){
        head= null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public String pop() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }
        String data = head.data;
        head = head.next;
        return data;
    }
    public void push(String value){
        Node oldHead = head;
        head= new Node();
        head.data = value;
        head.next= oldHead;
    }
    public String top() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }
        return head.data;
    }
}
