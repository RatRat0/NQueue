package nQueue;

import java.util.List;

public class Start {
	public static void main(String[] args) {
		Input in = new Input();
//		要求解N皇后问题的个数
		int times = in.getTimes();
//		每次求解N皇后问题的N
		List<Integer> list = in.getNs();
		for (int i = 0; i < times; i++) {
			int n = list.get(i);
			Solution solution = new Solution(n);
			new Output(n, solution.res);
		}
	}
}
