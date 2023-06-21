package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)
/**
 * @author ygh
 * @since 2023.06.20
 * @version 1.0
 */
public class MusicMenu {
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n=============== Welcome 별밤 ===============");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertMusic();
				break;
			case 2 :
				selectMusic();
				break;
			case 3 :
				deleteMusic();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			default :
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
			}
			
		}
		
	}
	
	// alt + shift + j
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n========== 새로운 곡 추가 ==========");
		
		while(true) {
			System.out.print("제목 입력 : ");
			String title = sc.nextLine();
			
			System.out.print("가수 입력 : ");
			String artist = sc.nextLine();
			
			int result = mc.insertMusic(title, artist);
			
			if(result == 0) {
				System.out.println("성공적으로 곡을 추가했습니다.");
				break;
			}
			else {
				System.out.println("이미 있는 곡입니다. 다시 입력해 주세요.");
			}
		}
			
	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		
		System.out.println("\n========== 전체 곡 조회 ==========");
		
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("저장된 곡이 없습니다.");
		}
		else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
		
	}
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면
	 */
	public void deleteMusic() {
		
		System.out.println("\n========== 특정 곡 삭제 ==========");
		
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("해당 곡을 성공적으로 삭제했습니다.");
			selectMusic();
		}
		else {
			System.out.println("해당 곡을 찾을 수 없습니다.");
		}
		
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		
		System.out.println("\n========== 특정 곡 검색 ==========");
		
		while(true) {
			System.out.print("1) 제목 검색 / 2) 가수 검색 : ");
			int search = sc.nextInt();
			
			sc.nextLine();
			
			if(search == 1 || search == 2) {
				System.out.print("검색할 키워드 입력 : ");
				String keyword = sc.nextLine();
				
				System.out.println("\n========== 검색 결과 ==========");
				
				ArrayList<Music> searchList = mc.searchMusic(search, keyword);
				
				if(searchList.isEmpty()) {
					System.out.println("검색 결과가 없습니다.");
				}
				else {
					for(Music m: searchList) {
						System.out.println(m);
					}
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
	}
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		
		System.out.println("\n========== 특정 곡 수정 ==========");
		
		System.out.print("수정할 곡 제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("곡 제목 수정 : ");
		String upTitle = sc.nextLine();
		
		System.out.print("가수 수정 : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("해당 곡을 성공적으로 수정했습니다.");
			selectMusic();
		}
		else {
			System.out.println("해당 곡을 찾을 수 없습니다.");
		}
		
	}
	
}
