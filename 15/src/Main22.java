import java.util.HashSet;
import java.util.Set;

public class Main22 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		for(String s : colors) {
			System.out.print(s + "→");
		}
	}

}
