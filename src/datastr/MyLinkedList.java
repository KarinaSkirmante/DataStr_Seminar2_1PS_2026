package datastr;

public class MyLinkedList {

	private MyNode firstNode = null;//get un set netaisam, jo lieottajam nedodam iespēju tikt pie pašiem blokiem
	private MyNode lastNode = null;//get un set netaisam, jo lieottajam nedodam iespēju tikt pie pašiem blokiem
	private int howManyElements = 0;//set funkciju netaisam, jo neļaujam lietotjam pašam mainīt, cik daudz ir elementu
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	//nedefinēšu bezargumenta konstruktoru, oj izmantošanu Object mantoto
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		try
		{
			new MyNode('a');
			return false;
		}
		catch(OutOfMemoryError error) {
			return true;
		}
		
	}
	
}
