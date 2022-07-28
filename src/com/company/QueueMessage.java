package com.company;

import java.util.Scanner;

public class QueueMessage {
    private Stack stack;
    private Queue queue;
    private Scanner sc;
    public QueueMessage(){
        stack= new Stack();
        queue= new Queue();
        sc = new Scanner(System.in);
    }
    public void inputMessage(){
        while (true){
            System.out.println("Input message: ");
            String message = sc.nextLine();
            if(StringUtilities.checkString(message)==1) System.out.println("Message is empty!");
            else if(StringUtilities.checkString(message)==2) System.out.println("Length message > 250!");
            else {
                queue.enqueue(message);
                break;
            }
        }
    }
    public void sendMessage(){
        while(!queue.isEmpty()){
            String message = queue.dequeue();
            stack.push(message);
        }
        System.out.println("Send successfully");
    }
    public void viewMessage(){
        System.out.println("-----------------------------------");
        System.out.println("Received message/View message");
        System.out.println("-----------------------------------");
        while (!stack.isEmpty()){
            String message = stack.pop();
            System.out.println(message);
        }
        System.out.println("-----------------------------------");
    }
}
