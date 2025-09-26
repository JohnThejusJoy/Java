package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLista {
public static void main(String[] args) {
	ArrayList<String> movies = new ArrayList<String>();
	movies.add("Leo");
	movies.add(0,"Anjaan");
	movies.add("Ben10");
	movies.set(2, "Singam");
	movies.remove(2);
	//System.out.println(movies);
	int size = movies.size();
	//System.out.println(size);
	for(int i=0;i<movies.size();i++) {
	//	System.out.println(movies.get(i));
	}
	for(String i:movies) {
	//	System.out.println(i);
	}
	Iterator<String> it = movies.iterator();
	while(it.hasNext()) {
		String item = it.next();
		System.out.println(item);
	}
}
}
