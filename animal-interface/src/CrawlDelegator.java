public class CrawlDelegator implements Crawlable {

    private String crwalStr = "crawl crawl";

    public CrawlDelegator() {
    }

    public CrawlDelegator(String crawlStr) {
        this.crwalStr = crawlStr;
    }

    @Override
    public void crawl() {
        System.out.println(this.crwalStr);
    }
}
