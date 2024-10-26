package java1;

public class CompleteDLL {

	class Node {
		int data;
		Node next;
		Node prev;
		}
	Node head,tail;
	public void insert(int data) {
		
		Node node = new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			node.prev=n.next;
			node.next=null;
		}
		
	}
	
	public void deleteatbeg() {
		
		if(head==null) {
			System.out.print("cannot perform");
		}else {
			head=head.next;
		}
		
	}
	
	public void display() {
		Node n = head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}System.out.print(n.data+" ");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteDLL DLL = new CompleteDLL();
		DLL.insert(5);
		DLL.insert(6);
		DLL.insert(7);
//		DLL.insert(9);
		
		DLL.deleteatbeg();
		
		DLL.display();

	}

}
