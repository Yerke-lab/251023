import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Dell", 8, 512, "Windows 10", "Черный"));
        notebooks.add(new Notebook("Lenovo", 16, 1024, "Windows 11", "Серебристый"));
        notebooks.add(new Notebook("HP", 4, 256, "Windows 10", "Белый"));

        Map<String, String> filter = new HashMap<>();
        filter.put("ОЗУ", "8");
        filter.put("ОбъемЖД", "512");
        filter.put("ОперационнаяСистема", "Windows 10");
        // Другие критерии фильтрации также можно добавить

        LaptopFilter.filterLaptops(notebooks, filter);
    }
}
