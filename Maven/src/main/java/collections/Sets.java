package collections;
import java.util.*;
public class Sets {
public static void main(String[] args) {
	Set<String> characters = new TreeSet<>();
	characters.add("Rajubhai");
	characters.add("Leo");
	characters.add("Vikram");
	System.out.println(characters.contains("Rajubhai"));
	System.out.println(characters.size());
	Set<String> morechars = new HashSet<>();
	morechars.add("Masss");
	morechars.add("George");
	characters.addAll(morechars);
	System.out.println(characters);
	System.out.println(morechars);
	characters.retainAll(morechars);
	System.out.println(characters);
	System.out.println(characters.isEmpty());
	//characters.clear();
	//System.out.println(characters);
	Iterator<String> it = characters.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
