package util;

public class ColourUtil {
	/* Blending colours properly is quite complicated but this is just a budget version. */
	public static int blend(int colour1, int colour2, double ratio) {
		int result = 0;
		
		for (int shift = 0; shift != 24; shift += 8) {
			int component1 = (colour1 >> shift) & 0xff;
			int component2 = (colour2 >> shift) & 0xff;
			int component = (int)(component1 * ratio + component2 * (1 - ratio));
			result |= component << shift;
		}
		
		return result;
	}
}
