/*
 * �ۼ���: ������
 * �ۼ���: 2018.06.16.
 * ����: Arraylist, Collection
 */

package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

	public static void main(String[] args) {
		System.out.println("hw15_1: ������\n");

		Deck d = new Deck();  //�� ��ü�� �ϳ� ����
		d.shuffle();  //���� ī�带 ����

		Player p1 = new Player();  //�÷��̾�1, �÷��̾�2�� ����(p1, p2�̶�� �θ���)
		Player p2 = new Player();

		for(int i=0;i<5; i++) {  //p1�� p2���� �����ư��� 5�徿 ī�带 ��������
			p1.getCard(d.deal());
			p2.getCard(d.deal());
		}

		System.out.println("p1�� p2�� ī�� ���");
		p1.showCards();  //p1, p2�� ī�� ����� ���
		p2.showCards();

		System.out.println("\np1�� p2�� �ִ� ī��");
		int a = (p1.maxCard()).getNumber();  //p1, p2�� �ִ� ī�带 �˾Ƴ��� �ִ� ī�带 ����
		int b = (p2.maxCard()).getNumber();

		System.out.println(a);
		System.out.println(b);
		System.out.println((a > b ? "p1" : "p2")+" �¸�!");//���� �꿡 ���� ���ڰ� �������� ���

		System.out.println("\np1�� p2�� ī�� ���");
		p1.showCards();  //p1, p2�� ī�� ����� ���
		p2.showCards();	
	}
}

class Card {  //ī�� �� ���� ǥ���ϴ� Ŭ���� Card
	private int number; // ī�� ��ȣ

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}

class Deck {  //ī�� 50���� �ٷ�� ���� ǥ���ϴ� Ŭ���� Deck
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// ī�带 �����Ͽ� ���� ����
	public Deck() {
		for (int i = 1; i < MAX_NUMBER+1; i++)
			deck.add(new Card(i));
	}

	// ī�带 ����
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� �� �� ī�带 �����Ͽ� ����
	public Card deal() {	
		return deck.remove(0);
	}
}


class Player {  //�ڽ��� ī�� ����Ʈ�� ���� �÷��̾� Ŭ���� Player
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	// �ڽ��� ���� ī�� �� �ִ� ī�带 ����Ʈ���� �����ϰ� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
	public Card maxCard() {
		int max = (list.get(0)).getNumber();
		int j=0;

		for(int i=1;i<5;i++) {
			if(max < (list.get(i).getNumber())) {
				max = list.get(i).getNumber();
				j=i;
			}
		}

		return list.remove(j);
	}
}
