package main.java.battleship.pojo;

import java.io.Serializable;
import java.util.Set;

public class Player implements Runnable{
private int playerId;
private Set<Ship> ships;
private BattleArea battleArea;
private int numberOfShips;


public Player() {
	super();
	// TODO Auto-generated constructor stub
}
public Player(int playerId, Set<Ship> ships, BattleArea battleArea) {
	super();
	this.playerId = playerId;
	this.ships = ships;
	this.battleArea = battleArea;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public int getNumberOfShips() {
	return numberOfShips;
}
public void setNumberOfShips(int numberOfShips) {
	this.numberOfShips = numberOfShips;
}
public Set<Ship> getShips() {
	return ships;
}
public void setShips(Set<Ship> ships) {
	this.ships = ships;
}
public BattleArea getBattleArea() {
	return battleArea;
}
public void setBattleArea(BattleArea battleArea) {
	this.battleArea = battleArea;
}
public void run() {
	// TODO Auto-generated method stub
	
}


}
