package jp.util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Optional;

public class ConverterMain {


	/**
	 * BASE64でエンコードしたテキストを返す。
	 * nullの場合はnullを返す。
	 * @param src プレーンテキスト
	 * @return BASE64変換後テキスト
	 */
	public static Optional<String> Encode(String src) {
		if(src == null) {
			return null;
		}
		Encoder encoder = Base64.getEncoder();

		return Optional.ofNullable(encoder.encodeToString(src.getBytes()));
	}

	/**
	 * BASE64でデコードしたテキストを返す。
	 * nullの場合はnullを返す。
	 * @param dest BASE64変換後テキスト
	 * @return プレーンテキスト
	 */
	public static Optional<String> Decode(String dest) {
		if(dest == null) {
			return null;
		}
		Decoder decoder = Base64.getDecoder();

		return Optional.ofNullable(new String(decoder.decode(dest)));
	}

}
