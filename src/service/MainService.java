package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList symbols = new MyLinkedList();
		try
		{
			symbols.add('B');
			symbols.add('A');
			symbols.add('C');
			symbols.add('G');
			symbols.print();//B A C G
			System.out.println("Pievienot elementu sākumā");
			symbols.add('Z',0);
			symbols.print();//Z B A C G
			System.out.println("Pieveinot elementu beigās");
			symbols.add('W',5);
			symbols.print();//Z B A C G W
			System.out.println("Pievienot elementu pa vidu - 2.pozīcijā");
			symbols.add('K', 2);
			symbols.print(); //Z B A K C G W
			
			System.out.println("Izdzēšam elementu no sākuma");
			symbols.remove(0);
			symbols.print();//B A K C G W
			
			System.out.println("Izdzēšam elementu no beigām");
			symbols.remove(5);
			symbols.print();//B A K C G
			
			System.out.println("Izdzēšam elementu no vidus - 3. pozīcijā");
			symbols.remove(3);
			symbols.print();//B A K G
			
			System.out.println("Izgūt elementu no 2 pozīcijas");
			System.out.println("2.pozīcijas element ir " + symbols.get(2));//A
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
