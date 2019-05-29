package movieGame;

import java.util.Timer;
import java.util.TimerTask;


public class Time extends Game {
	static int count;

	Timer time = new Timer();
	
	public void Timer() {

		count = 10;

		TimerTask T = new TimerTask() {

			@Override
			public void run() {
				
//				for(int i =60; i>0; i--) {
//			         System.out.println(count);
//			         
//			         //1초마다 한번씩 반복
//			         try {
//			            Thread.sleep(10000);
//			            if(LevelOne.) {
//			               //값이 들어오면 카운트다운종료
//			               System.out.println("카운트 다운을 중단합니다.");
//			               return;
//			            }
//			         } catch (InterruptedException e) {
//			            // TODO Auto-generated catch block
//			            e.printStackTrace();
//			         }
//			      }
//			      
//			      //10초가 지나면 종료
//			      System.out.println("입력시간을 초과해서 종료합니다.");
//			      System.exit(0);
			      
				
				
				if (count < 70)
					switch (count) {
					case 10:
						System.out.println("[50초]");
						break;
					case 20:
						System.out.println("[40초]");
						break;
					case 30:
						System.out.println("[30초]");
						break;
					case 40:
						System.out.println("[20초]");
						break;
					case 50:
						System.out.println("[10초]");
						break;
					case 60:
						
						System.out.println("시간이 다 됐습니다.");
						System.out.println("\"난 바보야\" 를 입력해주세요!");
						break;
					}

				count += 10;
				
	

			}
		};

		time.schedule(T, 10000, 10000);
		

	}
	
	public void cancel() {
		time.cancel();
	}
}