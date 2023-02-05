import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
//    Отсортировать по стоимости, по памяти, по перечислению (в том же порядке что задано в перечислении)
    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (Double.compare(o1.getPrice(),o2.getPrice()) == 0) {
            if (Integer.compare(o1.getRam(),o2.getRam()) == 0) {
                if (o1.getBrand().ordinal() < o2.getBrand().ordinal()) {
                    return -1;
                } else if (o1.getBrand().ordinal() > o2.getBrand().ordinal()) {
                    return 1;
                }
                return 0;
            }
            return Integer.compare(o1.getRam(),o2.getRam());
        }
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
