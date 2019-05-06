package dynamic_beat_13;

public class Main {
	public static final int	SCREEN_WIDTH = 1280;
	public static final int	SCREEN_HEIGHT = 720;
	
	/*
	 * 1초에 700(7 * 1000(ms) / 10)만큼 노트가 이동한다. 
	 */
	public static final int	NOTE_SPEED = 7;		// 한번에 노트가 7픽셀씩 이동 
	public static final int	SLEEP_TIME = 10;	// 10ms 에 한번씩 쉰다(1초에 100번 동작 - 1000/10)
	
	public static void main(String[] args) {
		new DynamicBeat();
	}

}
