public class Break_Statements {
    public static void main (String args[]){
        a:
        for (int i =0; i<=10; i++){
            b:
            for(int j=0;j<=10;j++){
                c:
                for (int k=0;k<=20;k++){
                    System.out.println(k);
                    if(k==5){
                        break a;
                    }
                }
            }
        }
    }
    
}
