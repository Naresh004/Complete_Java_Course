package java1;

public class llRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist list = new Linkedlist();
		list.insert(10);
		list.insert(11);
		list.insert(12);
		list.insert(13);
		list.insert(14);
		
		list.inserAtstart(9);
		
		list.inserAtPOS(3,55);
		
		list.deleteAt(2);
		list.show();
	}

}
