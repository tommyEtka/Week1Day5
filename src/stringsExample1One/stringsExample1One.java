package stringsExample1One;

public class stringsExample1One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String s = "Hello";
		//s = s + " World";
		
		s= s.concat(" World");
		//line 11 and line 13 do the exact same thing
		
		System.out.println(s);
		//prints out the string s
		
		System.out.println(s.substring(1));
		//prints out the second character
		
		System.out.println(s.substring(1,4));
		//exclusive, so it skips the fourth character

	}

}
