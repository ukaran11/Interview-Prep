package stringManipulation;

class StringReverse {
	
	public static String reverseStringAnother(String str) {
		String s = "";
		
		for(int i=0; i<str.length(); i++) {
			s = str.charAt(i) + s;
		}
		
		return s;
	}
	
	public static void printReverseString(String s) {
		int start = 0;
		int end = s.length() -1;
		
		char[] ch = s.toCharArray();
		
		while(start < end) {
			char c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;
			
			start++;
			end--;
		}

		for(int i=0; i<s.length(); i++) {
			System.out.print(ch[i]+ "");
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(reverseStringAnother("hello"));
		printReverseString("hello");
		
	}
}
