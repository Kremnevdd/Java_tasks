public class TwoDimensionalArray {
    public static char symbol = 'X';


    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        char charArray[][] = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int q = 0; q < size; q++) {
                if (i == q  || q == (size-1) -i) {
                    charArray[i][q] = symbol;
                }

                else
                    charArray[i][q] = ' ';
            }
            /*for (int j = size-1; j > 0; j--){
                if (j == size - i){
                    charArray[i][j] = symbol;
                }
            }*/

        }
        return charArray;
    }
}

