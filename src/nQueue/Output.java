package nQueue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Output {
	int n;
	static StringBuilder sb = new StringBuilder(""); 
	
	public Output(int n, List<List<Integer>> res) {
		this.n = n;
		//解法个数
		int number = res.size();
		sb.append(n + " " + number + "\r\n");
		for (int i = 0; i < number; i++) {
			List<Integer> tmp = res.get(i);
			for (int j = 0; j < tmp.size(); j++) {
				sb.append(String.valueOf(tmp.get(j)) + " ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\r\n");
		}
		String s = sb.toString();
		byte b[] = s.getBytes();
		File file = new File("queen_U201911432.out");		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fop = new FileOutputStream(file);
			fop.write(b);
			fop.flush();
			fop.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
