public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"Morango", "Uva", "Acerola", "Manga"};
        String[] array2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi", "Acerola"};

        for(int i=0; i < array1.length; i++){
            for(int j=0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
