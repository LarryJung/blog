public class CrawlAndWalkDelegator implements CrawlAndWalkable {

    private Crawlable crawlDelegator;
    private String walkStr = "걷는다~";
    private String runStr = "달린다~";

    public CrawlAndWalkDelegator(String walkStr, String runStr) {
        this.crawlDelegator = new CrawlDelegator("걸을 수 있으니 기어가는 건 싫어.");
        this.walkStr = walkStr;
        this.runStr = runStr;
    }

    @Override
    public void crawl() {
        crawlDelegator.crawl();
    }

    @Override
    public void walk() {
        System.out.println(walkStr);
    }

    @Override
    public void run() {
        System.out.println(runStr);
    }
}
