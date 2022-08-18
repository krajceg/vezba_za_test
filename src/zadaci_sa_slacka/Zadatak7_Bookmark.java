package zadaci_sa_slacka;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7_Bookmark {

	public static void main(String[] args) {

		ArrayList<String> bookmarks = new ArrayList<String>();

		bookmarks.add("Apps");
		bookmarks.add("YouTube");
		bookmarks.add("Google");
		bookmarks.add("Gmail");
		bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
		bookmarks.add("Confluence");
		bookmarks.add("JIRA");
		bookmarks.add("Bitbucket");
		bookmarks.add("Google Calendar");
		bookmarks.add("Timesheet");
		bookmarks.add("Google Drive");
		bookmarks.add("IX CIKLUS");

		int max = 100;
		int pokazano = bookmarks.get(0).length();
		int pokazanoB = 0;

		for (int i = 1; i < bookmarks.size(); i++) {
			if (pokazano + 5 + bookmarks.get(i).length() <= max) {
				pokazano = pokazano + 5 + bookmarks.get(i).length();
				pokazanoB++;
			}
			else {
				break;
			}
		}
		if (max >= pokazano) {
			for (int i = 0; i <= pokazanoB; i++) {
				System.out.print(bookmarks.get(i) + "     ");
			}
		}

	}

}
