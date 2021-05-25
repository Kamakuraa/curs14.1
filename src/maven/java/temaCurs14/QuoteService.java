package temaCurs14;

import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    public List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = new ArrayList<>();
        this.quotes.addAll(quotes);
    }

    public List<String> getAllQuotes(){
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes){
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<String> getAuthor(){
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes){
            result.add(quote.getAuthor());
        }
        return result;
    }
}
