import java.util.HashMap;
import java.util.Map;

public class Main24 {
	public static void main(String[] args) {
		Map<String,Integer> prefs = new HashMap<String,Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都");
		System.out.println("東京の人工は"+ tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人工は"+ kumamoto);
	}

}
