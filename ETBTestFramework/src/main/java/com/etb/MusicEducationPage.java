package com.etb;

public class MusicEducationPage {
	static String url = "https://www.donegaletb.ie/schools-youth-services/seirbhis-ceoil-music-education/";
	static String title = "Music Education – Donegal ETB";

	public void goTo() {
		Browser.goTo(url);
		
	}
	
	public static void print(String message) {
		System.out.println(message);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
