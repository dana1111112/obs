import java.util.ArrayList;
import java.util.List;

// Subject (Observable) interface
interface NewsPublisher {
    void registerSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void notifySubscribers(String news);
}