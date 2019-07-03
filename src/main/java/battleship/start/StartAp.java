package main.java.battleship.start;

import java.util.Scanner;

import main.java.battleship.util.FileUtil;

public class StartAp {

	static String inputfilePath="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the file path");
		 inputfilePath=scanner.next();
		System.out.println(inputfilePath);
		FileUtil.readFile(inputfilePath);
	}

}
