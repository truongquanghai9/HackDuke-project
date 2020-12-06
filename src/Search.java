import java.util.*;

/**
 * Facilitates searching based on key words in website
 * @author Jeffery Tan
 */
public class Search {
    private static final int MAX_SIZE = 10;
    private static final int MAX_PREFIX = 5;
    public  List<Article> Search(String search, List<Article> articles){
        ArrayList<Article> ret = new ArrayList<>();
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        PriorityQueue<String> keywords = new PriorityQueue<>(stringLengthComparator);

        for(String word : search.toLowerCase().split(" ")){
            if(keywords.size()< MAX_PREFIX){
                keywords.add(word);
            }
            else{
                keywords.add(word);
                keywords.remove();
            }
        }

        TreeMap<Integer, ArrayList<Article>> compare = new TreeMap<>(Collections.reverseOrder());

        for(Article a : articles){
            ArrayList<String> words = new ArrayList<>(Arrays.asList(a.getTitle().toLowerCase().split(" ")));
            words.retainAll(keywords);
            int matches = words.size();
            compare.putIfAbsent(matches, new ArrayList<Article>());
            compare.get(matches).add(a);
        }

        for(int i : compare.descendingKeySet()){
            for(Article art : compare.get(i)){
                ret.add(art);
                if(ret.size() == MAX_SIZE){
                    return ret;
                }
            }
        }
        return ret;

    }
}
