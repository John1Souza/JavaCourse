package generics;

import java.util.List;

public class UtilsList {
    public static Object getLastOne(List<?> list){
        return list.get(list.size() - 1);
    }

    public static <T> T getLastTwo(List<T> list){
        // <T> define o tipo genérico, a partir dai consegue definir o tipo de retorno T
        // e os tipos de parametros List<T>
        return list.get(list.size() - 1);
    }

//    public static <A, B, C> C test(A paramA, B paramB){
//        C test = null;
//        return test;
//    }
}
