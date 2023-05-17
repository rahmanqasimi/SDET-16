package Practice2;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile("J1",15),new WordFile("W1",24),new PdfFile("P1",45)};
        for (File f:files) {
            f.open();
            f.edit();
            f.close();
        }
    }

}
