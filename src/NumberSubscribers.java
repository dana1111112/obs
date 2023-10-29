class NumberSubscribers implements NewsSubscriber {
    private String subscriberNumber;

    public NumberSubscribers(String Number) {
        this.subscriberNumber = Number;
    }

    @Override
    public void update(String news) {
        System.out.println("App Subscriber (" + subscriberNumber + ") - Received news: " + news);
    }
}

