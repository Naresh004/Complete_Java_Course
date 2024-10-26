package java1;


//class Node {
//		int data;
//		Node next;
//}
public class CompletesingleLinketlist {
	
	Node head;
	
	public void inserts(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	public void inserAtPOSi(int index,int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		Node n = head;
		for(int i=0;i<index-1;i++) {
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
			Node n1 = n.next;
			n.next = n1.next;
		}
	}
	
	public void show() {
		
		Node n = head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
			
		}
		System.out.print(n.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompletesingleLinketlist list = new CompletesingleLinketlist();

		list.inserts(12);
		list.inserts(13);
		list.inserts(14);
		
//		list.inserAtstart(9);
//		
		list.inserAtPOSi(1,55);
//		
//		list.deleteAt(2);
		list.show();
	}

}
