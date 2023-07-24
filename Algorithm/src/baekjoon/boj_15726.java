import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	double A = Double.parseDouble(st.nextToken());
    	double B = Double.parseDouble(st.nextToken());
    	double C = Double.parseDouble(st.nextToken());
    	
    	if (((A * B) / C) >= ((A / B) * C)) bw.write(String.valueOf((int)((A * B) / C)));
    	else bw.write(String.valueOf((int)((A / B) * C)));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}