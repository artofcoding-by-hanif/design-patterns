import com.artofcoding.templatemethod.GenerateReportTask;
import com.artofcoding.templatemethod.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var task = new TransferMoneyTask();
        task.execute();

        var task2 = new GenerateReportTask();
        task2.execute();
    }
}