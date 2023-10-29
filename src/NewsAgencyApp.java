import java.util.ArrayList;
import java.util.List;
public class NewsAgencyApp {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        EmailSubscriber emailSubscriber1 = new EmailSubscriber("@John");
        EmailSubscriber emailSubscriber2 = new EmailSubscriber("@Dana");
        OfflineSubscriber offlineSubscriber1 = new OfflineSubscriber("New York");
        OfflineSubscriber offlineSubscriber2 = new OfflineSubscriber("Astana");
        NumberSubscribers numberSubscriber1 = new NumberSubscribers("777");
        NumberSubscribers numberSubscriber2 = new NumberSubscribers("888");



        newsAgency.registerSubscriber(emailSubscriber1);
        newsAgency.registerSubscriber(emailSubscriber2);
        newsAgency.registerSubscriber(offlineSubscriber1);
        newsAgency.registerSubscriber(offlineSubscriber2);
        newsAgency.registerSubscriber(numberSubscriber1);
        newsAgency.registerSubscriber(numberSubscriber2);

        newsAgency.publishNews("New technology breakthrough!");
        newsAgency.publishNews("Weather update: Storm warning in coastal areas");

        newsAgency.removeSubscriber(offlineSubscriber1);

        newsAgency.publishNews("Local elections postponed");
    }
}