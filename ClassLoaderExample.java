public class ClassLoaderExample {
    public static void main(String[] args) {
        Class clazz = ClassLoaderExample.class;
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(String.class.getClassLoader());
        System.out.println(classLoader);
    }
}
