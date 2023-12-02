import java.util.*;

public class NewsAgency implements NewsAgencySubject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> availableNews = new ArrayList<>();
    private Map<Subscriber, List<String>> subscriberInterests = new HashMap<>();

    public void addNews(String news) {
        availableNews.add(news);
    }

    public void removeNews(String news) {
        availableNews.remove(news);
    }

    @Override
    public void addSubscriber(Subscriber subscriber, List<String> interests) {
        subscribers.add(subscriber);
        subscriberInterests.put(subscriber, interests);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        subscriberInterests.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            List<String> interests = subscriberInterests.get(subscriber);
            String news = getRandomNews(interests);
            subscriber.update(news);
        }
    }

    private String getRandomNews(List<String> interests) {
        Random random = new Random();
        int index = random.nextInt(availableNews.size());
        return availableNews.get(index);
    }

    public void publishNews() {
        notifySubscribers();
    }

    public void updateSubscriberInterests(Subscriber subscriber, List<String> newInterests) {
        subscriberInterests.put(subscriber, newInterests);
    }
}