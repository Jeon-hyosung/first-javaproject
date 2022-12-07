package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String [] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt"); // 업캐스팅 
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
			while((readByteNo = is.read(readBytes)) != -1) {
				// readByteNo = is.read(readBytes); //readByteNo = 읽은개수를 알려줌
				// if(readByteNo ==  -1) break; // 없을때까지 읽어
				data += new String(readBytes, 0, readByteNo); // 읽은것 누적
			}
			System.out.print(data); // 출력해서 끝
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
