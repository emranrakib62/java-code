
public class Table1 {

    void printtable(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println("" + n * i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
