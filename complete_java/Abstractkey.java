package complete_java;

abstract class car{
	public abstract void drive();
	public void playmusic() {
		System.out.println("play music");
	}
}
class BMW extends car{
	public void drive() {
		System.out.println("drive ....");
	}
}
public class Abstractkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new BMW();
		obj.playmusic();
		obj.drive();
	}
}
