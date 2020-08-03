package core.basesyntax;

import java.util.ArrayList;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 92, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        String[] resultString = text.replaceAll("[^0-9-]", ":").split(":");
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < resultString.length; i++) {
            if (resultString[i].length() > 0) {
                numberList.add(Integer.parseInt(resultString[i]) * 2);
            }
        }
        int[] resultArray = new int[numberList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = numberList.get(i);
        }
        return resultArray;
    }
}
