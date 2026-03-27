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
		if(isEmpty()) {
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
	
	
	public void add(char element, int position) throws Exception{
		if(position < 0) {
			throw new Exception("Pozicīja nevar būt mazakā par 0");
		}
		
		if(position > howManyElements) {
			throw new Exception("Pozīcija ir lielāka kā atļautā");
		}
		
		
		//1. ievietot sakumā kā nulto elementu
		if(position == 0) {
			MyNode newNode = new MyNode(element);
			firstNode.setPreviousNode(newNode);
			newNode.setNextNode(firstNode);
			firstNode = newNode;
			howManyElements++;
		}
		
		//2. piekabināt beigās kā pēdejo elementu
		else if(position == howManyElements)
		{
			add(element);
			
		}
		//3. iespraucināt elementu pa vidu
		else
		{
			MyNode currentNode = firstNode;//TODO noskaidrot, kurā pozicjā - tuvaak sākumam vai beigām ir jaievieto bloks
			for(int i = 1; i < position; i++) {
				currentNode = currentNode.getNextNode();
			}
			
			MyNode previousNode = currentNode;
			MyNode nextNode = currentNode.getNextNode();
			
			MyNode newNode = new MyNode(element);
			
			newNode.setPreviousNode(previousNode);
			previousNode.setNextNode(newNode);
			
			newNode.setNextNode(nextNode);
			nextNode.setPreviousNode(newNode);
			
			howManyElements++;
			
			
		}
		
	}
	
	
	public void print() throws Exception{
		if(isEmpty()) {
			throw (new Exception("Saraksts ir tukšs un to nevar izprintēt"));
		}
		
		MyNode currentNode = firstNode;
		while(currentNode!=null) {
			System.out.print(currentNode.getElement() + " ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
		
	} 
	
	
	
}
