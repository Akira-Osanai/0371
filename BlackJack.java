import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {

		ArrayList<Integer> card = new ArrayList<>(52);
		Collections.shuffle(card);

		int winCount = 0;
		int loseCount = 0;
		int drawCount = 0;

		Boolean gameLoop = true; //再プレイ用の判定

		int i = 1; //プレイヤー、cpuの手札追加のための値

		while (gameLoop) {

			//配列の初期化と乱数の代入を行う
			for (int j = 0; j <= 52; j++) {
				card.add(j, 1 + (int) (Math.random() * 12));
				card.add(j, 1 + (int) (Math.random() * 12));
			}

			int playerCardSum = card.get(0) + card.get(1);

			System.out.println("BlackJack!!!");
			System.out.println("");
			System.out.println("プレイヤーの手札は " + card.get(0) + " と " + card.get(1) + " です。");
			System.out.println("プレイヤーの合計値は [" + (card.get(0) + card.get(1)) + "] です。");

			// プレイヤーのドロー選択
			while (true) {
				System.out.println("カードを引きますか？ (y/n)");
				Scanner sc = new Scanner(System.in);
				String drow = sc.next(); //選択肢の入力
				if (drow.equals("Y") || drow.equals("y")) {
					i++;
					playerCardSum += card.get(i);
					System.out.println("プレイヤーの手札に[" + card.get(i) + "]が追加されました。");
					System.out.println("");
					System.out.println("プレイヤーの合計値は [" + playerCardSum + "] です。");
				} else if (drow.equals("N") || drow.equals("n")) {
					break;
				} else {
					System.out.println("不正な入力のため、もう一度入力してください。");
					continue;
				}
			}
			
			// cpuのドロー選択
			int cpuCardSum = card.get(i+1) + card.get(i+2);
			for (int k = 2; cpuCardSum < 16; k++) {
				cpuCardSum += card.get(i+k);
			}
			System.out.println(card.get(i+1));
			System.out.println(card.get(i+2));
			// 最終合計値 
			System.out.println("");
			System.out.println("//// Battle! ////");
			System.out.println("");
			System.out.println("プレイヤーの最終合計値は [" + playerCardSum + "] です。");
			System.out.println("CPUの最終合計値は [" + cpuCardSum + "] です。");
			System.out.println("");

			// 勝敗判定
			
			if (playerCardSum > 21 && cpuCardSum > 21){
				System.out.println("両者ともにBUST!");
				System.out.println("引き分けです。");
				drawCount++;
			} else if (playerCardSum > 21) {
				if (playerCardSum == 21 || cpuCardSum == 21) {
					System.out.println("--- BlackJack ---");
				}
				System.out.println("プレイヤーがBUST!");
				System.out.println("CPUの勝ちです。");
				loseCount++;
			} else if (cpuCardSum > 21) {
				if (playerCardSum == 21 || cpuCardSum == 21) {
					System.out.println("--- BlackJack ---");
				}
				System.out.println("CPUがBUST!");
				System.out.println("プレイヤーの勝ちです。");
				winCount++;
			} else if (playerCardSum > cpuCardSum) {
				if (playerCardSum == 21 || cpuCardSum == 21) {
					System.out.println("--- BlackJack ---");
				}
				System.out.println("プレイヤーの勝ちです。");
				winCount++;
			} else if (playerCardSum < cpuCardSum) {
				if (playerCardSum == 21 || cpuCardSum == 21) {
					System.out.println("--- BlackJack ---");
				}
				System.out.println("CPUの勝ちです。");
				loseCount++; 
			} else if (playerCardSum == cpuCardSum){
				if (playerCardSum == 21 || cpuCardSum == 21) {
					System.out.println("--- BlackJack ---");
					}
				System.out.println("引き分けです。");
				drawCount++;
			}
			
			// 再挑戦の選択
			while (true) {
				System.out.println("もう一度挑戦しますか？ (y/n)");
				Scanner sc1 = new Scanner(System.in);
				String retry = sc1.next();
				if (retry.equals("Y") || retry.equals("y")) {
					System.out.println("/////////////////////////////////////////////");
					break;
				} else if (retry.equals("N") || retry.equals("n")) {
					System.out.println("ゲームを終了します。");
					System.out.println(
							"結果：勝ち数: " + winCount + " 負け数: " + loseCount + " 引き分け数: " + drawCount + " でした。");
					gameLoop = false;
					break;
				} else {
					System.out.println("不正な入力のため、もう一度入力してください。");
					continue;
				}
			}
		}
	}
}
// // Author	Osanai Akira
