import java.util.Set;
import java.util.TreeSet;


public class Main23 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("cat");
		words.add("dog");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s+"→");
		}
	}

}
