import java.util.ArrayList;
import java.util.List;

public class Main26 {
	public static void main(String[] args) {
		Hero1 h1 = new Hero1();
		h1.name = "Minato";
		List<Hero1>list = new ArrayList<Hero1>();
		list.add(h1);
		h1.name = "Sugawara";
		System.out.println(list.get(0).name);
	}

}
