import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main16 {
	public static void main(String[] args) {
//		現在日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
//		取得した日時をCalendarにセット
		c.setTime(now);
//		Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
//		取得した値に100を足してCalendarの「日」にセット
		day  += 100;
		c.set(Calendar.DAY_OF_MONTH,day);
//		指定された形式で表示
		SimpleDateFormat f =
				new SimpleDateFormat("西暦YYYY年MM月dd日");
		System.out.println(f.format(now));
	}

}