package org.example;

/**
 * Интерфейс, содержащий прототипы функций для измерения времени выполения методов коллекций ArrayList и LinkedList
 */
public interface TrackTime {
    long trackAddTime();
    long trackRemoveTime();
    long trackGetTime();
    long trackSubListTime();

    /**
     * Метод для генерации графы таблицы со значением
     * @param number
     * @param len
     * @return
     */
    default String TableValue(long number, int len) {
        String k = Long.toString(number);
        int length = (len - k.length())/2;
        String TableValue = "";
        for (int i = 0; i < length; i++)
            TableValue += " ";
        for (int i = 0; i < k.length(); i++)
            TableValue += Character.toString(k.charAt(i));
        for (int i = length + k.length(); i < len; i++)
            TableValue += " ";
        return TableValue;
    }

    /**
     * Метод для генерации таблицы времени выполения методов коллекций ArrayList и LinkedList
     * @param NumL
     * @param values
     * @return
     */
    default String Table(String NumL, String[]values) {

        String Table = "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                       "\n+                    +                    +                +" +
                       "\n+ Name of the method + Number of Launches + Compiling time +" +
                       "\n+                    +                    +                +" +
                       "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                       "\n+                    +                    +                +" +
                       "\n+        ADD         +"+NumL+"+"+values[0]+"+" +
                       "\n+                    +                    +                +" +
                       "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                       "\n+                    +                    +                +" +
                       "\n+       REMOVE       +"+NumL+"+"+values[1]+"+" +
                       "\n+                    +                    +                +" +
                       "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                       "\n+                    +                    +                +" +
                       "\n+        GET         +"+NumL+"+"+values[2]+"+" +
                       "\n+                    +                    +                +" +
                       "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
                       "\n+                    +                    +                +" +
                       "\n+      SUBLIST       +"+NumL+"+"+values[3]+"+" +
                       "\n+                    +                    +                +" +
                       "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" ;
        return Table;
    }
}
