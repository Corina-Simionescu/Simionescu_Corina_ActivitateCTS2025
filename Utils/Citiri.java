import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

import org.json.*;  // Necesită biblioteca org.json
import com.opencsv.CSVReader;  // Necesită biblioteca opencsv
import com.fasterxml.jackson.databind.ObjectMapper;  // Necesită biblioteca jackson
import com.google.gson.Gson;  // Necesită biblioteca gson

public class ReadingExamplesInJava {

    // ===========================
    // 1. CITIRE DE LA TASTATURĂ
    // ===========================

    // Exemplu: Citire cu Scanner (cel mai comun)
    public static void readFromKeyboardWithScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr: ");
        int number = scanner.nextInt();
        scanner.nextLine();  // consumă newline

        System.out.print("Introduceți numele: ");
        String name = scanner.nextLine();

        System.out.print("Introduceți salariul: ");
        double salary = scanner.nextDouble();

        System.out.println("Date citite: " + number + ", " + name + ", " + salary);

        // Nu uita să închizi scanner-ul când nu mai ai nevoie de el
        // scanner.close();
    }

    // ===========================
    // 2. CITIRE DIN FIȘIER TEXT
    // ===========================

    // Exemplu 2a: Citire cu BufferedReader
    public static void readTextFileWithBufferedReader(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Citire și procesare linie cu linie - exemplu practic
    public static List<Person> readPersonsFromTextFile(String filePath) throws IOException {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String email = parts[2].trim();

                    persons.add(new Person(name, age, email));
                }
            }
        }

        return persons;
    }

    // ===========================
    // 3. CITIRE DIN FIȘIER JSON
    // ===========================

    // Exemplu 3a: Citire cu org.json
    public static void readJsonWithOrgJson(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        JSONObject jsonObject = new JSONObject(content);

        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String email = jsonObject.getString("email");

        // Citire array din JSON
        JSONArray hobbiesArray = jsonObject.getJSONArray("hobbies");
        List<String> hobbies = new ArrayList<>();
        for (int i = 0; i < hobbiesArray.length(); i++) {
            hobbies.add(hobbiesArray.getString(i));
        }

        // Citire obiect imbricat
        JSONObject addressObject = jsonObject.getJSONObject("address");
        String street = addressObject.getString("street");
        String city = addressObject.getString("city");

        System.out.println("Persoană: " + name + ", " + age + ", " + email);
        System.out.println("Hobby-uri: " + hobbies);
        System.out.println("Adresa: " + street + ", " + city);
    }

    // Exemplu 3b: Citire cu Jackson (orientat pe obiecte)
    public static Person readJsonWithJackson(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Person.class);
    }

    // Exemplu 3c: Citire cu Gson (Google)
    public static Person readJsonWithGson(String filePath) throws IOException {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, Person.class);
        }
    }

    // Exemplu de citire a unei colecții de obiecte din JSON
    public static List<Person> readPersonListFromJson(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
                new File(filePath),
                mapper.getTypeFactory().constructCollectionType(List.class, Person.class)
        );
    }

    // ===========================
    // 4. CITIRE DIN FIȘIER CSV
    // ===========================

    // Exemplu 4a: Citire CSV manual
    public static List<Person> readCsvManually(String filePath) throws IOException {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Sari header-ul
            String headerLine = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String email = parts[2].trim();

                    persons.add(new Person(name, age, email));
                }
            }
        }

        return persons;
    }

    // Exemplu 4b: Citire cu OpenCSV
    public static List<Person> readCsvWithOpenCsv(String filePath) throws Exception {
        List<Person> persons = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Sari header-ul
            String[] headerLine = reader.readNext();

            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line.length >= 3) {
                    String name = line[0].trim();
                    int age = Integer.parseInt(line[1].trim());
                    String email = line[2].trim();

                    persons.add(new Person(name, age, email));
                }
            }
        }

        return persons;
    }

    // Exemplu 4c: Citire CSV cu Scanner
    public static List<Person> readCsvWithScanner(String filePath) throws IOException {
        List<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Sari header-ul
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String email = parts[2].trim();

                    persons.add(new Person(name, age, email));
                }
            }
        }

        return persons;
    }

    // ===========================
    // CLASĂ PENTRU EXEMPLE
    // ===========================

    public static class Person {
        private String name;
        private int age;
        private String email;
        private List<String> hobbies;
        private Address address;

        // Constructor gol pentru Jackson/Gson
        public Person() {
        }

        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        // Getteri și setteri (necesari pentru Jackson/Gson)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<String> getHobbies() {
            return hobbies;
        }

        public void setHobbies(List<String> hobbies) {
            this.hobbies = hobbies;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    ", hobbies=" + hobbies +
                    ", address=" + address +
                    '}';
        }
    }

    public static class Address {
        private String street;
        private String city;
        private String zipCode;

        // Constructor gol pentru Jackson/Gson
        public Address() {
        }

        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        // Getteri și setteri
        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    '}';
        }
    }

    // ===========================
    // EXEMPLE DE FIȘIERE
    // ===========================

    /*
    Exemplu de fișier text (persons.txt):
    John Doe, 30, john@example.com
    Jane Smith, 25, jane@example.com
    Mike Johnson, 35, mike@example.com
    */

    /*
    Exemplu de fișier JSON (person.json):
    {
        "name": "John Doe",
        "age": 30,
        "email": "john@example.com",
        "hobbies": ["reading", "swimming", "hiking"],
        "address": {
            "street": "123 Main St",
            "city": "New York",
            "zipCode": "10001"
        }
    }
    */

    /*
    Exemplu de fișier CSV (persons.csv):
    Name,Age,Email
    John Doe,30,john@example.com
    Jane Smith,25,jane@example.com
    Mike Johnson,35,mike@example.com
    */

    public static void main(String[] args) {
        try {
            // Exemple de utilizare:

            // 1. Citire de la tastatură
            // readFromKeyboardWithScanner();
            // readFromKeyboardWithBufferedReader();
            // readFromConsole();

            // 2. Citire din fișier text
            // readTextFileWithBufferedReader("persons.txt");
            // readTextFileWithFiles("persons.txt");
            // readTextFileWithScanner("persons.txt");
            // List<Person> persons = readPersonsFromTextFile("persons.txt");

            // 3. Citire din fișier JSON
            // readJsonWithOrgJson("person.json");
            // Person person = readJsonWithJackson("person.json");
            // Person person = readJsonWithGson("person.json");
            // List<Person> persons = readPersonListFromJson("persons_list.json");

            // 4. Citire din fișier CSV
            // List<Person> persons = readCsvManually("persons.csv");
            // List<Person> persons = readCsvWithOpenCsv("persons.csv");
            // List<Person> persons = readCsvWithScanner("persons.csv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}