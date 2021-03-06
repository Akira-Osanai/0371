import java.util.ArrayList;

public class LargeSmallAverageFilter {

	public static void main(String[] args) {
		int LargestNumber = 0;
		int SmallestNumber = 0;
		int AverageNumber = 0;
		
		int array = 10;
		int ElementCount = 1000;
		
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 0; i < array; i++) {					// 要素の値が大きい順
			number.add(i, 1 + (int) (Math.random() * ElementCount));	// 要素の値がランダム
//		number.add(i);					                 	// 要素の値が0からarrayへ

			// 最大数を検索
			if(LargestNumber == 0) {
				LargestNumber = number.get(i);
			} else if (LargestNumber < number.get(i)) {
				LargestNumber = number.get(i);
			}
			// 最小数を検索
			if(SmallestNumber == 0) {
				SmallestNumber = number.get(i);
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
