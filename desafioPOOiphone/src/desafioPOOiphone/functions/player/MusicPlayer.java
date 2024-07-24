package desafioPOOiphone.functions.player;

public class MusicPlayer implements PlayStopMusic {

	public void playStopMusic() {
		openPlayer();
		System.out.println("Playing music");
		System.out.println("Stopping music");
		closePlayer();
	}
	
	private void openPlayer() {
		System.out.println("\n" + "Opening player" + "\n");
	}
	
	private void closePlayer() {
		System.out.println("\n" + "Closing player");
		System.out.println("_____________________________");
	}

}