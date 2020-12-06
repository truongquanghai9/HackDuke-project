

import java.util.*;

/**
 * Filters articles by topic
 * @author Jeffery Tan
 */

public class Filter {
    private static final int MAX_SIZE = 10;
    public List<Article> Filter(String topic, List<Article> articles){
        ArrayList<Article> ret = new ArrayList<>();

        for(Article a : articles){
            if(a.getTopic().equals(topic.toLowerCase())){
                ret.add(a);
                if (ret.size()== MAX_SIZE){
                    return ret;
                }
            }

        }
        return ret;
    }
}
