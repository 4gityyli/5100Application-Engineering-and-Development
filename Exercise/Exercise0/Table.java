public class Table {
    public static void main(String[] args){}
    public Table(int numDrawers, String material, boolean hasComputer, String color, double width, double height, String deskName, int tableId) {
        this.numDrawers = numDrawers;
        this.material = material;
        this.hasComputer = hasComputer;
        this.color = color;
        this.width = width;
        this.height = height;
        this.deskName = deskName;
        this.tableId = tableId;
        System.out.println("hello");
    }

    private int numDrawers;
    private String material;
    private boolean hasComputer;
    private String color;
    private double width;
    private double height;
    private String deskName;
    private int tableId;

    public static class Pencil {

        private String color;
        private String brand;
        private double tipSize;
        private boolean isBallpoint;
        private String penName;
        private int penId;

        public Pencil(String color, String brand, double tipSize, boolean isBallpoint, String penName, int penId) {
            this.color = color;
            this.brand = brand;
            this.tipSize = tipSize;
            this.isBallpoint = isBallpoint;
            this.penName = penName;
            this.penId = penId;
            System.out.println("Pen instance created with name: " + penName + " and ID: " + penId);
        }


        public void write() {
            System.out.println("Writing with pencil");
        }

        public void changeInk() {
            System.out.println("Changing ink in pencil");
        }

        public void capOn() {
            System.out.println("Capping pen...");
        }
    }

    public static class Notebook {

        private String coverColor;
        private int numPages;
        private String brand;
        private boolean hasLines;
        private String notebookName;
        private int notebookId;

        public Notebook(String coverColor, int numPages, String brand, boolean hasLines, String notebookName, int notebookId) {
            this.coverColor = coverColor;
            this.numPages = numPages;
            this.brand = brand;
            this.hasLines = hasLines;
            this.notebookName = notebookName;
            this.notebookId = notebookId;
            System.out.println("Notebook instance created with name: " + notebookName + " and ID: " + notebookId);
        }


        public void write() {
            System.out.println("Writing in notebook...");
        }

        public void tearOutPage() {
            System.out.println("Tearing out page from notebook...");
        }

        public void closeNotebook() {
            System.out.println("Closing notebook...");
        }
    }


}