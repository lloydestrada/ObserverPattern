import java.util.List;

public interface NewsAgencySubject {
        void addSubscriber(Subscriber subscriber, List<String> interests);
        void removeSubscriber(Subscriber subscriber);
        void notifySubscribers();
}