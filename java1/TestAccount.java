package java1;

class Account{
	int accno;
	String name;
	float amount;
	
	void insert(int a,String n,float amnt) {
		accno=a;
		name=n;
		amount=amnt;
	}
	void deposit(float amnt) {
		amount+=amnt;
		System.out.println(amnt+"deposited");
		System.out.println(amount+"total balance");
	}
	void withdraw(float amnt) {
		if(amount<amnt) {
			System.out.print("insuufiecentfunds");
		}else {
			amount=amount-amnt;
			System.out.println(amnt+"withdrawn");
			System.out.println(amount+"total balance");	
		}
	}
}
class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();  
		a1.insert(832345,"Ankit",1000);    
		a1.deposit(40000);
		a1.withdraw(10000);

	}

}
