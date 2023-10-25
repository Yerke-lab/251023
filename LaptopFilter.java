import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopFilter {
    public static void filterLaptops(Set<Notebook> notebooks, Map<String, String> filter) {
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String> entry : filter.entrySet()) {
            System.out.println("Введите минимальное значение для критерия " + entry.getKey() + " (или нажмите Enter, если критерий не важен):");
            String minInput = scanner.nextLine();
            int min = minInput.isEmpty() || !isNumeric(minInput) ? Integer.MIN_VALUE : Integer.parseInt(minInput);
    
            System.out.println("Введите максимальное значение для критерия " + entry.getKey() + " (или нажмите Enter, если критерий не важен):");
            String maxInput = scanner.nextLine();
            int max = maxInput.isEmpty() || !isNumeric(maxInput) ? Integer.MAX_VALUE : Integer.parseInt(maxInput);
    
            String key = entry.getKey();
            String value = entry.getValue();
    
            switch (key) {
                case "ОЗУ":
                    notebooks.removeIf(notebook -> notebook.getOzu() < min || notebook.getOzu() > max);
                    break;
                case "ОбъемЖД":
                    notebooks.removeIf(notebook -> notebook.getVolumeZd() < min || notebook.getVolumeZd() > max);
                    break;
                case "ОперационнаяСистема":
                    notebooks.removeIf(notebook -> !notebook.getOperationSystem().equals(value));
                    break;
                // Добавьте другие критерии фильтрации здесь
            }
        }
    
        System.out.println("Ноутбуки, отвечающие условиям фильтра:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        scanner.close();
    }
    
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}

