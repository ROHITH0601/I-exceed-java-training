class sample {
    String name, dept;
    int age;

    sample(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public void displayStudent() {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("Department=" + dept);
    }
}

class teacher extends sample {
    teacher(String name, int age, String dept) {
        super(name, age, dept);  // Calls parent class (sample) constructor
        System.out.println("Name of the Teacher " + name);
    }
}

class demoinher {
    public static void main(String asd[]) {
        teacher obj = new teacher("Rohith", 32, "CSE");
    }
}
