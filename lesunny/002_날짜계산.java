import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	
    	Scanner in = new Scanner(System.in);
        int e=1,s=1,m=1;
        int year=1;
    	int E = in.nextInt();
    	int S = in.nextInt();
        int M = in.nextInt();
        
        while(true){
            if(e==E&&s==S&&m==M) {
                System.out.println(year);
                break;
            }
            e++;
            s++;
            m++;
            year++;
            if(e==16) e=1;
            if(s==29) s=1;
            if(m==20) m=1;
        }
    }
}
