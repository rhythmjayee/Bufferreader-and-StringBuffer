import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t = Integer.parseInt(br.readLine()); 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int[] ints = new int[strs.length];
            int co = 0;
            for(String x:strs){
                ints[co] = Integer.parseInt(x);
                co++;
            }
            StringBuffer buf = new StringBuffer();
            for(int i=0;i+1<n;i++){
                if(ints[i+1]<ints[i]){
                    buf.append(ints[i+1]+" ");
                }
                else{
                    buf.append(-1+" ");
                }
            }
            buf.append(-1);
            System.out.println(buf);
        }
	}
}
