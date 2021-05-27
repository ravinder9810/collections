package listPrograms;

import java.util.Arrays;
import java.util.List;

public class Prac1_Joins {
	public String method(List<String> aa) {
		String str = String.join(">", aa);
		
		
		return str ;
		
	}
	public static void main(String[] args) {
		List<String> words = Arrays.asList(new String[] {"hello","world" , "2019"});
		Prac1_Joins obj = new Prac1_Joins();
		System.out.println(obj.method(words));
		 
	}

}
