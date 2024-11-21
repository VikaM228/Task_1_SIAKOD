import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scanner.nextInt();

        // Генерация массива случайных чисел
        Random random = new Random();
        int[] massiv = new int[size];
        for (int i = 0; i < size; i++) {
            massiv[i] = random.nextInt(11); // Числа от 0 до 10
        }

        // Вывод массива (необязательно)
        System.out.println("Массив: " + Arrays.toString(massiv));

        long startTime = System.nanoTime(); // Измерение времени начала

        // Поиск наиболее часто встречающегося элемента
        int count;
        int maxCount = 0;
        int num = massiv[0];

        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (massiv[j] == massiv[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                num = massiv[i];
            }
        }

        // Результат
        System.out.println("Наиболее частое число: " + num);

        long endTime = System.nanoTime(); // Измерение времени окончания
        double executionTime = (endTime - startTime) / 1e6; // Время в миллисекундах
        System.out.printf("Время выполнения: %.6f миллисекунд%n", executionTime);
    }
}

