import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int i = 1;
		while( (str=br.readLine()) != null ) {
			StringTokenizer st = new StringTokenizer(str);
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if(L == 0 && P == 0 && V == 0) break;
			
			System.out.printf("Case %d: %d\n", i, V/P*L + Math.min(V%P, L));
			i++;
		}
	}

}
