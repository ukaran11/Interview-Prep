package stringManipulation;

public class TrimString {
	public static void main(String[] args) {
		String s ="   Hello   ";
		
		char a[] = s.toCharArray();
		int start = 0, end = a.length-1, count;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != ' ') {
				start = i;
				break;
			}
		}
		
		for(int i = a.length -1; i > start-1; i--) {
			if(a[i] != ' ') {
				end = i;
				break;
			}
		}
		
		count = end-start +1;
		
		String result = new String(a, start, count);
		System.out.println(result);
	}
}
