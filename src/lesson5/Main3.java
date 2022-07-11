package lesson5;

public class Main3 {
    public static void main(String[] args) {
        String checkVowels = MethodsHomework.checkVowels("Never give up!"); // Количество гласных в тексте
        String textReverse = MethodsHomework.textReverse("Never give up!"); // Обратный текст
        String checkPunct = MethodsHomework.checkPunctuation("Never give up!,.-!"); // Количество знаков пунктуации в тексте
        int square = MethodsHomework.squareMassive(7,7);
        int minNum = MethodsHomework.minNum(234,456,23); // Меньшее число из трех
        double gain = MethodsHomework.gain(10000, 10.2,2); //Значение прироста % через ? лет
        boolean checkEmail = MethodsHomework.checkEmail("jigaba@inbox..ru");
    }
}
