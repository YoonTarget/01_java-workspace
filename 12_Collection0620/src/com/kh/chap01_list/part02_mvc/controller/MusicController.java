package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("Hypeboy", "New jeans"));
		list.add(new Music("Artist", "Zico"));
		list.add(new Music("Shawty", "Camo"));
		list.add(new Music("Notepad", "Coogie"));
		list.add(new Music("Jasmine", "DPR Live"));
	}
	
	public int insertMusic(String title, String artist) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = 1;
				break;
			}
			title = title.substring(0, 1).toUpperCase() + title.substring(1);
			artist = artist.substring(0, 1).toUpperCase() + artist.substring(1);
			
			list.add(new Music(title, artist));
		}
		return result;
		
	}
	
	public ArrayList<Music> selectMusic() {
		
		ArrayList<Music> selectList = list;
		
		return selectList;
	}

	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
			}
		}
		return result;
		
	}
	
	public ArrayList<Music> searchMusic(int search, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(search == 1) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} 
		else {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result++;
			}
		}
		return result;
	}
	
}
