import java.util.Scanner;


class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class Runner {
	private static Scanner s= new Scanner(System.in);
	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		print(Solution.bubbleSort(input()));
	}
}
public class Solution {



	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        LinkedListNode<Integer> r=head;
        LinkedListNode<Integer> p=null;
		LinkedListNode<Integer> q=null;
        LinkedListNode<Integer> s=null;
        LinkedListNode<Integer> temp=null;
        
        while(s!=head.next){
            r=p=head;
            q=p.next;
            while(p!=s){
                if(p.data>q.data){
                    if(p==head){
                        temp=q.next;
                        q.next=p;
                        p.next=temp;
                        head=q;
                        r=q;
                    }
                    else{
                        temp=q.next;
                        q.next=p;
                        p.next=temp;
                        r.next=q;
                        r=q;
                    }
                }
                else{
                    r=p;
                    p=p.next;
                }
                q=p.next;
                    if(q==s){
                        s=p;
                    }
            }
            }
        return head;
        }
