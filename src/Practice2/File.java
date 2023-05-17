package Practice2;

public abstract class File {
   /* Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
    */
    private String name;
    private double fileSize;
    abstract void open();
    void edit(){
        System.out.println("File is editing");

    };
    void close(){
        System.out.println("File is closed");

    };

    public File(String name, double fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }
}

    class JavaFile extends File{

        public JavaFile(String name, double fileSize) {
            super(name, fileSize);
        }

        @Override
        void open() {
            System.out.println("Notepad++ is required.");
        }
    }
     class WordFile extends File{

        public WordFile(String name, double fileSize) {
            super(name, fileSize);
        }

        @Override
        void open() {
            System.out.println("Microsoft is required.");
        }
    }
     class PdfFile extends File{

        public PdfFile(String name, double fileSize) {
            super(name, fileSize);
        }

        @Override
        void open() {
            System.out.println("Acrobat reader is required.");
        }
    }
