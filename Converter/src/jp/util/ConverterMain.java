package jp.util;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Optional;

public class ConverterMain {


	/**
	 * BASE64でエンコードした文字列を返す。
	 * nullの場合はnullを返す。
	 * @param src 変換前テキスト文字列
	 * @return BASE64変換後文字列
	 */
	public static Optional<String> Encode(String src) {
		if(src == null) {
			return null;
		}
		Encoder encoder = Base64.getEncoder();

		return Optional.ofNullable(encoder.encodeToString(src.getBytes()));
	}
}
