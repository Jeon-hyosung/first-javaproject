package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriteStr {

	public static void main(String [] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "오라클이 제일 쉬웠어요";
			writer.write(data);
			writer.flush();
			System.out.println("쓰기완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
