/*
 * 작성자: 정은애
 * 작성일: 2018.06.16.
 * 내용: Arraylist, Collection
 */

package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

	public static void main(String[] args) {
		System.out.println("hw15_1: 정은애\n");

		Deck d = new Deck();  //덱 객체를 하나 만듬
		d.shuffle();  //덱의 카드를 섞음

		Player p1 = new Player();  //플레이어1, 플레이어2를 생성(p1, p2이라고 부르자)
		Player p2 = new Player();

		for(int i=0;i<5; i++) {  //p1과 p2에게 번갈아가며 5장씩 카드를 나누어줌
			p1.getCard(d.deal());
			p2.getCard(d.deal());
		}

		System.out.println("p1과 p2의 카드 목록");
		p1.showCards();  //p1, p2의 카드 목록을 출력
		p2.showCards();

		System.out.println("\np1과 p2의 최대 카드");
		int a = (p1.maxCard()).getNumber();  //p1, p2의 최대 카드를 알아내되 최대 카드를 버림
		int b = (p2.maxCard()).getNumber();

		System.out.println(a);
		System.out.println(b);
		System.out.println((a > b ? "p1" : "p2")+" 승리!");//게임 룰에 따라 승자가 누구인지 출력

		System.out.println("\np1과 p2의 카드 목록");
		p1.showCards();  //p1, p2의 카드 목록을 출력
		p2.showCards();	
	}
}

class Card {  //카드 한 장을 표현하는 클래스 Card
	private int number; // 카드 번호

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

class Deck {  //카드 50장을 다루는 덱을 표현하는 클래스 Deck
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		for (int i = 1; i < MAX_NUMBER+1; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
	public Card deal() {	
		return deck.remove(0);
	}
}


class Player {  //자신의 카드 리스트를 지닌 플레이어 클래스 Player
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	// 자신이 지닌 카드 중 최대 카드를 리스트에서 삭제하고 리턴하는 메소드를 작성하시오.
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
