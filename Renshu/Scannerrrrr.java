import java.util.Scanner; 
public class Scannerrrrr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        int a=scanner.nextInt();
        int ans;
        ans=1;
        for(int i=0;i<a;i++){
        System.out.println(ans);
        ans=ans*2;
        }
    }  
}