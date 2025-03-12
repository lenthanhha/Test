
package pkg1_3_2025;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Tag.S;

class Node{
    int data; Node next;
    Node(int x){data = x; next = null;}
    Node(int x, Node t) {data = x; next = t;}
    
    @Override
    public String toString(){return data+" ";}
}

public class MyQueue {
    Node head, tail;
        MyQueue() {head=tail=null;}
        boolean EmptyQ(){return head==null;}
        
        void nhap(){
            Scanner kb = new Scanner(System.in); int x;
            while (true){
                System.out.println("Nhap so x <>0: "); x = kb.nextInt();
                if (x==0) break; else AddQ(x);
            }
        }
        
        void in(){
            System.out.println("\n Noi dung hang doi:");
            MyQueue t = new MyQueue();
            while(!EmptyQ()) {int x = RemoveQ(); System.out.println(" "+ x); t.AddQ(x);}
            while(!t.EmptyQ()) this.AddQ(t.RemoveQ());
        }
        
        void tong(){
            MyQueue t = new MyQueue(); int k = 0;
            while(!EmptyQ()) {int x = RemoveQ(); k = k + x; t.AddQ(x);}
            while(!t.EmptyQ()) this.AddQ(t.RemoveQ());
            System.out.println("\n Tong cac so trong hang doi = " + k);
        }
        
        void AddQ(int x){
            Node t = new Node(x);
            if(head==null) head= tail= t;
            else { tail.next= t; tail= t; }
        }
        
        int RemoveQ(){
            int x = 0;
            if(head == null) System.out.println("\n Hang doi rong");
            else{
                x = head.data;
                if(head.next==null) head=tail=null;
                else head = head.next;
            }
            return x;
        }
    
    public static void main(String[] args) {
        
            MyQueue Q= new MyQueue();
            Q.nhap(); Q.in(); Q.tong(); 
//            Q.AddQ(3); Q.AddQ(2);Q.AddQ(7);Q.AddQ(6);
//            while (!Q.EmptyQ()){ int x= Q.RemoveQ(); System.out.println( x + " ");  }
            System.out.println("\n XONG");
    }
    
}
