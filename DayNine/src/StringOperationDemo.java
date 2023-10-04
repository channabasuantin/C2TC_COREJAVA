
public class StringOperationDemo {

	public static void main(String[] args) {
		
		/*immutable strings,and it cannot change* 1.string literal 2.new keyword string*/
		
		String s1=new String("    channabasu  ");
		String s2=s1.concat(" anteen");
		System.out.println(s2);    //channabasu anteen
		
	
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		String s4=s3.toLowerCase();
		System.out.println(s4);
		
		System.out.println(s1.length());
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(2, 6));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		
		
		/*Mutable Strings can be created with the help of buffers and builders*/
		
		
		StringBuffer sb=new StringBuffer("study");
		String r=s2.replaceAll(s2, " night");
		System.out.println(sb.append(r));
		System.out.println(sb.length());//no of characters including spaces
		System.out.println(sb.capacity());//default capacity is 16 irrespective of input
		
		
		
		
		
		
		StringBuffer s=new StringBuffer(200);
		System.out.println(s.capacity());//200
		/*if input is number,it exact print number only,exact input as capacity*/
		
	}

}
