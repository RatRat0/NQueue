package nQueue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class Input {
	//次数
	private int times;
	private List<Integer> ns = new ArrayList();
	
	public Input() {
		File file = new File("queen.in");
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			byte b[] = new byte[1024];
			int number = 0;
			number = in.read(b);
			String s = new String(b, 0, number);
			String ss[] = s.split("\r\n");
			times = Integer.valueOf(ss[0].trim());
			if (ss.length != times + 1) {
				throw new Exception("次数，与输入的文件不符");
			}
			for (int i = 0; i < times; i++) {
				ns.add(Integer.valueOf(ss[i+1].trim()));
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("没有找到queen.in");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getTimes() {
		return times;
	}
	
	public List<Integer> getNs() {
		return ns;
	}
}
