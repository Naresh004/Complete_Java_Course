package java1;

class Bikecon {
	int id;
	String Name;
	int age;
	Bikecon(int i,String n){
		id=i;
		Name=n;
	}
	Bikecon(int i,String n,int m){
		id=i;
		Name=n;
		age=m;
	}
	void display() {
		System.out.println("bike is created :"+id+","+Name+" "+age);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bikecon b=new Bikecon(111,"karan");
	Bikecon b1=new Bikecon(111,"karan",12);
	b.display();
	}

}
