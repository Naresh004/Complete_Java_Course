package java1;
import java.util.*;
public class Linkedlist {
	
	Node head;
	
	public void insert(int data) {
		Node node=new Node();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;			
		}
	}
	
	public void inserAtstart(int data) {
		Node node=new Node();
		node.data = data;
		node.next = null;
	
		node.next=head;
		
		head=node;	
	}
	
	public void inserAtPOS(int index, int data) {
		Node node=new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	
	public void deleteAt(int index) {
		
		if(index==0) {
			head = head.next;
		}
		else
		{
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			Node n1=n.next;
			n.next=n1.next;
		}
		
	}

	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
 