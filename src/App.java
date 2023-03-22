import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"Morango", "Uva", "Acerola", "Manga", "Banana", "Mamão"};
        String[] array2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi", "Acerola", "Uva"};
        List<String> result = new ArrayList<>();

        for(int i=0; i < array1.length; i++){
            for(int j=0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    result.add(array1[i]);
                }
            }
        }
        System.out.println(result);
    }
}
