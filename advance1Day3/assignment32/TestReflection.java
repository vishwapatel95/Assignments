package advance1Day3.assignment32;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflection {
    public static void main(String[] args) {
        try {
            // create class object
            Class classobj = Employee.class;

            // get list of methods
            Method[] methods = classobj.getMethods();
//            System.out.println(classobj.getModifiers());

//             get the name of every method present in the list
            for (Method method : methods) {

                String MethodName = method.getName();
                System.out.println("Name of the method: "
                        + MethodName);

//                Class[] parameterList = method.getParameterTypes();
//                System.out.println("Method parameter types");
//
//                for (Class class1 : parameterList){
//                    System.out.println(class1.getName() + " ");
//                }
            }



//            System.out.println();

//            int guru99AccessModifier= classobj.getModifiers();
//            // Print the access modifiers
//            System.out.println("Access modifiers of the class are : " +Modifier.toString(guru99AccessModifier));

            Field[]  Field1= classobj .getFields();
            Field[]  Field2= classobj.getDeclaredFields();

            for (Field field : Field2){
                System.out.println("Varaible name : " + field.getName());
                System.out.println("Datatype name : " + field.getType());

                int modifiers = field.getModifiers();
                System.out.println("Access specifier of the varaible : " + Modifier.toString(modifiers));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
