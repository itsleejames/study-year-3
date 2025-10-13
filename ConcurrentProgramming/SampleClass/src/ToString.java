import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

public class ToString {

//    public static void main(String[] args) {
//        toString(3);
//    }


    //Version 1
//    public static String toString(Object o) {
//        if (o == null) return "null";
//        return o.getClass().toString();
//
//    }
//
//    //Version 2
//    public static String toString(Object o) {
//        Class c = o.getClass();
//        Field[] fields = c.getDeclaredFields();
//        StringBuilder result = new StringBuilder();
//
//        for (Field field : fields){
//            field.setAccessible(true);
//            String fieldName = field.getName();
//            result.append(fieldName).append(", ");
//        }
//
//        if (result.length() >0){
//            result.delete(result.length() - 2,result.length());
//        }
//        return c.getCanonicalName() + " {" +result.toString() + "}";
//
//
//
//    }

    //    Version 3
//    public static String toString(Object o) {
//        Class c = o.getClass();
//        Field[] fields = c.getDeclaredFields();
//        StringBuilder result = new StringBuilder();
//
//        for (Field field : fields) {
//            field.setAccessible(true);
//            String fieldName = field.getName();
//            String fieldType = field.getType().getSimpleName();
//            result.append(fieldName).append(", ");
//        }
//
//        if (result.length() > 0) {
//            result.delete(result.length() - 2, result.length());
//        }
//        return c.getCanonicalName() + " {" + result.toString() + "}";
//
//

    //Version 4
//    static String toString(Object o) {
//        Class c = o.getClass();
//        StringBuilder result = new StringBuilder();
//
//        result = new StringBuilder();
//
//        result.append(c.getName()).append(" {");
//
//        boolean isFirst = true;
//
//        for (Field field : c.getDeclaredFields()) {
//            int modifiers = field.getModifiers();
//
//            if (!Modifier.isStatic(modifiers)) {
//                if (!isFirst) {
//                    result
//                            .append(", ");
//                }
//
//                result.append(field.getName()).append(" :");
//
//            }
//
//
//        }
//    }

        //VERSION 6
        public static String toStringV6(Object o) {
            if (o == null) return "null";
            Class<?> c = o.getClass();
            Field[] fields = c.getDeclaredFields();
            StringBuilder result = new StringBuilder();

            for (Field field : fields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                String fieldType = field.getType().getSimpleName();
                Object fieldValue;
                





    }




}





