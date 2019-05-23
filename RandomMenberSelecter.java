import java.util.ArrayList;
import java.util.Collections;

public class RandomMenberSelecter {
	public static void main(String[] args) {
		ArrayList <Integer> menber = new ArrayList <>();
		System.out.println("乱数による人数の割り振りを実行します。");
							//////////////////////////////////////
		int capacity  = 10; // この文の数値を定員の数に変更する		//
		int Applicant = 30; // この文の数値を希望者の数に変更する		//
							//////////////////////////////////////
		for (int j = 0; j < capacity ; j++)
			menber.add(j, 1 + (int) (Math.random() * Applicant));
        Collections.shuffle(menber);
		System.out.println("番号札:" + menber + "番");
		System.out.println("処理を終了します。");
	}
}
// Author	Osanai Akira
