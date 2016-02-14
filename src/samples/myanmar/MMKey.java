package samples.myanmar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MMKey {

	public char unicode;

	public static final List<MMKey> ALL_MM_KEYS = new ArrayList<>();
	public static final Map<Character, MMKey> ALL_MM_KEY_MAP = new HashMap<>();
	public static final List<MMKey> COMMON_MM_KEYS = new ArrayList<>();

	static {
		char mmkey = 0x1000;
		List<String> commonList = Arrays.asList(MM.COMMON);
		for (int i = 0; i < 160; i++) {
			MMKey key = new MMKey(mmkey);
			ALL_MM_KEYS.add(key);
			ALL_MM_KEY_MAP.put(key.unicode, key);
			if (commonList.contains(key.toUnicode())) {
				COMMON_MM_KEYS.add(key);
			}
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
