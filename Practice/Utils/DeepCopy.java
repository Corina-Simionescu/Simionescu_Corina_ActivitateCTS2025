// 1. TIPURI PRIMITIVE
// Tipurile primitive sunt copiate direct prin valoare, nu necesită deep copy special
public class PrimitiveExample implements Cloneable {
    private int number;
    private double salary;
    private boolean active;

    @Override
    public PrimitiveExample clone() throws CloneNotSupportedException {
        return (PrimitiveExample) super.clone();
        // Pentru tipurile primitive, super.clone() este suficient
        // Ele sunt copiate automat prin valoare
    }
}

// 2. OBIECTE IMUTABILE
// Obiectele imutabile (String, Integer, LocalDate) nu trebuie clonate special
public class ImmutableExample implements Cloneable {
    private String name;
    private Integer count;
    private java.time.LocalDate date;

    @Override
    public ImmutableExample clone() throws CloneNotSupportedException {
        return (ImmutableExample) super.clone();
        // Pentru obiecte imutabile, super.clone() este suficient
        // Fiind imutabile, nu poate fi modificată starea lor după creare
    }
}

// 3. OBIECTE MUTABILE
public class MutableExample implements Cloneable {
    private java.util.Date date;

    @Override
    public MutableExample clone() throws CloneNotSupportedException {
        MutableExample cloned = (MutableExample) super.clone();

        // Deep copy pentru Date (obiect mutabil)
        if (this.date != null) {
            cloned.date = (java.util.Date) this.date.clone();
        }

        return cloned;
    }
}

// 4. ARRAY-URI
public class ArrayExample implements Cloneable {
    private int[] numbers;
    private String[] names;

    @Override
    public ArrayExample clone() throws CloneNotSupportedException {
        ArrayExample cloned = (ArrayExample) super.clone();

        // Deep copy pentru array de primitive (int[])
        if (this.numbers != null) {
            cloned.numbers = this.numbers.clone();
        }

        // Deep copy pentru array de String
        if (this.names != null) {
            cloned.names = this.names.clone();
        }

        return cloned;
    }
}

// 5. COLECȚII
import java.util .*;

public class CollectionExample implements Cloneable {
    private List<String> stringList;
    private Map<String, Integer> stringIntMap;
    private Set<Integer> intSet;

    @Override
    public CollectionExample clone() throws CloneNotSupportedException {
        CollectionExample cloned = (CollectionExample) super.clone();

        // Deep copy pentru ArrayList
        if (this.stringList != null) {
            cloned.stringList = new ArrayList<>(this.stringList);
        }

        // Deep copy pentru HashMap
        if (this.stringIntMap != null) {
            cloned.stringIntMap = new HashMap<>(this.stringIntMap);
        }

        // Deep copy pentru HashSet
        if (this.intSet != null) {
            cloned.intSet = new HashSet<>(this.intSet);
        }

        return cloned;
    }
}

// 6. OBIECTE PERSONALIZATE
public class CustomObjectExample implements Cloneable {
    private Person person;
    private List<Person> people;

    @Override
    public CustomObjectExample clone() throws CloneNotSupportedException {
        CustomObjectExample cloned = (CustomObjectExample) super.clone();

        // Deep copy pentru un singur obiect personalizat
        if (this.person != null) {
            cloned.person = this.person.clone();
        }

        // Deep copy pentru o listă de obiecte personalizate
        if (this.people != null) {
            cloned.people = new ArrayList<>(this.people.size());
            for (Person p : this.people) {
                cloned.people.add(p.clone());
            }
        }

        return cloned;
    }

    // Clasa internă Person
    public static class Person implements Cloneable {
        private String name;
        private int age;
        private Address address;

        @Override
        public Person clone() throws CloneNotSupportedException {
            Person cloned = (Person) super.clone();

            // Trebuie să facem deep copy pentru obiectele personalizate conținute
            if (this.address != null) {
                cloned.address = this.address.clone();
            }

            return cloned;
        }
    }

    // Clasa internă Address
    public static class Address implements Cloneable {
        private String street;
        private String city;

        @Override
        public Address clone() throws CloneNotSupportedException {
            // Pentru Address, super.clone() este suficient dacă toate câmpurile sunt primitive sau imutabile
            return (Address) super.clone();
        }
    }
}

// 7. REFERINȚE CIRCULARE (folosind serializare)
import java.io .*;

public class CircularReferenceExample implements Serializable {
    private Node root;

    // Deep copy folosind serializare (util pentru referințe circulare)
    public CircularReferenceExample deepCopy() {
        try {
            // Scriem obiectul într-un ByteArrayOutputStream
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            // Citim obiectul din ByteArrayInputStream
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (CircularReferenceExample) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Clonarea prin serializare a eșuat", e);
        }
    }

    // Clasa internă Node cu referință circulară
    static class Node implements Serializable {
        private String data;
        private Node next; // poate referi înapoi la alte noduri creând un ciclu
    }
}

// 8. ARRAY MULTIDIMENSIONAL
public class MultiDimensionalArrayExample implements Cloneable {
    private int[][] matrix;
    private String[][] data;

    @Override
    public MultiDimensionalArrayExample clone() throws CloneNotSupportedException {
        MultiDimensionalArrayExample cloned = (MultiDimensionalArrayExample) super.clone();

        // Deep copy pentru array bidimensional de primitive (int[][])
        if (this.matrix != null) {
            cloned.matrix = new int[this.matrix.length][];
            for (int i = 0; i < this.matrix.length; i++) {
                if (this.matrix[i] != null) {
                    cloned.matrix[i] = this.matrix[i].clone();
                }
            }
        }

        // Deep copy pentru array bidimensional de String
        if (this.data != null) {
            cloned.data = new String[this.data.length][];
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] != null) {
                    cloned.data[i] = this.data[i].clone();
                }
            }
        }

        return cloned;
    }
}

// 9. LISTE DE LISTE
public class NestedListExample implements Cloneable {
    private List<List<String>> nestedList;

    @Override
    public NestedListExample clone() throws CloneNotSupportedException {
        NestedListExample cloned = (NestedListExample) super.clone();

        // Deep copy pentru o listă de liste
        if (this.nestedList != null) {
            cloned.nestedList = new ArrayList<>(this.nestedList.size());
            for (List<String> innerList : this.nestedList) {
                if (innerList != null) {
                    cloned.nestedList.add(new ArrayList<>(innerList));
                } else {
                    cloned.nestedList.add(null);
                }
            }
        }

        return cloned;
    }
}

// 10. ENUM ȘI CLASE ANONIME
public class EnumAndAnonymousExample implements Cloneable {
    private Color color;
    private Runnable task;

    @Override
    public EnumAndAnonymousExample clone() throws CloneNotSupportedException {
        EnumAndAnonymousExample cloned = (EnumAndAnonymousExample) super.clone();

        // Enum-urile sunt imutabile, deci nu necesită clonare specială
        // cloned.color = this.color; // Se face automat de super.clone()

        // Clasele anonime nu sunt clonabile - trebuie reimplementate sau transferate
        // Poți să le tratezi ca imutabile dacă nu au stare care se modifică
        // cloned.task = this.task; // Se face automat de super.clone()

        return cloned;
    }

    enum Color {RED, GREEN, BLUE}
}