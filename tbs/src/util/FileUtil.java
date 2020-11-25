package util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class FileUtil {
	public static BufferedImage loadImage(String path) {
		return loadImage(Paths.get(path));
	}
	
	public static BufferedImage loadImage(Path path) {
		try {
			return ImageIO.read(path.toFile());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String loadText(String path) {
		return loadText(Paths.get(path));
	}

	public static String loadText(Path path) {
		try {
			byte[] bytes = Files.readAllBytes(path);
			return new String(bytes, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
