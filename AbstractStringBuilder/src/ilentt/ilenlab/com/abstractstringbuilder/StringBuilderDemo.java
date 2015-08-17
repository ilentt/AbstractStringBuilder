package ilentt.ilenlab.com.abstractstringbuilder;

public class StringBuilderDemo {

	public StringBuilderDemo() {
		// constructor
	}
	
	public void BuilderDemo() {
		// innit a string builder with 10 character
		StringBuilder sb = new StringBuilder(10);
		
		// append a text into string
		sb.append("Hello...");
		System.out.println("sb after append a string: " + sb);
		
		// append a character into string
		char c = '!';
		sb.append(c);
		System.out.println("sb after append a character: "+sb);
		
		// insert a string at 5 index
		sb.insert(5, "Java");
		System.out.println("sb after insert a string at 5 index: " + sb);
		
		// delete substring
		sb.delete(5, 8);
		System.out.println("sb after delete between index 5 and 8: " + sb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilderDemo s = new StringBuilderDemo();
		s.BuilderDemo();
	}
	

}
