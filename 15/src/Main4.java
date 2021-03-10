
public class Main4 {
	public static void main(String[] args) {
		StringBuilder sd = new StringBuilder();
		for(int i = 0;i < 10000;i++) {
			sd.append("Java");
		}
		String s = sd.toString();
		System.out.println(s);
	}
	
	public boolean isValedPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
