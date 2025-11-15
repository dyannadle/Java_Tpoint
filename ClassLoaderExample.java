public class ClassLoaderExample {
    public static void main(String[] args) {
        Class c= ClassLoaderExample.class;
        ClassLoader classLoader = c.getClassLoader();
        System.out.println(String.class.getClassLoader());
        System.out.println(classLoader);
    }
}   
