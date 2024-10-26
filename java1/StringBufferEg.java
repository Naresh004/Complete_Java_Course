package java1;

public class StringBufferEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hnnnnnnnnnn");
		sb.append("j");
		sb.insert(1,"innnnnnnnnnnnnnmmmm");
		System.out.println(sb);
		System.out.println(sb.length());

		System.out.println(sb.capacity());

	}

}
