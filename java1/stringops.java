package java1;
class stringops {
	public static void main(String args[]) {
		String s1="Sachin ";
		String s2="SACHIN ";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(0,2));
		System.out.println(s1.toUpperCase());//SACHIN    
		System.out.println(s1.toLowerCase());
	}

}
