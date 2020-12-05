import java.util.*;
public class Search {
	public ArrayList<Article> search (String str, Article[] article) {
		String[] tempString = str.split(" ");
		ArrayList<Article> titleArray = new ArrayList<Article>();
		for (int i = 0; i < article.length; i++) {
			for (int j = 0; i < tempString.length; j++) {
				if (tempString[i].indexOf(article[i].getTitle()) || tempString[i].equalsIgnoreCase(article[i].getTopic())) {
					titleArray.add(article[i]);
					break;
				}
			}
		}
		return titleArray;
	}
}
