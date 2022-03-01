package HomeWork3.task1;

import java.util.*;


public class HomeWork3 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Rose" , "Lily", "Thistle", "Rose", " Jasmine",
                "Violet", "Iris", "Tulip", "Crocus", "Freesia",
                "Pansy", "Petunia", "Lily" );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words);
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}


