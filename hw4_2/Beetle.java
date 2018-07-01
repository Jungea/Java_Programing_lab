/*
 * 작성자: 정은애
 * 작성일: 2018.03.31.
 * 파일내용: 랜덤워크
 */

package hw4_2;

import java.util.Random;

public class Beetle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tile; // 타일 배열
		int goalX, goalY; // 목표위치의 좌표
		int randomMove; // 딱정벌레의 상하좌우 움직임(랜덤)
		int[] location;  // 딱정벌레 위치 좌표 {x,y}
		int count = 0;  // 이동 시도

		System.out.println("hw4_2: 정은애\n");

		tile = new char[5][5]; // 5*5배열
		for(int i=0;i<tile.length;i++) {
			for(int j=0;j<tile[i].length;j++)
				tile[i][j]='.';
		}  // 지나가지 않은 타일 .으로 초기화

		location = new int[2];  // 딱정벌레 위치 좌표
		System.out.println("출발 =(0,0)");

		Random ran = new Random();
		goalX = ran.nextInt(5);
		goalY = ran.nextInt(5);  // 목표위치를 랜덤으로 지정
		System.out.println("목표 =("+goalX+","+goalY+")");

		System.out.print("이동경로 =(0,0)");
		while(location[0]!=goalX || location[1]!=goalY) {  // 딱정벌레의 위치좌표와 목표좌표와 같지 않을 경우
			randomMove = ran.nextInt(4);  // 딱정벌레가 움직이는 방향(랜덤)

			Move(randomMove, location);
			tile[location[0]][location[1]]='#';  // 이동한 타일
			System.out.print("("+location[0]+","+location[1]+")");  //이동좌표

			count+=1;  // 이동 시도 1증가
			if(count==20)
				break;
		}

		tile[0][0]='S';  // 출발위치
		tile[goalX][goalY]='G';  // 목표위치

		// 출력
		System.out.println("\n----------");
		for(int i=0;i<tile.length;i++) {
			for(int j=0;j<tile[i].length;j++)
				System.out.print(tile[i][j]+" ");
			System.out.println();
		}
		System.out.println("----------");

		String s = (location[0]==goalX && location[1]==goalY ? "성공" : "실패");
		if(s=="실패")
			System.out.println(s);
		else
			System.out.println(s+"\n총 시도 횟수 = "+count);

	}
	private static void Move(int direction, int[] move) {  // 딱정벌레의 이동
		switch(direction) {
		case 0:  // 위쪽 ([-1][])
			if(move[0]!=0)
				move[0]-=1;
			break;

		case 1:  // 오른쪽 ([][+1])
			if(move[1]!=4)
				move[1]+=1;
			break;

		case 2:  // 아래쪽 ([[+1][])
			if(move[0]!=4)
				move[0]+=1;
			break;

		case 3:  // 왼쪽 ([][-1])
			if(move[1]!=0)
				move[1]-=1;
			break;
		}
	}
}
