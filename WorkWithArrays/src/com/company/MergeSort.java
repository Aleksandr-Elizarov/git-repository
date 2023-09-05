package com.company;

public class MergeSort {
//  public MergeSort() {
//  }

  public static void main(String[] args) {
    int[] arraySimple = new int[]{4, 3, 2, 1};
    int[] var100el = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15,
            16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 111, 134};
    int[] varMaxBad100el = new int[]{111, 110, 99, 98, 97, 96, 95, 94, 93, 92,
            91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 36, 35, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 5, 4, 3, 2, 1, 0};
//    sortArray(arraySimple);
    printArray(sortArray(varMaxBad100el));
  }

  public static int[] sortArray(int[] arrayA) { // сортировка Массива который
    // передается в функцию
    // проверяем не нулевой ли он?
    if (arrayA == null) {
      return null;
    }
    // проверяем не 1 ли элемент в массиве?
    if (arrayA.length < 2) {
      return arrayA; // возврат в рекурсию в строки ниже см комменты.
    }
    // копируем левую часть от начала до середины
    int[] arrayB = new int[arrayA.length / 2];
    System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
    System.out.println("step 1");
    printArray(arrayB);

    // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
    int[] arrayC = new int[arrayA.length - arrayA.length / 2];
    System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
    System.out.println("step 2");
    printArray(arrayC);

    // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
    // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
    // точнее правую часть от него и опять вернет его назад
    arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
    arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

    // далее опять рекурсия возврата слияния двух отсортированных массивов
    return mergeArrays(arrayB, arrayC);
  }

  public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
    int[] resArray = new int[arrayA.length + arrayB.length];
    int n = arrayA.length;
    int m = arrayB.length;
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (arrayA[i] <= arrayB[j]) {
        resArray[k] = arrayA[i];
        i++;
      } else {
        resArray[k] = arrayB[j];
        j++;
      }
      k++;
    }
    while (i < n) {
      resArray[k] = arrayA[i];
      i++;
      k++;
    }
    while (j < m) {
      resArray[k] = arrayB[j];
      j++;
      k++;
    }
    return resArray;
  }

  public static void printArray(int[] array) {
    for (int j : array) {
      System.out.print(j);
      System.out.print(" ");
    }

    System.out.println();
  }
}
