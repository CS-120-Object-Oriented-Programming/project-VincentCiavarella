/**
 * 
 */
package edu.kings;

/**
 * 
 */
public class Player 
{
	private Room room;
	
	//constructor and takes what room
	public Player(Room newRoom)
	{
		room = newRoom;
	}
	
	public Room getRoom()
	{
		return room;
	}
	
	public void setRoom(Room newRoom)
	{
		room = newRoom;
	}

}
