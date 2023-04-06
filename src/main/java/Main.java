import ru.netogy.Packages.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int count = service.calculate(income,expenses,threshold);

        System.out.println("В этом году отдыхаю " + count + " месяца.");
    }

}
