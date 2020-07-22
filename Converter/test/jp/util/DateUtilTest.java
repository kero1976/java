package jp.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateUtilTest {
	@Test
	void 日付チェック正常系() {
		assertTrue(DateUtil.checkDayYYYYMMDD("20200101"));
		assertTrue(DateUtil.checkDayYYYYMMDD("20201231"));
	}

	@Test
	void 日付チェック異常系() {
		assertFalse(DateUtil.checkDayYYYYMMDD("20200000"));
		assertFalse(DateUtil.checkDayYYYYMMDD("20201232"));
		assertFalse(DateUtil.checkDayYYYYMMDD("2020122"));
		assertFalse(DateUtil.checkDayYYYYMMDD(""));
		assertFalse(DateUtil.checkDayYYYYMMDD(null));
	}

	@Test
	void 時刻チェック正常系() {
		assertTrue(DateUtil.checkTimeHHMM("0000"));
		assertTrue(DateUtil.checkTimeHHMM("0101"));
		assertTrue(DateUtil.checkTimeHHMM("1010"));
		assertTrue(DateUtil.checkTimeHHMM("2359"));
	}

	@Test
	void 時刻チェック異常系() {
		assertFalse(DateUtil.checkTimeHHMM("2400"));
		assertFalse(DateUtil.checkTimeHHMM("0061"));
		assertFalse(DateUtil.checkTimeHHMM("000"));
		assertFalse(DateUtil.checkTimeHHMM(""));
		assertFalse(DateUtil.checkTimeHHMM(null));
	}
}
