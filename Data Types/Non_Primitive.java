enum Color {
    RED, 
    GREEN,
    BLUE;
}
public class Non_Primitive {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int arr ={1,2,3,4,5};
        Color clr = Color.RED;
        System.out.println(clr);
        System.err.println(str);
        for (int member: arr){
            System.out.println(member +",");
        }
    }
}
