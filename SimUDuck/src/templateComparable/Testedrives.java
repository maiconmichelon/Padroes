package templateComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testedrives {

	public static void main(String[] args) {
		
		Duck d1 = new Duck("pato 1", 15 );
		Duck d2 = new Duck("pato 2", 10 );
		Duck d3 = new Duck("pato 3", 25 );
		Duck d4 = new Duck("pato 4", 8 );
		
		System.out.println(d1.compareTo(d4));
		System.out.println(d2.compareTo(d3));
		System.out.println(d4.compareTo(d2));
		System.out.println(d3.compareTo(d1));
		
		Duck[] ducks = new Duck[]{d1, d2, d3, d4};
		Arrays.sort(ducks);
		for (Duck duck : ducks) {
			System.out.println(duck);
		}
	}
}
