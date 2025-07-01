package model;

//import java.util.HashMap;
//import java.util.Scanner;

	
import java.util.HashMap;

public class TraduttoreMorseSemaforico {
	  private static final HashMap<String, String> morse = new HashMap<>();
	    private static final HashMap<String, String> semaforico = new HashMap<>();

	    static {
	    	morse.put("0", "-----");
			morse.put("1", ".----");
			morse.put("2", "..---");
			morse.put("3", "...--");
			morse.put("4", "....-");
			morse.put("5", ".....");
			morse.put("6", "-....");
			morse.put("7", "--...");
			morse.put("8", "---..");
			morse.put("9", "----.");
			morse.put("a", ".-");
			morse.put("b", "-...");
			morse.put("c", "-.-.");
			morse.put("d", "-..");
			morse.put("e", ".");
			morse.put("f", "..-.");
			morse.put("g", "--.");
			morse.put("h", "....");
			morse.put("i", "..");
			morse.put("j", ".---");
			morse.put("k", "-.-");
			morse.put("l", ".-..");
			morse.put("m", "--");
			morse.put("n", "-.");
			morse.put("o", "---");
			morse.put("p", ".--.");
			morse.put("q", "--.-");
			morse.put("r", ".-.");
			morse.put("s", "...");
			morse.put("t", "-");
			morse.put("u", "..-");
			morse.put("v", "...-");
			morse.put("w", ".--");
			morse.put("x", "-..-");
			morse.put("y", "-.--");
			morse.put("z", "--..");
			morse.put(" ", "");
			
			String numeri = "\u2196\u2198/";
	        semaforico.put("a", "\u2199");
	        semaforico.put("b", "\u2190");
	        semaforico.put("c", "\u2196");
	        semaforico.put("d", "\u2191");
	        semaforico.put("e", "\u2197");
	        semaforico.put("f", "\u2192");
	        semaforico.put("g", "\u2198");
	        semaforico.put("h", "\u2199\u2190");
	        semaforico.put("i", "\u2199\u2196");
	        semaforico.put("j", "\u2191\u2192");
	        semaforico.put("k", "\u2199\u2191");
	        semaforico.put("l", "\u2199\u2197");
	        semaforico.put("m", "\u2199\u2192");
	        semaforico.put("n", "\u2199\u2198");
	        semaforico.put("o", "\u2190\u2196");
	        semaforico.put("p", "\u2190\u2191");
	        semaforico.put("q", "\u2190\u2197");
	        semaforico.put("r", "\u2190\u2192");
	        semaforico.put("s", "\u2190\u2198");
	        semaforico.put("t", "\u2196\u2191");
	        semaforico.put("u", "\u2196\u2197");
	        semaforico.put("v", "\u2191\u2198");
	        semaforico.put("w", "\u2197\u2192");
	        semaforico.put("x", "\u2197\u2198");
	        semaforico.put("y", "\u2196\u2192");
	        semaforico.put("z", "\u2192\u2198");
	        semaforico.put("0", numeri+semaforico.get("j"));
	        semaforico.put("1", numeri+semaforico.get("a"));
	        semaforico.put("2", numeri+semaforico.get("b"));
	        semaforico.put("3", numeri+semaforico.get("c"));
			semaforico.put("4", numeri+semaforico.get("d"));
			semaforico.put("5", numeri+semaforico.get("e"));
			semaforico.put("6", numeri+semaforico.get("f"));
			semaforico.put("7", numeri+semaforico.get("g"));
			semaforico.put("8", numeri+semaforico.get("h"));
			semaforico.put("9", numeri+semaforico.get("i"));
	        semaforico.put(" ", "");  
	    }

	    public static String traduciMorse(String messaggio) {
	    	String[] caratteri = messaggio.toLowerCase().split("");
			String resultMorse = "";
			for(int i = 0; i < caratteri.length; ++i) {
				resultMorse = resultMorse + morse.get(caratteri[i]) +"/";
				if(i == caratteri.length-1) {
					resultMorse = resultMorse + "/";
				}
			}
			return resultMorse;
	    }

	    public static String traduciSemaforico(String messaggio) {
	    	String[] caratteri = messaggio.toLowerCase().split("");
			String resultSemaforico = "";
			for(int i = 0; i < caratteri.length; ++i) {
				resultSemaforico = resultSemaforico + semaforico.get(caratteri[i]) +"/";
				if(i == caratteri.length-1) {
					resultSemaforico = resultSemaforico + "/";
				}
			}
			return resultSemaforico;
	    }
}


