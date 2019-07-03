package main.java.battleship.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import main.java.battleship.pojo.BattleArea;
import main.java.battleship.pojo.Player;

public class FileUtil {

	public static void readFile(String inputFilePath){
	
		File file= new  File(inputFilePath);
		try {
			
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String data="";
			int count=0;
			while((data=reader.readLine())!=null){
			String[] s=	data.split(" ");
			count++;
			switch (count) {
			case 1:
				int width=Integer.parseInt(s[0]);
				int height=getBattleAreHeight(s[1]);
				BattleArea battleArea= new BattleArea(width, height);
				battleArea.setWidth(width);
				battleArea.setHeight(height);
				int [] [] battleAreaArr= new int[height][width];
				battleArea.setBattleAreaArr(battleAreaArr);
				for (int i = 0; i < battleAreaArr.length; i++) {
					
					for (int j = 0; j < battleAreaArr[i].length; j++) {
						if(j==0){
						continue;
						}
						System.out.print(battleAreaArr[i][j]);
					}
				}
				break;
			case 2:
				 Player player= new Player();
				 player.setNumberOfShips(Integer.parseInt(s[0]));
				 System.out.println("Number of ships : "+player.getNumberOfShips());
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				break;
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
private static int getBattleAreHeight(String s)
{	int height=-1;
	final char [] heightArr=new char[]{'A','B','C','D','E','F','G','H','I',
			'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	for (int i = 0; i < heightArr.length; i++) {
		if(s.equals(String.valueOf(heightArr[i]))){
			height=i+1;
		}
	}
	return height;

}
private void validateInputData(File file) throws Exception{
	boolean[] isValidData=new boolean[8];
	BufferedReader reader= new BufferedReader(new FileReader(file));
	String data="";
	int count=0;
	while((data=reader.readLine())!=null){
		count++;
	String[] s=	data.split(" ");
	for (int i = 0; i < s.length; i++) {
		if(count==1){
			if(((Integer.parseInt(s[0])<1) &&(Integer.parseInt(s[0])>9))
					||(s[1].matches("[A-Z]")));
			{
				System.out.println("Invalid input");
				isValidData[0]=false;
			}
		}
		if(count==2){
			if(((Integer.parseInt(s[0])<1) &&(Integer.parseInt(s[0])>9*26)));
			{
				System.out.println("Invalid input");
				isValidData[0]=false;
			}
		}
	}
	for (int i = 0; i < isValidData.length; i++) 
	{  if(String.valueOf(isValidData[i]).equals("false"))
		throw new Exception("Invalid input");
	}
	}
}
}
