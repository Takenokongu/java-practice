import java.util.Scanner; 
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
      Scanner scanner=new Scanner(System.in); 
      int MaxA, count, Maxcount=-1, Maxkey=0;
      int N=scanner.nextInt();
	  int[] A=new int[N];
	  for(int i=0;i<N;i++){
		A[i]=scanner.nextInt();
	  }
      
      Arrays.sort(A);
      
      MaxA=A[N-1];
      
      for(int i=2;i<=MaxA;i++){
        count=0;
        for(int j=0;j<N;j++){
          if(A[j]%i==0){
            count++;
          }
        }
        if(Maxcount<=count){
			Maxcount=count;
          	Maxkey=i;
        }
      }
  	  System.out.println(Maxkey);
    }
}
