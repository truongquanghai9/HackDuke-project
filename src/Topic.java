
import java.util.*;
public class Topic {
    private String[] topics = {"biology", "chemistry", "physics", "math", "computer science"};

    private String myTopic;

    public Topic(String topic){
        if(!Arrays.asList(topics).contains(topic)){
            myTopic = "other";
        }
        else{
            myTopic = topic;
        }
    }
    public String getTopic(){
        return myTopic;
    }

}
