package com.Homework18;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Field[] fields = mathClass.getFields();
        for (Field field : fields) {
            System.out.println("public static " + field.getType().getSimpleName() + " " + field.getName());
        }
        Method[] methods = mathClass.getMethods();
        for (Method method : methods) {
            System.out.print("public static " + method.getReturnType().getSimpleName() + " " + method.getName() + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getSimpleName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }
}
