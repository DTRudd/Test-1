/**
 * 
 */
package test1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

/**
 * @author Sophie Rudd
 *
 */
public class App {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> lines = new ArrayList<String>();
		try (Scanner sc = new Scanner(new FileReader("stage_5_input.txt"))){
			while (sc.hasNextLine()){
				lines.add(sc.nextLine());
			}
		} catch( FileNotFoundException fnfe){
			System.out.println("File not found.  Please replace file.");
			System.exit(1);
		}
		parseMarinas(lines);
		parseBoats(lines);
		parsePeople(lines);
	}
	/**
	 * @param inp the tokens that will make up the marinas
	 */
	public static ArrayList<Marina> parseMarinas(ArrayList<String> inp){
		ArrayList<Marina> outp = new ArrayList<Marina>();
		String name = null;
		String address = null;
		int size = -1;
		boolean passedFirstEmptyLine = false;
		Pattern alphaNumeric = Pattern.compile("([0-9a-zA-Z -_,]+)");
		Pattern number = Pattern.compile("([0-9]+)");
		for(String s : inp){
			Matcher aNMatcher = alphaNumeric.matcher(s);
			Matcher numMatcher = number.matcher(s);
			if (s.equals("Marinas")){
				//do nothing
			} else if (numMatcher.matches()){
				size = Integer.parseInt(numMatcher.group(1));
			} else if (aNMatcher.matches()){
				if (name == null){
					name = aNMatcher.group(1);
				} else {
					address = aNMatcher.group(1);
				}
			} else if (s.equals("|")){
				outp.add(new Marina(name,address,size));
				name = null;
				address = null;
				size = -1;
			} else if (!passedFirstEmptyLine){
				passedFirstEmptyLine = true;
			} else {
				break;
			}
		}
		return outp;
	}
	/**
	 * 
	 * @param inp the tokens that will make up the boats 
	 */
	public static ArrayList<Boat> parseBoats(ArrayList<String> inp){
		ArrayList<Boat> outp = new ArrayList<Boat>();
		String name = null;
		String country = null;
		double size = -1.0;
		boolean passedFirstEmptyLine = false;
		Pattern alphaNumeric = Pattern.compile("([0-9a-zA-Z -]+)");
		Pattern number = Pattern.compile("([0-9.]+)");
		for(String s : inp){
			Matcher aNMatcher = alphaNumeric.matcher(s);
			Matcher numMatcher = number.matcher(s);
			if (s.equals("Boats")){
				//do nothing
			} else if (numMatcher.matches()){
				size = Double.parseDouble(numMatcher.group(1));
				System.out.println(size);
			} else if (aNMatcher.matches()){
				if (name == null){
					name = aNMatcher.group(1);
					System.out.println(name);
				} else {
					country = aNMatcher.group(1);
					System.out.println(country);
				}
			} else if (s.equals("|")){
				outp.add(new Boat(name,country,size));
				name = null;
				country = null;
				size = -1;
			} else if (!passedFirstEmptyLine){
				passedFirstEmptyLine = true;
			} else {
				break;
			}
		}
		return outp;
	}
	/**
	 * 
	 * @param inp the tokens that will make up the people
	 */
	public static ArrayList<Person> parsePeople(ArrayList<String> inp){
		ArrayList<Person> outp = new ArrayList<Person>();
		String name = null;
		String country = null;
		double size = -1.0;
		boolean passedFirstEmptyLine = false;
		Pattern alphaNumeric = Pattern.compile("([0-9a-zA-Z -]+)");
		Pattern number = Pattern.compile("([0-9.]+)");
		for(String s : inp){
			Matcher aNMatcher = alphaNumeric.matcher(s);
			Matcher numMatcher = number.matcher(s);
			if (s.equals("People")){
				//do nothing
			} else if (numMatcher.matches()){
				size = Double.parseDouble(numMatcher.group(1));
				System.out.println(size);
			} else if (aNMatcher.matches()){
				if (name == null){
					name = aNMatcher.group(1);
					System.out.println(name);
				} else {
					country = aNMatcher.group(1);
					System.out.println(country);
				}
			} else if (s.equals("|")){
				outp.add(new Boat(name,country,size));
				name = null;
				country = null;
				size = -1;
			} else if (!passedFirstEmptyLine){
				passedFirstEmptyLine = true;
			} else {
				break;
			}
		}
		return outp;
	}
}
