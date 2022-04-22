public class Printer {
    private String queue = "";
    private String names = "";
    private int docCount = 0;
    private int pagesCount = 0;
    private int allPrintedDocs = 0;
    private int allPrintedPages = 0;

    public void append(String text) {
        append(text, "---", 0);
    }

    public void append(String text, String name) {
        append(text, name, 0);
    }

    public void append(String text, String name, int pages) {
        queue = queue + name + "\n" + pages + "\n" + text;
        pagesCount = pagesCount + pages;
        docCount++;

    }

    public void clear() {
        queue = " ";
    }

    public void print() {
        System.out.println(queue);
        allPrintedPages = allPrintedPages + pagesCount;
        allPrintedDocs = allPrintedDocs + docCount;
        queue = " ";


    }

    public int getPagesCount() {
        return pagesCount;

    }

    public int getDocumentsCount() {
        return docCount;
    }

    public String allPrinted() {

        String all = "";
        all = "All Printed Documents - " + allPrintedDocs +
                "\n" + "All Printed Pages - " + allPrintedPages;
        return all;
    }

}
