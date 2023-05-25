package class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

    //Break till 11:50
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window");

    }

    @Override
    public void findElement() {
        System.out.println("find ");

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open it");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close it");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maxi it");

    }

    @Override
    public void findElement() {
        System.out.println("find it");

    }
}