import java.time.LocalDate;
public class Article {
    public static final int WORD_LIMIT_ABSTRACT = 250;
    private Topic myTopic;
    private String myTitle;
    private String myLink;
    private String myAbstract;
    private String myPost;
    private LocalDate dayPosted;
    public Article(Topic topic, String title, String link, String abs, String post, LocalDate date){
        myTopic = topic;
        myTitle = title;
        myLink = link;
        if(abs.length() <= WORD_LIMIT_ABSTRACT){
            myAbstract = abs;
        }
        else{
            myAbstract = "";
        }
        myPost = post;
        dayPosted = date;
    }

    public Topic getTopic(){
        return myTopic;
    }
    public String getTitle(){
        return myTitle;
    }
    public String getLink(){
        return myLink;
    }
    public String getAbstract(){
        return myAbstract;
    }
    public String getPost(){
        return myPost;
    }
    public LocalDate getDayPosted(){
        return dayPosted;
    }

}
