package jp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static boolean checkDayYYYYMMDD(String string) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
			Date date = sdf.parse(string);
			return sdf.format(date).equals(string);
		} catch (Exception e) {
			return false;
		}

	}

}
