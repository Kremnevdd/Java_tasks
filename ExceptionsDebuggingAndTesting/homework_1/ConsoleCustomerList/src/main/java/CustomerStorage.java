import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }
    String regexMail = ("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
    Pattern patternMail  = Pattern.compile(regexMail);
    String regexNumber = ("[+]?\\d{11}");
    Pattern patternNumber = Pattern.compile(regexNumber);
    public void addCustomer(String data) throws IndexOutOfBoundsException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        String[] components = data.split("\\s+");
        Matcher matcherMail = patternMail.matcher(components[2]);
        Matcher matcherNumber = patternNumber.matcher(components[3]);

        if (components.length != 4){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (!matcherMail.matches()){
            throw new RuntimeException("thisIsNotAnEmail");
        }
        if (!matcherNumber.matches()){
            throw new RuntimeException("thisIsNotANumber");
        }


            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));



    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}