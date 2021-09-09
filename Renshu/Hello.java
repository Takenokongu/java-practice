public class Hello {
    public static void main(String[] args){
        for(int i=3;i>0;i--){
            parrot(i);
        }
    }
    static void parrot(int x){
        String s="";
        for(int i=0;i<x;i++){
            s=s+"nya ";
        }
        System.out.println(s);
    }
}