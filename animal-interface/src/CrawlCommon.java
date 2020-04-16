public class CrawlCommon implements Crawlable {

    private String crawlStr = "crr crr";

    public CrawlCommon(String crawlStr) {
        this.crawlStr = crawlStr;
    }

    @Override
    public void crawl() {
        System.out.println(crawlStr);
    }
}
