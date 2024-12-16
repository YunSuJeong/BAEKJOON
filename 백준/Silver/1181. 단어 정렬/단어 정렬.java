import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 2) compator 이용 
		List<String> arr = new ArrayList<String>();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			if( !arr.contains(str) ) arr.add(str);
		}
		
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if( o1.length() == o2.length() ) return o1.compareTo(o2);
				else return o1.length() - o2.length();
			}
		});
		
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
