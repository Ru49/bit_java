package com.javaex.network.echosever.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

	public static void main(String[] args) {
		// 1. 서버 소캣 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			// 2. bind (주소, 포트 연결)
			InetSocketAddress local = new InetSocketAddress("121.138.83.117", 10000); // localhost, Port
			serverSocket.bind(local); // bind
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			// 3. 접속 대기 : 여러 클라이언트 접속을 허용
			while(true) {
			Socket socket = serverSocket.accept();
			// 새 서버 쓰레드를 만들어서 로직을 수행
			Thread thread = new ServerThread(socket);
			thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 서버 소켓 닫기
			try {
			serverSocket.close();
		
			}catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
	}

}
