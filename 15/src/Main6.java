
public class Main6 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[bfgi]", "あ");
		
		System.out.println(w);
	}

}
