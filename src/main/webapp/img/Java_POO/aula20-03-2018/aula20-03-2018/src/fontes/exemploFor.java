package fontes;

public class exemploFor {
    public static void main(String[] args) {
        
        for (char c = 'a'; c <= 'z'; c++){
            System.out.println(c);
        }
        
        for(int i=1; i <=10; ){
            System.out.println(i);
            i+=2;
        }
        System.out.println("------------------");
        for (int i=10; i > 0; i--){
            System.out.println(i);
        }
    }
}
