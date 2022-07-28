package com.company;
class QueueEmtpyException extends RuntimeException{
    private static final int serialVer = 39;
    public QueueEmtpyException(){
        super();
    }
    public QueueEmtpyException(String message){
        super(message);
    }
}
public class Queue {
    private class Node {
        String data;
        Node next;
    }

    private Node front, rear;
    private int queueSize;

    public Queue() {
        front = null;
        rear = null;
        queueSize = 0;
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    public String dequeue() {
        String data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        queueSize--;
        return data;
    }
    public void enqueue(String data){
        Node oldRear = rear;
        rear = new Node();
        rear.data =data;
        rear.next = null;
        if(isEmpty()){
            front = rear;
        }else{
            oldRear.next = rear;
        }
        queueSize++;
    }
    public String peek() throws QueueEmtpyException{
        if(front==null){
            throw  new QueueEmtpyException();
        }
        return front.data;
    }
}
