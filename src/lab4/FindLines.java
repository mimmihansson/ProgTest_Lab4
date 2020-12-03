package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindLines {
	
	public FindLines() {
		
	}
	
	public static void main(String[] args) throws IOException { //Finds the lines with the word <w> in file from filepath <f>, if the args = "search <w> <f>
		if(args.length != 3) {
			System.out.println("Wrong input data");
		}
		else if (args[0].compareTo("search") != 0){
			System.out.println("Wrong input data");
		}
		else {
			String word = args[1];
			Path path = Paths.get(args[2]);
			if (!Files.exists(path)) {
				System.out.println("Wrong filepath");
			} 
			else {
				findLines(word, path);
			}
		}
	}

	private static void findLines(String word, Path path) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(path);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.toLowerCase().contains(word)) {
				System.out.println(line);
			}
		}
		scan.close();
	}

}
