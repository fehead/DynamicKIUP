package dynamic_beat_15;

public class Main {
	public static final int	SCREEN_WIDTH = 1280;
	public static final int	SCREEN_HEIGHT = 720;
	
	/* NOTE_SPEED = 7
	 * SLEEP_TIME = 10 인경우.
	 * 1초에 700(7 * 1000(ms) / 10)만큼 노트가 이동한다. 
	 */
	public static final int	NOTE_SPEED = 3; // 한번에 노트가 7픽셀씩 이동 
	public static final int	SLEEP_TIME = 10; // SLEEP_TIME ms 에 한번씩 쉰다(1초에 1000/SLEEP_TIME)
	public static final int REACH_TIME = 2;
	
	public static void main(String[] args) {
		new DynamicBeat();
	}

}
