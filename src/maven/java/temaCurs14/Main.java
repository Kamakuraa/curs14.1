package temaCurs14;

import static temaCurs14.ReadQuote.readFromFile;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteService quoteService = new QuoteService(readFromFile());
//        System.out.println(quoteService.getAllQuotes());
//        System.out.println(quoteService.getAuthor());
        System.out.println("==================");
        System.out.println(quoteService.getQuotesForAuthor("Lao Tzu"));

    }
}
