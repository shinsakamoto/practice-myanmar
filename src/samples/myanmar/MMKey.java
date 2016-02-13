package samples.myanmar;

import java.util.ArrayList;
import java.util.List;

public class MMKey {

	public char unicode;

	public static final List<MMKey> ALL_MM_KEYS = new ArrayList<>();

	static {
		char mmkey = 0x1000;
		for (int i = 0; i < 160; i++) {
			ALL_MM_KEYS.add(new MMKey(mmkey));
			mmkey++;
		}
	}

	public MMKey(char unicode) {
		this.unicode = unicode;
	}

	public static List<MMKey> getAllMMKeys() {
		return ALL_MM_KEYS;
	}

	public String toUnicode() {
		return Character.toString(unicode);
	}

	public String toHexUnicode() {
		return Integer.toHexString(unicode).toUpperCase();
	}

	@Override
	public String toString() {
		return Character.toString(unicode);
	}

}
