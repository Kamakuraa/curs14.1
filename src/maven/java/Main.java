import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Usual java");
        String helloMaven = FigletFont.convertOneLine("Hello Maven");
        System.out.println(helloMaven);
    }
}
