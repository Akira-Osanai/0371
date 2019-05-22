import java.util.Scanner;

public class Bigsmall {


	public static void main(String[] args) {
//		・ルール説明
//
//		自分の数字が相手の数字よりも、大きいか小さいかを当てるゲーム。
//
//		大きいと予想した場合には"b"、小さいと予想した場合には"s"を入力。
//		しかし、実はb以外を入力すると全て小さいと判定したことになる仕様。
//
//		予想が結果と一致した場合には勝ち判定、違う場合には負け判定を出力する。
//		数字が同じ場合には引き分けとする。
//		もう一度行う場合には、その都度実行する必要がある。
//
//		・ハマったところ
//		String型の比較を == で行ってしまったこと。
//		== はint型の比較に用いる比較演算子で、String型の場合は i.equals()と記述しないと正しく比較してくれない。
//		== はメモリの番地番号を参照するだけであって、番地の中身を比較するのではない。
//		条件分岐の判定をせずにelseの処理を行ってしまうのだ。
//
//		・今後実装したい部分
//		bとs以外の入力を受け付けた場合に、もう一度入力し直させる。
//		結果が表示された後にもう一度遊ぶか選択させる。

		System.out.println("big or small? (bかsを入力してください) : ");
		Scanner sc = new Scanner(System.in); 					//キーボードからの入力宣言
		String i = sc.next(); 				 					// 入力した文字列をiに代入

		if(i.equals("b")) {
			System.out.println("あなたはbigを選択しました。");		//bを入力したら出力する
		} else {
			System.out.println("あなたはsmallを選択しました。");		//b以外を入力したら出力する
		}

		int number1 = (int)(Math.random() * 10);				//数字を整数の乱数で代入させる
		int number2 = (int)(Math.random() * 10);
		System.out.println("あなたの数字は" + number1 + "です。");  //乱数の結果を出力する
		System.out.println("相手の数字は" + number2 + "です。");

		if(number1 > number2 && i.equals("b") ||				//自分>相手で変数iが文字列"b"の時　かつ、
		  (number1 < number2 && i.equals("s"))) {				//自分<相手で変数iが文字列"s"の時
			System.out.println("あなたの勝ちです！");				//勝ち判定
		} else if (number1 < number2 && i.equals("b") ||
				  (number1 > number2 && i.equals("s"))) {		//勝ち判定の逆の条件
			System.out.println("あなたの負けです・・・");			//負けの判定
		} else {
			System.out.println("引き分けです。もう一度挑戦しましょう！"); //引き分けの判定
		}
	}
}
