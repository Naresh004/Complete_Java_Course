package java1;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		sb.reverse(); 
		System.out.println(sb);//prints Hello Java
		
		System.out.println(sb.capacity());  
		sb.append("Hello");    
		System.out.println(sb.capacity());   
		sb.append("Java is my favourite language");    
		System.out.println(sb.capacity());//now (22*2)+2=46 i.e (oldcapacity*2)+2    

	}

}
