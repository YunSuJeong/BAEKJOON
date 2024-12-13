import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 2) Bubble Sort
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-i-1; j++) {
				if( arr[j] > arr[j+1] ) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				} 
			}
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
	}

}
