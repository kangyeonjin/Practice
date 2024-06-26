package WebCrawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewsService {

    private static String News_URL = "https://news.naver.com/section/101";

    public List<News> getNewsDatas() throws IOException{

        List<News> newsList = new ArrayList<>();
        Document document = Jsoup.connect(News_URL).get();

        Elements contents = document.select("section ul.type2 li");

        for(Element content : contents){
//            News news = News.builder()
//                    .image(content.select("a img").attr("abs:src"))//abs:src속성가져와 url설정함
//                    .subject(content.select("h4 a").text())  //h4 a요소텍스트가져옴 제목
//                    .url(content.select("a").attr("abs:href")) //abs:href속성가져와서 url설정함
//                    .build();
//            newsList.add(news);
        }
        return newsList;
    }

}
