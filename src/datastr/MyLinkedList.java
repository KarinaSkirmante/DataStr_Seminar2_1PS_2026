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
	
	public void add(char element) throws Exception{
		if(isFull()) {
			throw new Exception("Saraksts ir pilns un nevar pievienot elementu");
		}
		
		//tiks pievienots pirmais elements un tam izveidots piramis bloks
		if(howManyElements == 0) {
			MyNode newNode = new MyNode(element);
			firstNode = newNode;
			lastNode = newNode;
			howManyElements++;
		}
		//ja tiek pievienots otrais, tresais... elements
		//TODO ja vēlas, tad var aoptimizet kodu, jo ir rindas, kuras sakrīt abos gadījumos
		else
		{
			MyNode newNode = new MyNode(element);
			newNode.setPreviousNode(lastNode);
			lastNode.setNextNode(newNode);
			lastNode = newNode;
			howManyElements++;
			
			
		}
		
		
	}
	
	
}
