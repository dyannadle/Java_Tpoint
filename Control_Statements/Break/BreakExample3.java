package Control_Statements.Break;

public class BreakExample3 {  
public static void main(String[] args) {  
            aa:  
            for(int i=1;i<=3;i++){    
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label  
                            break aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}  