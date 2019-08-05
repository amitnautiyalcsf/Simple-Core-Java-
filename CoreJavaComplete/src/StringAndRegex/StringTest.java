package StringAndRegex;

public class StringTest {

	public static void main(String[] args) {
		
		new StringTest();

	}
	
	public StringTest() {
	
		String str1= "Hello"; // Here i am using the concept of string pool.
		String str2= "Hello";
		System.out.println(str1==str2);
		
		String str3= "Hello";
		
		modify(str3);
		System.out.println("Now :" + str3); // here the string will not be modified.// Reason is string is immutable.
		
		StringBuffer sbf = new StringBuffer(str1);
		
		modify(sbf);
		System.out.println("Now This Time : " +sbf);
		
		
		
		String str4= new String("Hello");// This time you explicitly creating two diff object so it will give false.
		String str5= new String("Hello");
		System.out.println(str4==str5);
		
		
		
		
	}

	private void modify(StringBuffer sbf) {
	
		sbf.append("guys");
		System.out.println(sbf);
		
	}

	private void modify(String str3) {
		str3= str3.concat("guys");
		System.out.println(str3);
		
		
	}

}
