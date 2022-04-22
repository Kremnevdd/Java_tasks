public class Main {
    public static void main(String[] args) {
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
        int size = 30  ;
        TwoDimensionalArray array = new TwoDimensionalArray();
        //array.getTwoDimensionalArray(4);

        //System.out.println(array.getTwoDimensionalArray(4));
        for (int i = 0; i < size ; i++){
            System.out.println(array.getTwoDimensionalArray(size)[i]);
        }
    }
}
