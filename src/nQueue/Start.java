package nQueue;

import java.util.List;

public class Start {
	public static void main(String[] args) {
		Input in = new Input();
//		Ҫ���N�ʺ�����ĸ���
		int times = in.getTimes();
//		ÿ�����N�ʺ������N
		List<Integer> list = in.getNs();
		for (int i = 0; i < times; i++) {
			int n = list.get(i);
			Solution solution = new Solution(n);
			new Output(n, solution.res);
		}
	}
}
