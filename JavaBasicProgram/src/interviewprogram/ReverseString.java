package interviewprogram;

public class ReverseString {

	public static void main(String[] args) {
		String input="harshal";
		//by converting string to array
		char[] try1=input.toCharArray();
		for(int i=try1.length-1;i>=0;i--);
		System.out.println(try1);
	}

}
