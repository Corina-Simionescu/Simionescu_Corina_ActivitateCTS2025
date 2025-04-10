import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

import org.json.*;  // Necesită biblioteca org.json
import com.opencsv.CSVWriter;  // Necesită biblioteca opencsv
import com.fasterxml.jackson.databind.ObjectMapper;  // Necesită biblioteca jackson
import com.google.gson.Gson;  // Necesită biblioteca gson
import com.google.gson.GsonBuilder;

public class WritingExamplesInJava {

    // ===========================
    // 1. SCRIERE LA CONSOLĂ
    // ===========================

    // Exemplu 1a: Scriere simplă la consolă
    public static void writeToConsole() {
        System.out.println("Acesta este un mesaj normal");
        System.err.println("Acesta este un mesaj de eroare");

        // Formatare de text
        String name = "John";
        int age = 30;
        System.out.printf("Numele este %s și are %d ani%n", name, age);

        // Scriere fără linie nouă la final
        System.out.print("Acesta este un text ");
        System.out.print("pe aceeași linie.");
        System.out.println();
    }

    // ===========================
    // 2. SCRIERE ÎN FIȘIER TEXT
    // ===========================

    // Exemplu 2a: Scriere cu FileWriter
    public static void writeTextWithFileWriter(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }

    // Exemplu 2b: Scriere cu BufferedWriter
    public static void writeTextWithBufferedWriter(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();  // adaugă linie nouă
            }
        }
    }

    // Exemplu 2c: Scriere cu Files (Java 7+)
    public static void writeTextWithFiles(String filePath, List<String> lines) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, lines, StandardCharsets.UTF_8);

        // Alternativa cu append
        // Files.write(path, lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    // Exemplu 2d: Scriere cu PrintWriter
    public static void writeTextWithPrintWriter(String filePath, List<Person> persons) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Person person : persons) {
                writer.printf("%s, %d, %s%n",
                        person.getName(),
                        person.getAge(),
                        person.getEmail());
            }
        }
    }

    // Exemplu practic: Scrierea unei liste de persoane într-un fișier text
    public static void writePersonsToTextFile(String filePath, List<Person> persons) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Person person : persons) {
                String line = person.getName() + ", " +
                        person.getAge() + ", " +
                        person.getEmail();
                writer.write(line);
                writer.newLine();
            }
        }
    }

    // ===========================
    // 3. SCRIERE ÎN FIȘIER JSON
    // ===========================

    // Exemplu 3a: Scriere cu org.json
    public static void writeJsonWithOrgJson(String filePath, Person person) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", person.getName());
        jsonObject.put("age", person.getAge());
        jsonObject.put("email", person.getEmail());

        // Adăugare array
        JSONArray hobbiesArray = new JSONArray();
        if (person.getHobbies() != null) {
            for (String hobby : person.getHobbies()) {
                hobbiesArray.put(hobby);
            }
        }
        jsonObject.put("hobbies", hobbiesArray);

        // Adăugare obiect imbricat
        if (person.getAddress() != null) {
            JSONObject addressObject = new JSONObject();
            addressObject.put("street", person.getAddress().getStreet());
            addressObject.put("city", person.getAddress().getCity());
            addressObject.put("zipCode", person.getAddress().getZipCode());
            jsonObject.put("address", addressObject);
        }

        // Scriere în fișier
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(jsonObject.toString(2));  // Indentare cu 2 spații
        }
    }

    // Exemplu 3b: Scriere cu Jackson
    public static void writeJsonWithJackson(String filePath, Person person) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Pentru formatare frumoasă (pretty print):
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), person);
    }

    // Exemplu 3c: Scriere cu Gson
    public static void writeJsonWithGson(String filePath, Person person) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
        }
    }

    // Exemplu de scriere a unei liste de obiecte în JSON
    public static void writePersonListToJson(String filePath, List<Person> persons) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), persons);
    }

    // ===========================
    // 4. SCRIERE ÎN FIȘIER CSV
    // ===========================

    // Exemplu 4a: Scriere CSV manual
    public static void writeCsvManually(String filePath, List<Person> persons) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Scrie headerul
            writer.println("Name,Age,Email");

            // Scrie datele
            for (Person person : persons) {
                writer.printf("%s,%d,%s%n",
                        person.getName(),
                        person.getAge(),
                        person.getEmail());
            }
        }
    }

    // Exemplu 4b: Scriere cu OpenCSV
    public static void writeCsvWithOpenCsv(String filePath, List<Person> persons) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Scrie headerul
            String[] header = {"Name", "Age", "Email"};
            writer.writeNext(header);

            // Scrie datele
            for (Person person : persons) {
                String[] data = {
                        person.getName(),
                        String.valueOf(person.getAge()),
                        person.getEmail()
                };
                writer.writeNext(data);
            }
        }
    }

    // ===========================
    // 5. SCRIERE ÎN FIȘIER BINAR
    // ===========================

    // Exemplu 5a: Scriere binară cu FileOutputStream
    public static void writeBinaryData(String filePath, byte[] data) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(data);
        }
    }

    // Exemplu 5b: Serializare de obiecte
    public static void writeSerializedObject(String filePath, Person person) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(person);
        }
    }

    // ===========================
    // 6. OPERAȚIUNI AVANSATE
    // ===========================

    // Exemplu 6a: Creare de directoare
    public static void createDirectories(String dirPath) throws IOException {
        Files.createDirectories(Paths.get(dirPath));
    }

    // Exemplu 6b: Copiere de fișiere
    public static void copyFile(String sourcePath, String targetPath) throws IOException {
        Files.copy(Paths.get(sourcePath), Paths.get(targetPath),
                StandardCopyOption.REPLACE_EXISTING);
    }

    // Exemplu 6c: Scriere append la fișier
    public static void appendToFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(content);
        }
    }

    // Exemplu 6d: Scriere în buffer și flush explicit
    public static void writeWithBufferControl(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < lines.size(); i++) {
                writer.write(lines.get(i));
                writer.newLine();

                if (i % 100 == 0) {  // făm flush la fiecare 100 de linii
                    writer.flush();
                }
            }
        } // BufferedWriter închide automat și face flush la tot ce a mai rămas
    }

    // ===========================
    // 7. SCRIEREA ÎN XML
    // ===========================

    // Această secțiune ar necesita JAXB sau alte biblioteci pentru XML
    // Dar iată un exemplu simplu de scriere manuală XML:
    public static void writeSimpleXml(String filePath, Person person) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            writer.println("<person>");
            writer.printf("  <name>%s</name>%n", person.getName());
            writer.printf("  <age>%d</age>%n", person.getAge());
            writer.printf("  <email>%s</email>%n", person.getEmail());

            if (person.getHobbies() != null && !person.getHobbies().isEmpty()) {
                writer.println("  <hobbies>");
                for (String hobby : person.getHobbies()) {
                    writer.printf("    <hobby>%s</hobby>%n", hobby);
                }
                writer.println("  </hobbies>");
            }

            if (person.getAddress() != null) {
                writer.println("  <address>");
                writer.printf("    <street>%s</street>%n", person.getAddress().getStreet());
                writer.printf("    <city>%s</city>%n", person.getAddress().getCity());
                writer.printf("    <zipCode>%s</zipCode>%n", person.getAddress().getZipCode());
                writer.println("  </address>");
            }

            writer.println("</person>");
        }
    }

    // ===========================
    // CLASĂ PENTRU EXEMPLE
    // ===========================

    public static class Person implements Serializable {
        private static final long serialVersionUID = 1L;

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
    }

    public static class Address implements Serializable {
        private static final long serialVersionUID = 1L;

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
    }

    // ===========================
    // EXEMPLE DE UTILIZARE
    // ===========================

    public static void main(String[] args) {
        try {
            // Creăm câteva persoane pentru teste
            Person john = new Person("John Doe", 30, "john@example.com");

            List<String> hobbies = new ArrayList<>();
            hobbies.add("reading");
            hobbies.add("swimming");
            hobbies.add("hiking");
            john.setHobbies(hobbies);

            Address address = new Address("123 Main St", "New York", "10001");
            john.setAddress(address);

            List<Person> personList = new ArrayList<>();
            personList.add(john);
            personList.add(new Person("Jane Smith", 25, "jane@example.com"));
            personList.add(new Person("Mike Johnson", 35, "mike@example.com"));

            // 1. Scriere la consolă
            // writeToConsole();

            // 2. Scriere în fișier text
            // writeTextWithFileWriter("simple.txt", "Acesta este un text simplu.");

            // List<String> lines = Arrays.asList("Linia 1", "Linia 2", "Linia 3");
            // writeTextWithBufferedWriter("lines.txt", lines);
            // writeTextWithFiles("files_lines.txt", lines);
            // writeTextWithPrintWriter("persons_formatted.txt", personList);
            // writePersonsToTextFile("persons.txt", personList);

            // 3. Scriere în fișier JSON
            // writeJsonWithOrgJson("person_orgjson.json", john);
            // writeJsonWithJackson("person_jackson.json", john);
            // writeJsonWithGson("person_gson.json", john);
            // writePersonListToJson("persons_list.json", personList);

            // 4. Scriere în fișier CSV
            // writeCsvManually("persons_manual.csv", personList);
            // writeCsvWithOpenCsv("persons_opencsv.csv", personList);

            // 5. Scriere binară
            // String text = "Acesta este un text binar";
            // writeBinaryData("binary.dat", text.getBytes(StandardCharsets.UTF_8));
            // writeSerializedObject("person.ser", john);

            // 6. Operațiuni avansate
            // createDirectories("new_directory/subdirectory");
            // copyFile("source.txt", "destination.txt");
            // appendToFile("log.txt", "\nLinie adăugată la final");

            // 7. XML
            // writeSimpleXml("person.xml", john);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}