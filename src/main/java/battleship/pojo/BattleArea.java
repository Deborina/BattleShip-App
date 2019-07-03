package main.java.battleship.pojo;


public class BattleArea  {
	
	private  int [][] battleAreaArr=null;
private int width;
 private int height;
 
public BattleArea() {
	super();
	// TODO Auto-generated constructor stub
}

public BattleArea(int width, int height) {
	super();
	this.battleAreaArr = new int [height][width];
	this.width = width;
	this.height = height;
}
public int[][] getBattleAreaArr() {
	return battleAreaArr;
}
public void setBattleAreaArr(int[][] battleAreaArr) {
	this.battleAreaArr = battleAreaArr;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
 
 
}
