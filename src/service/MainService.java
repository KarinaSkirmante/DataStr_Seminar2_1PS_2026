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
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
