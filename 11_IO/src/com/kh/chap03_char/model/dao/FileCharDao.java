package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// dao (Data Access Object)
public class FileCharDao {
	
	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기
	 * 
	 * - 문자 스트림 : 데이터를 2바이트 단위로 전송하는 통로 (넓은 통로)
	 * - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로
	 * 
	 * - XXXReader : 입력용 스트림
	 * - XXXWriter : 출력용 스트림
	 */
	
	// 프로그램 -----> 파일 (출력)
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		
		FileWriter fw = null;
		
		try {
			// 1. FileWriter 객체 생성
			fw = new FileWriter("b_char.txt"/*, true*/); // 해당 파일이 없으면 새로 만들고 연결, 있으면 그냥 연결
			
			// 2. write 메소드를 이용해서 데이터 출력
			//		2byte 단위로 데이터 전송
			fw.write("와! IO 재밌당...ㅎㅎ");
			fw.write(" ");
			fw.write('A');
			fw.write('\n');
			fw.write('ㅋ');
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write('\n');
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 프로그램 <----- 파일 (입력)
	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림
		FileReader fr = null;
		
		try {
			// 1. FileReader 객체 생성
			fr = new FileReader("b_char.txt");
			
			// 2. read 메소드 이용해서 읽어들이자 (정수값)
			//		파일의 끝을 만나는 순간 -1 출력
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) { // 자식 => 위에 있어야 함. 없어도 됨
			e.printStackTrace();
		} catch (IOException e) { // 부모
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
