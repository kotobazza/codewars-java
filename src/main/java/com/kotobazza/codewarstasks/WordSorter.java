package main.java.com.kotobazza.codewarstasks;




public class WordSorter {
    public static String order(String line){
        String[] words = line.split(" ");
        String[] reorderedWords = new String[words.length];

        if(words.length==1) return words[0];

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

}