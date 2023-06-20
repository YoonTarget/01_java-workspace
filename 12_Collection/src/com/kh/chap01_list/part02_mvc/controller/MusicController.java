package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>(); // []
	
	{
		// 초기화 블럭
		list.add(new Music("Attention", "뉴진스")); // [Music[Attention, 뉴진스]]
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "김시연"));
	}
							// 매개변수 => 자료형 변수명
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		// 돌려준다 => return
		return list;
		
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break; // 반복문 빠져나오기
			}
		}
		
		return result;
		
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		// searchList => 텅비어있을 수도 있음 | 검색된 Music 객체들이 담겨있을 수도 있음
		
		return searchList;
		
	}
	
	// 2. 심화버전
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) { // 곡명으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { // 가수명으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
		
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			/*
			if(list.get(i).getTitle().equals(title)) {
				list.set(i, new Music(upTitle, upArtist));
				result = 1;
				break;
			}
			*/
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
				break;
			}
		}
		
		return result;
		
	}

}
