import java.lang.reflect.Method;
public class Reflection_39{
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Student");
            Object obj = c.getDeclaredConstructor()
                     .newInstance();
            Method[] methods =
                    c.getDeclaredMethods();

            System.out.println("Methods:");
            for(Method m : methods) {
                System.out.println(m.getName());
            }
            Method method = c.getDeclaredMethod("show");
            method.invoke(obj);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}