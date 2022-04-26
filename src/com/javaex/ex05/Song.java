package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
	public Song() {
		//메모리에 올리는일
		System.out.println("Song()");
	}

	public Song(String title, String artist, String album, String composer, int year) {
		//메모리에 올리는일
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		
		if(year<0) {
			this.year = 2022; 
		}else {
			this.year = year;
		}
		
		System.out.println("Song(5)");
	}


	public Song(String title, String artist, String album, String composer, int year, int track) {
		//파라미터 5개짜리 생성자를 실행
		//메모리에 올리는일
		this(title, artist, album, composer, year); 
		
		this.track = track;
		System.out.println("Song(6)");
	}

	// 메소드 gs
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + " (" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}

}