package Tasks;

public class WordSorter {
    public static String order(String line){
        String[] words = line.split(" ");
        String[] reorderedWords = new String[words.length];

        for (String word : words) {
            String cleaned = word.replaceAll("[^0-9]+", "");
            if (!cleaned.isEmpty()) {
                int val = Integer.parseInt(cleaned);
                reorderedWords[val-1] = word;
            } else {
                System.out.printf("Error parsing word: %s", word);
            }
        }
        StringBuilder res = new StringBuilder(line.length());
        for(int i = 0; i< words.length; i++){
            res.append(reorderedWords[i]);
            if(i!= words.length-1){
                res.append(" ");
            }
        }

        return res.toString();
    }

    public static void orderTest(){
        assert("Thi1s is2 3a T4est".equals(order("is2 Thi1s T4est 3a")));
        assert("Fo1r the2 g3ood 4of th5e pe6ople".equals(order("4of Fo1r pe6ople g3ood th5e the2")));
        assert(order("").isEmpty());

    }


}
