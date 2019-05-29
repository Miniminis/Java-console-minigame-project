package networkreal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer5 {
	
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket(7777);
			while (true) {
				// 2. 클라이언트의 접속요청을 대기한다.
				System.out.println("서버 접속 대기 중");
				socket = serverSocket.accept();
				System.out.println("클라이언트 접속함");

				// 별도 쓰레드 만들어 자료 송수신하게 한다. - 여러 접속자를 처리하기 위한 쓰레드
				EchoThread echoThread = new EchoThread(socket);
				echoThread.start();
			}

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

}

//쓰레드 클래스
class EchoThread extends Thread {

	Socket socket;

	InputStream in = null;
	BufferedReader br = null;
	OutputStream out = null;
	PrintWriter pw = null;

	EchoThread() {
	}

	EchoThread(Socket socket) {
		this.socket = socket;
		try {
			// 3. 소켓으로 부터 송수신을 위한 i/o stream 을 얻기
			in = socket.getInputStream(); // 수신 --> read();
			br = new BufferedReader(new InputStreamReader(in));
			out = socket.getOutputStream(); // 송신 --> write();
			pw = new PrintWriter(out);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void run() {

		Game game;

		try {
			String str = "";	
			int cnt = 1; //게임횟수

			game = new Game(); // 게임 클래스 객체 생성
			
			while (true) {

				str = br.readLine(); // 라인단위로 받아서 스트링에 저장

				game.rcpGame(str); //
				cnt = game.getCount(); // 카운트 처리
				
				
				
				if(cnt < 10) {
					System.out.println("[ " + cnt + "번째 게임] 유저 : " + str);
					pw.println("[ " + cnt + "번째 게임] 서버 : " + game.getNum()); // 출력
					pw.flush();
				}else if(cnt==10) {
					System.out.println("[ " + cnt + "번째 게임] 유저 : " + str);
					pw.println("[ " + cnt + "번째 게임] 서버 : " + game.getNum());
					System.out.println("게임이 끝났습니다.");
					pw.println("게임이 끝났습니다.");
					System.out.println("점수 : "+ game.getScore());
					pw.println("점수 : "+ game.getScore());// 출력
					pw.flush();
					
				}
				
				
			}
				

			

		} catch (IOException e) {
			System.out.println("데이터 송수신에러");
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void close() {
		try {
			// 4. 소켓 닫기 --> 연결 끊기
			in.close();
			br.close();
			out.close();
			pw.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("close 에러");
			e.printStackTrace();
		}
	}
}
