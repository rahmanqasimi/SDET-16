package GroupProject2;

/*    Provide Implementation for the diagram below. Then create a test class
    in which you need to create Objects of ChromeDriver, FirefoxDrive and
      SafariDriver classes and see which methods available to them.*/

interface WebDriver{
    String getTitle();
    void open();
    void close();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class Test{
    public static void main(String[] args) {
        RemoteWebDriver chrome = new ChromeDriver();
        RemoteWebDriver firefox = new FirefoxDriver();
        RemoteWebDriver safari = new SafariDriver();

        chrome.open();
        chrome.navigate();
        chrome.getScreenshot();
        chrome.getTitle();
        chrome.close();

        firefox.open();
        firefox.navigate();
        firefox.getScreenshot();
        firefox.getTitle();
        firefox.close();

        safari.open();
        safari.navigate();
        safari.getScreenshot();
        safari.getTitle();
        safari.close();

    }
}
