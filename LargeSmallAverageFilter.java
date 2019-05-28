import java.util.ArrayList;

public class LargeSmallAverageFilter {

	public static void main(String[] args) {
		int LargestNumber = 0;
		int SmallestNumber = 0;
		int AverageNumber = 0;

		int array = 10;													// 配列数
		int ElementCount = 1000;										// 設定値-1

		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 0; i < array; i++) {
//			number.add(i, 1 + (int) (Math.random() * ElementCount));	// 要素の値がランダム
//			number.add(i);												// 要素の値が0からarrayへ
			number.add(array-i);										// 要素の値がarrayから0へ

			// 最大数を検索
			if(LargestNumber == 0) {
				LargestNumber = number.get(0);
			} else if (LargestNumber < number.get(i)) {
				LargestNumber = number.get(i);
			}
			// 最小数を検索
			if(SmallestNumber == 0) {
				SmallestNumber = number.get(0);
			} else if (SmallestNumber > number.get(i)) {
				SmallestNumber = number.get(i);
			}
			// AverageNumberに配列の全ての要素を足す
			AverageNumber += number.get(i);
		}
		System.out.println("要素の値は" + number + "です");
		System.out.println("最大値は[" + LargestNumber + "]です");
		System.out.println("最小値は[" + SmallestNumber + "]です");
		System.out.println("平均値は[" + (double)AverageNumber/array + "]です");
	}
}
//////要素の値が小さい順にしようとしたけど、要素の始まりの配列番号を指定していないのに、最後だけ指定してるから実行時エラー吐く。 //
//for (i = array; i >= 0; i--) {																			                            //
//		number.add(i, 1 + (int) (Math.random() * ElementCount));											//
//		number.add(i);																						//
//																											//
//	Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 1						//
//	at java.util.ArrayList.rangeCheck(ArrayList.java:657)													//
//	at java.util.ArrayList.get(ArrayList.java:433)															//
//	at LargeSmallAverageFilter.main(LargeSmallAverageFilter.java:24)										//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
