package jp.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class ConvertMainTest1 {

	@Test
	void testEncode正常系() {
		Optional<String> result = ConverterMain.Encode("abcdefg");
		assertEquals("YWJjZGVmZw==",result.get());
	}

	@Test
	void testEncodeNullテスト() {
		Optional<String> result = ConverterMain.Encode(null);
		assertEquals(null,result);
	}

	//@Test
	void testEncode1M() {
		byte[] data = new byte[1000000];
		Optional<String> result = ConverterMain.Encode(data.toString());
		assertEquals("YWJjZGVmZw==",result.get());
	}

	@Test
	void testDecode正常系() {
		Optional<String> result = ConverterMain.Decode("YWJjZGVmZw==");
		assertEquals("abcdefg",result.get());
	}
}
