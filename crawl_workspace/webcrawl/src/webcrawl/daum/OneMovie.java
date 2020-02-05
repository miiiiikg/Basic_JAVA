package webcrawl.daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OneMovie {
	public static void main(String[] args) throws IOException {
		String url = "https://movie.daum.net/moviedb/grade?movieId=134091&type=netizen";
		Document doc = Jsoup.connect(url).get();
		Elements headLine = doc.select("ul.list_netizen a.link_proflie > em.emph_grade");
		
		int count = 0;
		for(Element element : headLine) { 
			count++;
			
			String href = element.attr("href");
			
			Document name = Jsoup.connect(href).get();	
			Elements grade = name.select("em.emph_grade");
			Elements review = name.select("p.desc_review");
			Elements day = name.select("span#info_append");
			
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"+count+"건 ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("이름:" + name.text()); 
			System.out.println("점수:" + grade.text());
			System.out.println("내용:" + review.text());
				
			}
		
		
	}

}
