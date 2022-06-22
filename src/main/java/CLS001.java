import sun.security.x509.OtherName;

public class CLS001 {

    public static void main(String args[]) {
        String str = "PpAaSsDdF5GgHhJ8e";
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        int length01 = strToArray.length;
        int dd2 =length01;
        String strNumbers00 = "1234567890";
        char b1,b2, def = '\u005F';

        if (dd2 % 2 != 0) {
            // нечетное колмч-во символов
            dd2 = length01-1;
        }

        // Вывод массива на экран
        for(int i = 0; i < length01; i++) {
            if (i%2 == 0) {
                b1 = (strNumbers00.indexOf(strToArray[i]) > -1)? def:strToArray[i];

                if (i < dd2) {
                   b2 =(strNumbers00.indexOf(strToArray[i+1]) > -1) ? def:strToArray[i+1];
                    System.out.println("" + b1 + b2);
                }else{
                     System.out.println("" +  b1  + def);
                }
            }
        }
    }


}

