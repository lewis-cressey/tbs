package util;

import java.nio.file.Path;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class AudioUtil {
	public static void playAudio(Path path, double volume) {
	    try {
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(path.toFile()));
	        clip.start();
	        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	        gainControl.setValue(20f * (float) Math.log10(volume));
	    } catch (Exception e) {
	        e.printStackTrace(System.out);
	    }
	}
}
