package aRandom;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";  
        String lrs="";  
        int n = str.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring  
                String x = LongestCommonPrefix.lcp(str.substring(i,n),str.substring(j,n));  
                //If the current prefix is greater than previous one   
                //then it takes the current one as longest repeating sequence  
                if(x.length() > lrs.length()) lrs=x;    
            }  
        }  
        System.out.println("Longest repeating sequence: "+lrs);  
 }  
}