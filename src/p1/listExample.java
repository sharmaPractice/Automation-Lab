package p1;

import java.util.ArrayList;
import java.util.List;

public class listExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("ACF");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		l.forEach((n)->System.out.println(n));
		l.stream().forEach(listofelements -> System.out.println(listofelements));

	}

}
