public class Userwithfields {
    public static void main(String[] args) {
        Userwithfields users = new Userwithfields();
        users.Init();
        users.PrintInfo();
    }
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    private Userwithfields[] users;
    public Userwithfields( int id, int age, String name, String surname,double weight, double height){
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    public Userwithfields() {
    }

    public int getAge () {
        return age;
    }

    public double getWeight () {
        return weight;
    }

    public double getHeight () {
        return height;
    }


    public void Init () {
        users = new Userwithfields[]{
                new Userwithfields(1, 32, "John", "Doe", 85.5, 182.0),
                new Userwithfields(2, 24, "Emily", "Smith", 62.0, 168.0),
                new Userwithfields(3, 45, "David", "Johnson", 91.0, 188.0),
                new Userwithfields(4, 27, "Olivia", "Brown", 59.5, 175.0),
                new Userwithfields(5, 36, "Tom", "Jones", 83.0, 185.0),
                new Userwithfields(6, 30, "Sophia", "Clark", 75.0, 170.0),
                new Userwithfields(7, 50, "Emma", "Davis", 68.0, 175.0),
                new Userwithfields(8, 55, "Ethan", "Williams", 60.0, 151.0),
                new Userwithfields(9, 22, "Ava", "Garcia", 95.0, 190.0),
                new Userwithfields(10, 65, "Daniel", "Brown", 68.0, 142.0)

        };
    }

    public void PrintInfo () {
        int age = 0;
        double weight = 0;
        double height = 0;

        for (Userwithfields user : users) {
            age += user.age;
            weight += user.weight;
            height += user.height;
        }

        System.out.println("The age of ten users is: " + age);
        System.out.println("The weight of ten users is: " + weight);
        System.out.println("The height of ten users is: " + height);
    }
}

