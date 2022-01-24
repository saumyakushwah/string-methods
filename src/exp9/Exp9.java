package exp9;

public class Exp9 {

	public static void main(String[] args) {
		
		String s = "Saumya";
		String t = "Kushwah";
		String u = new String("Saumya");
		System.out.println("String s is: " + s);
		System.out.println("String t is: " + t);
		System.out.println("String u is: " + u);

		System.out.println("Length of the string: " + s.length());
		System.out.println("Concatenate s and t: " + s.concat(t));
		System.out.println("Is string s == u " + (s==u));
		System.out.println("Is string s equals u " + s.equals(u));
		System.out.println("Char at position 3: " + t.charAt(3));
		System.out.println("String in lowercase: " + s.toLowerCase());
		System.out.println("String in uppercase: " + s.toUpperCase());
		System.out.println("Substring of the default string " + s.substring(3,5));

		
		StringBuffer v = new StringBuffer("Saumya");
		StringBuffer w = new StringBuffer("Kushwah");

		v.append("Kushwah");
		System.out.println("Buffer string after append is " + v);
		
		w.insert(0, "Saumya");
		System.out.println("Buffer string after insert is " + v);
		
		v.delete(0,6);
		System.out.println("Buffer string after delete is " + v);
	}

}
