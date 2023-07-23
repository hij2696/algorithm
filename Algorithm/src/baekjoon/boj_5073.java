import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while (true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int[] line = new int[3];
    		line[0] = Integer.parseInt(st.nextToken());
    		line[1] = Integer.parseInt(st.nextToken());
    		line[2] = Integer.parseInt(st.nextToken());
    		
    		if (line[0] == 0 && line[1] == 0 && line[2] == 0) break;
    		
    		Arrays.sort(line);
    		
    		if (line[2] >= line[0] + line[1]) bw.write("Invalid\n");
    		else if (line[0] == line[1] && line[0] == line[2]) bw.write("Equilateral\n");
    		else if (line[0] != line[1] && line[0] != line[2] && line[1] != line[2]) bw.write("Scalene\n");
    		else bw.write("Isosceles\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}