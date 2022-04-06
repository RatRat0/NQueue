package nQueue;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	int n;
	List<List<Integer>> res = new ArrayList();
	List<Integer> oneSou = new ArrayList();
	
	public Solution(int n) {
		this.n = n;
		Boolean col[] = new Boolean[n];
		Boolean dia[] = new Boolean[2 * n - 1];		//主对角线
		Boolean subDia[] = new Boolean[2 * n - 1];	//副对角线
		booleanInit(col);
		booleanInit(dia);
		booleanInit(subDia);
		dfs(0, n, col, dia, subDia);	
	}
	
	/**
	 * @author ratRat
	 * @param shuzu
	 * @exception make Array's number all false
	 */
	private void booleanInit (Boolean shuzu[]) {
		for (int i = 0; i < shuzu.length; i++) {
			shuzu[i] = false;
		}
	}
	
	private void dfs(int i, int n, Boolean col[], Boolean dia[], Boolean subDia[]) {
		if (i >= n) {
			res.add(new ArrayList(oneSou));
		}
		for (int j = 0; j < n; j++) {
			if (col[j] || dia[i + j] || subDia[i - j + n - 1]) continue;
			col[j] = true;
			dia[i + j] = true;
			subDia[i - j + n - 1] = true;
			oneSou.add(j + 1);
			dfs(i + 1, n, col, dia, subDia);
			col[j] = false;
			dia[i + j] = false;
			subDia[i - j + n - 1] = false;
			oneSou.remove(oneSou.size() - 1);		
		}	
	}
	
}
