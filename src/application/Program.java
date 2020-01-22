package application;

import java.io.IOException;

import folders.Folders;

public class Program {

	public static void main(String[] args) throws IOException {

		Folders temp  = new Folders();
		Folders tempII = new Folders();
		
		temp.deleteFiles("C:\\Windows\\Temp");
		tempII.deleteFiles("C:\\Users\\USURIO~1\\AppData\\Local\\Temp");
	}

}
