import java.util.Arrays;

public class NewsSubscriptionTest {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        newsAgency.addNews("Tech News: New Smartphone Released!");
        newsAgency.addNews("Sports News: Exciting Match Results!");
        newsAgency.addNews("Politics: Key Developments in the Region");
        newsAgency.addNews("Entertainment: Kathryn Bernardo and Daniel Padilla broke up!");

        Subscriber subscriber1 = new Subscriber("User1");
        Subscriber subscriber2 = new Subscriber("User2");
        Subscriber subscriber3 = new Subscriber("User3");

        newsAgency.addSubscriber(subscriber1, Arrays.asList("Tech", "Politics"));
        newsAgency.addSubscriber(subscriber2, Arrays.asList("Sports", "Tech"));
        newsAgency.addSubscriber(subscriber3, Arrays.asList("Entertainment"));

        newsAgency.publishNews();

        newsAgency.updateSubscriberInterests(subscriber1, Arrays.asList("Entertainment"));

        newsAgency.publishNews();
    }
}