package networkreal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	
	static String str = "";
	static String str1;
	
	
	public static void main(String[] args) {

		Socket socket = null;
		
		try {
			System.out.println("접속요청");
			socket = new Socket("10.10.10.28", 7777);
			System.out.println("서버에 접속됨");

			InputStream in = socket.getInputStream(); // 수신 --> read();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			OutputStream out = socket.getOutputStream();// 송신 --> write();
			PrintWriter pw = new PrintWriter(out);

			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

			
			System.out.println("=================================");
			System.out.println("           가위바위보 게임");
			System.out.println("=================================");
			System.out.println("가위는 1, 바위는 2, 보는 3입니다.\n종료는 q");

			Game game = new Game();
			int cnt = 1;
			while (true) {
				
				str = stdin.readLine();
				cnt = game.getCount();
					//System.out.println("다시 입력하세요\n가위, 바위, 보 중에서 선택해주세요.");
					//str = stdin.readLine();
				
				// 키보드로부터 데이타 입력 받음
				if(cnt<9){System.out.println("=================================");
				System.out.println("숫자를 입력해주세요 : ");
				}
				else if(cnt == 10) {
					System.out.println("게임이 끝났습니다.");
					pw.println(str);
					break;
				}
				
				pw.println(str);
				pw.flush();

				
				str1 = br.readLine();

				answerPrint();
				
				
			}
			
			System.out.println("종료(클라이언트)");

			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				// 4. 소켓 닫기 --> 연결 끊기
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	static void answerPrint() {
		
		
			if (str.equals("1")) {
				if (str1.equals("1")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("서로 비겼습니다.");
				} else if (str1.equals("2")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 졌습니다.");
				} else {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 이겼습니다.");
				}
			} else if (str.equals("2")) {
				if (str1.equals("1")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 이겼습니다.");
				} else if (str1.equals("2")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("서로 비겼습니다.");
				} else {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 졌습니다.");
				}
			} else if (str.equals("3")) {
				if (str1.equals("1")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 졌습니다.");
				} else if (str1.equals("2")) {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("클라이언트가 이겼습니다.");
				} else {
					System.out.println(str1);
					System.out.println("클라이언트 : " + str);
					System.out.println("서로 비겼습니다.");

				}

			} else {
				System.out.println("가위바위보중에서 입력해주세요.");
			}
		
		
	}
}