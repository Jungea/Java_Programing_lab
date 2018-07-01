/*
 * �ۼ���: ������
 * �ۼ���: 2018.03.31.
 * ���ϳ���: ������ũ
 */

package hw4_2;

import java.util.Random;

public class Beetle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tile; // Ÿ�� �迭
		int goalX, goalY; // ��ǥ��ġ�� ��ǥ
		int randomMove; // ���������� �����¿� ������(����)
		int[] location;  // �������� ��ġ ��ǥ {x,y}
		int count = 0;  // �̵� �õ�

		System.out.println("hw4_2: ������\n");

		tile = new char[5][5]; // 5*5�迭
		for(int i=0;i<tile.length;i++) {
			for(int j=0;j<tile[i].length;j++)
				tile[i][j]='.';
		}  // �������� ���� Ÿ�� .���� �ʱ�ȭ

		location = new int[2];  // �������� ��ġ ��ǥ
		System.out.println("��� =(0,0)");

		Random ran = new Random();
		goalX = ran.nextInt(5);
		goalY = ran.nextInt(5);  // ��ǥ��ġ�� �������� ����
		System.out.println("��ǥ =("+goalX+","+goalY+")");

		System.out.print("�̵���� =(0,0)");
		while(location[0]!=goalX || location[1]!=goalY) {  // ���������� ��ġ��ǥ�� ��ǥ��ǥ�� ���� ���� ���
			randomMove = ran.nextInt(4);  // ���������� �����̴� ����(����)

			Move(randomMove, location);
			tile[location[0]][location[1]]='#';  // �̵��� Ÿ��
			System.out.print("("+location[0]+","+location[1]+")");  //�̵���ǥ

			count+=1;  // �̵� �õ� 1����
			if(count==20)
				break;
		}

		tile[0][0]='S';  // �����ġ
		tile[goalX][goalY]='G';  // ��ǥ��ġ

		// ���
		System.out.println("\n----------");
		for(int i=0;i<tile.length;i++) {
			for(int j=0;j<tile[i].length;j++)
				System.out.print(tile[i][j]+" ");
			System.out.println();
		}
		System.out.println("----------");

		String s = (location[0]==goalX && location[1]==goalY ? "����" : "����");
		if(s=="����")
			System.out.println(s);
		else
			System.out.println(s+"\n�� �õ� Ƚ�� = "+count);

	}
	private static void Move(int direction, int[] move) {  // ���������� �̵�
		switch(direction) {
		case 0:  // ���� ([-1][])
			if(move[0]!=0)
				move[0]-=1;
			break;

		case 1:  // ������ ([][+1])
			if(move[1]!=4)
				move[1]+=1;
			break;

		case 2:  // �Ʒ��� ([[+1][])
			if(move[0]!=4)
				move[0]+=1;
			break;

		case 3:  // ���� ([][-1])
			if(move[1]!=0)
				move[1]-=1;
			break;
		}
	}
}
