import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
	
public final class NumberWordsApplication {
	static NumberWords numberwords;
	private static BufferedReader reader;

	public static void main(final String[] args) {
		reader = new BufferedReader(new InputStreamReader(System.in));
		int n;
		numberwords = new NumberWords();
		String value = null;
		while(true) {
		System.out.println("Enter a number to convert into word format");
		try {			
			value = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 n = Integer.parseInt(value);
		 if(n == 0) {
				System.out.println("You opted to exit. Bye !!");
				break;
		 }
		 System.out.println(NumberFormat.getInstance().format(n) + "='" + numberwords.convert(n) + "'");
		}
}
	}

