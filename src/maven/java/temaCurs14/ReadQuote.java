package temaCurs14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadQuote {
    public static void main(String[] args) throws Exception {
        var quotes = readFromFile();
        quotes.forEach(name -> {
            System.out.println(name);
        });

    }

    public static List<Quote> readFromFile() throws Exception {
        List<Quote> quotes = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/quotes.txt"));
        String line;
        int id = 1;
        while ((line = bufferedReader.readLine()) != null) {
            quotes.add(readQutes(id++, line));
        }
        return quotes;
    }


    private static Quote readQutes(int id, String quoteAlert) {
        String[] quoteData = quoteAlert.split("~");
        String author = quoteData[0];
        String quote = quoteData[1];

        return new Quote(id, author, quote);
    }
}
