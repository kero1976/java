package jp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {

	public static boolean checkDayYYYYMMDD(String string) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
			Date date = sdf.parse(string);
			return sdf.format(date).equals(string);
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean checkTimeHHMM(String string) {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        try {
			Date date = sdf.parse(string);
			return sdf.format(date).equals(string);
		} catch (Exception e) {
			return false;
		}
	}

}
