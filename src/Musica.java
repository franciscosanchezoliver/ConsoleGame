
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musica {

	public static void sonar() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("C:\\Users\\T15994\\eclipse-workspace\\BarraProgreso\\src\\Streets_of_Rage_2_-_Intro_HDwav.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();

	}

}
