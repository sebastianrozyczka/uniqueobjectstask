public class Application {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.tryToFillTable();
        System.out.println(dataStore.showInfo());
    }
}
