import java.util.HashSet;
import java.util.Set;

public class Main21 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("YELLOW");
		colors.add("RED");
		System.out.println("色は"+colors.size()+"種類");
		
	}

}
