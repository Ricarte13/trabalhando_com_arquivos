package application;

import java.io.File;
import java.util.Scanner;

public class FilePath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scanner.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath " + path.getPath());
		System.out.println("getParent " + path.getParent());
		System.out.println("getName " + path.getName());
		
		
		
		scanner.close();

	}

}