//	public static void main(String[] args) {
//		HashMap<String, String> morse = new HashMap<>();
//		morse.put("0", "-----");
//		morse.put("1", ".----");
//		morse.put("2", "..---");
//		morse.put("3", "...--");
//		morse.put("4", "....-");
//		morse.put("5", ".....");
//		morse.put("6", "-....");
//		morse.put("7", "--...");
//		morse.put("8", "---..");
//		morse.put("9", "----.");
//		morse.put("a", ".-");
//		morse.put("b", "-...");
//		morse.put("c", "-.-.");
//		morse.put("d", "-..");
//		morse.put("e", ".");
//		morse.put("f", "..-.");
//		morse.put("g", "--.");
//		morse.put("h", "....");
//		morse.put("i", "..");
//		morse.put("j", ".---");
//		morse.put("k", "-.-");
//		morse.put("l", ".-..");
//		morse.put("m", "--");
//		morse.put("n", "-.");
//		morse.put("o", "---");
//		morse.put("p", ".--.");
//		morse.put("q", "--.-");
//		morse.put("r", ".-.");
//		morse.put("s", "...");
//		morse.put("t", "-");
//		morse.put("u", "..-");
//		morse.put("v", "...-");
//		morse.put("w", ".--");
//		morse.put("x", "-..-");
//		morse.put("y", "-.--");
//		morse.put("z", "--..");
//		morse.put(" ", "");
//		
//		HashMap<String, String> semaforico = new HashMap<>();
//        String numeri = "\u2196\u2198/";
//        semaforico.put("a", "\u2199");
//        semaforico.put("b", "\u2190");
//        semaforico.put("c", "\u2196");
//        semaforico.put("d", "\u2191");
//        semaforico.put("e", "\u2197");
//        semaforico.put("f", "\u2192");
//        semaforico.put("g", "\u2198");
//        semaforico.put("h", "\u2199\u2190");
//        semaforico.put("i", "\u2199\u2196");
//        semaforico.put("j", "\u2191\u2192");
//        semaforico.put("k", "\u2199\u2191");
//        semaforico.put("l", "\u2199\u2197");
//        semaforico.put("m", "\u2199\u2192");
//        semaforico.put("n", "\u2199\u2198");
//        semaforico.put("o", "\u2190\u2196");
//        semaforico.put("p", "\u2190\u2191");
//        semaforico.put("q", "\u2190\u2197");
//        semaforico.put("r", "\u2190\u2192");
//        semaforico.put("s", "\u2190\u2198");
//        semaforico.put("t", "\u2196\u2191");
//        semaforico.put("u", "\u2196\u2197");
//        semaforico.put("v", "\u2191\u2198");
//        semaforico.put("w", "\u2197\u2192");
//        semaforico.put("x", "\u2197\u2198");
//        semaforico.put("y", "\u2196\u2192");
//        semaforico.put("z", "\u2192\u2198");
//        semaforico.put("0", numeri+semaforico.get("j"));
//        semaforico.put("1", numeri+semaforico.get("a"));
//        semaforico.put("2", numeri+semaforico.get("b"));
//        semaforico.put("3", numeri+semaforico.get("c"));
//		semaforico.put("4", numeri+semaforico.get("d"));
//		semaforico.put("5", numeri+semaforico.get("e"));
//		semaforico.put("6", numeri+semaforico.get("f"));
//		semaforico.put("7", numeri+semaforico.get("g"));
//		semaforico.put("8", numeri+semaforico.get("h"));
//		semaforico.put("9", numeri+semaforico.get("i"));
//        semaforico.put(" ", "");  
//		
//		Scanner s = new Scanner(System.in);
//        System.out.println("Inserire il messaggio da tradurre:");
//		String messaggio = s.nextLine();
//		String[] caratteri = messaggio.toLowerCase().split("");
//		String resultMorse = "";
//		String resultSemaforico = "";
//		for(int i = 0; i < caratteri.length; ++i) {
//			resultMorse = resultMorse + morse.get(caratteri[i]) +"/";
//			resultSemaforico = resultSemaforico + semaforico.get(caratteri[i]) +"/";
//			if(i == caratteri.length-1) {
//				resultMorse = resultMorse + "/";
//				resultSemaforico = resultSemaforico + "/";
//			}
//		}
//		System.out.println("Messaggio tradotto in morse:");
//		System.out.println(resultMorse);
//		System.out.println("Messaggio tradotto in semaforico:");
//		System.out.println(resultSemaforico);
//		s.close();
//	}


