package Control_Statements.ForLoop;

public class LabeledForLoop_1 {
    public static void main(String[] args) { 
        for(int i=1;i<=3;i++){    
            bb:    
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2){    
                        break bb;    
                    }    
                    System.out.println(i+" "+j);    
                }    
        }    
}    
}    