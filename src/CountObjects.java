public class CountObjects {
    static int nobjects = 0;

    {
        nobjects++;
    }

    public CountObjects() {
    }

    public CountObjects(int n) {
    }

    public CountObjects(String s) {
    }

    public static void main(String args[]) {
        CountObjects t1 = new CountObjects();
        CountObjects t2 = new CountObjects(5);
        CountObjects t3 = new CountObjects("GFG");
        System.out.println("В данній програмі було створено: " + CountObjects.nobjects + " обєкти.");
    }
}