package pasha.edu;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        String[] names = new String[8];
        names [0] = "Паша";
	names [1] = "Артем";
	names [2] = "Деник";
	names [3] = "Олег";
	names [4] = "Девид";
	names [5] = "Саша";
	names [6] = "Максим 1";
	names [7] = "Максим 2";

        String[] figures = new String[12];
        figures [0] = "Куб";
        figures [1] = "Прямокутний Трикутник";
        figures [2] = "Ромб";
        figures [3] = "Паралелаграm";
        figures [4] = "Рівностороній Трикутник";
        figures [5] = "Пралепіпет";
        figures [6] = "Трапеція";
        figures [7] = "Круг";
        figures [8] = "Еліпс";
        figures [9] = "Циліндр";
        figures [10] = "Конус";
        figures [11] = "Піраміда";

        for (int i = 0; i < names.length; i++) {
           int j = random.nextInt(11);
           if (i == 0 || i == 2){
               continue;
           }
           while (figures[j].equals(" ") || j == 0 || j == 1){
               j = random.nextInt(11);

           }
           if (i == 4 && j == 0 ){
               j = random.nextInt(11);
           }
           System.out.println(names[i] + ' ' + figures[j]);
            figures[j] = " ";

        }
    while (true){}
    }
}
