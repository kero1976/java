package jp.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateUtilTest {
	@Test
	void 正常系() {
		assertTrue(DateUtil.checkDayYYYYMMDD("20200101"));
		assertTrue(DateUtil.checkDayYYYYMMDD("20201231"));
	}

	@Test
	void 異常系() {
		assertFalse(DateUtil.checkDayYYYYMMDD("20200000"));
		assertFalse(DateUtil.checkDayYYYYMMDD("20201232"));
		assertFalse(DateUtil.checkDayYYYYMMDD("2020122"));
		assertFalse(DateUtil.checkDayYYYYMMDD(""));
		assertFalse(DateUtil.checkDayYYYYMMDD(null));
	}
}
