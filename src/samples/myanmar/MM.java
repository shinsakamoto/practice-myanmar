package samples.myanmar;

public class MM {

	public static String convertJavaHexString(String text) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			buf.append("\\u");
			buf.append(Integer.toHexString(ch).toUpperCase());
		}
		return buf.toString();
	}

	public static String convertJavaScriptHexString(String text) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			buf.append("&#x");
			buf.append(Integer.toHexString(ch).toUpperCase());
			buf.append(";");
		}
		return buf.toString();
	}

	// 1000 - 1021
	public static final String KA = "\u1000";
	public static final String KHA = "\u1001";
	public static final String GA = "\u1002";
	public static final String GHA = "\u1003";
	public static final String NGA = "\u1004";
	public static final String CA = "\u1005";
	public static final String CHA = "\u1006";
	public static final String JA = "\u1007";
	public static final String JHA = "\u1008";
	public static final String NYA = "\u1009";
	public static final String NNYA = "\u100A";
	public static final String TTA = "\u100B";
	public static final String TTHA = "\u100C";
	public static final String DDA = "\u100D";
	public static final String DDHA = "\u100E";
	public static final String NNA = "\u100F";
	public static final String TA = "\u1010";
	public static final String THA = "\u1011";
	public static final String DA = "\u1012";
	public static final String DHA = "\u1013";
	public static final String NA = "\u1014";
	public static final String PA = "\u1015";
	public static final String PHA = "\u1016";
	public static final String BA = "\u1017";
	public static final String BHA = "\u1018";
	public static final String MA = "\u1019";
	public static final String YA = "\u101A";
	public static final String RA = "\u101B";
	public static final String LA = "\u101C";
	public static final String WA = "\u101D";
	public static final String SA = "\u101E";
	public static final String HA = "\u101F";
	public static final String LLA = "\u1020";
	public static final String A = "\u1021";

	public static final String ZERO = "\u1040";
	public static final String ONE = "\u1041";
	public static final String TWO = "\u1042";
	public static final String THREE = "\u1043";
	public static final String FOUR = "\u1044";
	public static final String FIVE = "\u1045";
	public static final String SIX = "\u1046";
	public static final String SEVEN = "\u1047";
	public static final String EIGHT = "\u1048";
	public static final String NINE = "\u1049";

	public static final String SIGN_TALL_AA = "\u102B";
	public static final String SIGN_AA = "\u102C";
	public static final String SIGN_I = "\u102D";
	public static final String SIGN_II = "\u102E";
	public static final String SIGN_U = "\u102F";
	public static final String SIGN_UU = "\u1030";
	public static final String SIGN_E = "\u1031";
	public static final String SIGN_AI = "\u1032";
	public static final String SIGN_MON_II = "\u1033";
	public static final String SIGN_MON_O = "\u1034";
	public static final String SIGN_E_ABOVE = "\u1035";
	public static final String SIGN_ANUSVARA = "\u1036";
	public static final String SIGN_DOT_BELOW = "\u1037";
	public static final String SIGN_VISARGA = "\u1038";
	public static final String SIGN_VIRAMA = "\u1039";
	public static final String SIGN_ASAT = "\u103A";
	public static final String SIGN_MEDIAL_YA = "\u103B";
	public static final String SIGN_MEDIAL_RA = "\u103C";
	public static final String SIGN_MEDIAL_WA = "\u103D";
	public static final String SIGN_MEDIAL_HA = "\u103E";

	public static final String SIGN_LITTLE_SECTION = "\u104A";
	public static final String SIGN_SECTION = "\u104B";

	public static final String[] COMMON = { KA, KHA, GA, GHA, NGA, CA, CHA, JA, JHA, NNYA, TA, THA, DA, DHA, NA, PA,
			PHA, BA, BHA, MA, YA, RA, LA, WA, SA, HA, LLA, A };
}
