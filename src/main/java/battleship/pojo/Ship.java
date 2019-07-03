package main.java.battleship.pojo;


public class Ship {

private int width;
private char height;
private int xCoordinate;
private char yCoordinate;
public enum SHIPTYPE 
{
P,Q	
}
public Ship(int width, char height, int xCoordinate, char yCoordinate) {
	super();
	this.width = width;
	this.height = height;
	this.xCoordinate = xCoordinate;
	this.yCoordinate = yCoordinate;
}

public Ship() {
	super();
	// TODO Auto-generated constructor stub
}

public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public char getHeight() {
	return height;
}
public void setHeight(char height) {
	this.height = height;
}
public int getxCoordinate() {
	return xCoordinate;
}
public void setxCoordinate(int xCoordinate) {
	this.xCoordinate = xCoordinate;
}
public char getyCoordinate() {
	return yCoordinate;
}
public void setyCoordinate(char yCoordinate) {
	this.yCoordinate = yCoordinate;
}


}
