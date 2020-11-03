import java.util.Arrays;
import java.util.Scanner;

public class DataStore {
    private static final int MAX_COMPANIES = 3;

    private Scanner scanner = new Scanner(System.in);
    private Company[] companies = new Company[MAX_COMPANIES];
    private int companiesNumber;

    private Company add() {
        System.out.println("Podaj nazwę firmy:");
        String name = scanner.nextLine();
        System.out.println("Ilu pracowników pracuje w podanej firmie?");
        int employees = scanner.nextInt();
        scanner.nextLine();
        return new Company(name, employees);
    }

    public void tryToFillTable() {
        while (companiesNumber < MAX_COMPANIES){
            Company company = add();
            if (Arrays.asList(companies).contains(company)) {
                System.out.println("Duplikat");
            } else {
                companies[companiesNumber] = company;
                companiesNumber++;
            }
        }
    }

    public String showInfo() {
        String company = null;
        for (int i = 0; i < companiesNumber; i++) {
             company += "\n" + companies[i].toString();
        }
        return company;
    }
}
