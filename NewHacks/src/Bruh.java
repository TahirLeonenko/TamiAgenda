import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Bruh {

	void playMusic(String musicLocation)
	{
		try
		{
			File musicPath = new File(musicLocation);
			
			if(musicPath.exists())
			{
				AudioInputStream audioInput =AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				
				JOptionPane.showMessageDialog(null, "Press Ok to dismiss alarm.");
			}
			else
			{
				System.out.println("Can't find file");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
