
public class Problem2 {
	
static int pow(int n, int m){int i, o=n;
	                     for(i=1;i<m;i++) n=n*o; return n;}

public static void main(String[] args){int n=2, m=10; 
                                       System.out.println(pow(n, m));}

}
