/*
Класс Notebook содержит поля:
        Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
        Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
        Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
        Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
        Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {
    public static final double[] PRICES = new double[]{100, 200, 300, 400, 500, 600, 700, 800};
    public static final int[] RAM = new int[]{4, 8, 16, 20, 24, 28, 32};
    public static final Notebook.Brand[] brands = Notebook.Brand.values();

    public static void main(String[] args) {
        Random ri = new Random();
        ArrayList<Notebook> notebooks = new ArrayList<>();
        // заполнение исходного массива ноутов
        for (int i = 0; i < 10000; i++) {
            notebooks.add(new Notebook(PRICES[ri.nextInt(0, PRICES.length)],
                                        RAM[ri.nextInt(0, RAM.length)],
                                        brands[ri.nextInt(0, brands.length)]));
        }
        // вывод исходного массива ноутов
        for (Notebook item:notebooks) {
            System.out.println(item);
        }
        System.out.println();

        //Сортировка вставкой
        insertSort(notebooks);

        // вывод отсортированного массива ноутов
        for (Notebook item:notebooks) {
            System.out.println(item);
        }
    }

    public static void insertSort(ArrayList<Notebook> array){
        //
        Comparator<Notebook> notebookComparator = new NotebookComparator();
        for (int i = 1; i < array.size(); i++) {
            Notebook cursor = array.get(i);
            int j = i -1;
            while (j>=0 && notebookComparator.compare(array.get(j), cursor) > 0) {
                array.set(j+1,array.get(j));
                j --;
            }
            array.set(j+1, cursor);
        }
    }

}
