package CommitCounter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class App 
{
    public static void main( String[] args )throws IOException
    {

		final Document print = Jsoup.connect("https://github.com/Prateek0001/Calculator-App").get();
		
	   for( Element li:print.select("li.commits") ) {
		   
		        	String commit= li.select(",commits").text();
		        	System.out.println(commit);
		        	
		        	
		        	
		        }
    }
}
