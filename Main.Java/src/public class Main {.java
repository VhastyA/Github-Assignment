public class Main {
    public class StudentInfo {
    Scanner input = new Scanner(System.in);

    //1. Collect student information
    System.out.print("Enter student name: ");
    String fullname = input.nextLine();
    
    System.out.print("Enter student Index number: ");
    String indexNumber = input.nextLine();

    System.out.print("Enter student age: ");
    byte age = Byte.parseByte(input.nextLine());

    System.out.print("Enter student gender (M/F): ");
    char gender = input.nextLine().charAt(0);

    System.out.print("Enter student Department: ");
    String Department = input.nextLine();

    System.out.print("Enter student level: ");
    Short level = Short.parseShort(input.nextLine());

    System.out.print("Enter student GPA: ");
    float GPA = Float.parseFloat(input.nextLine());

    //2. Determining Adult status
    boolean isAdult = (age >= 18);
    String adultStatus = isAdult ? "Adult" : "Not Adult";

     //3. determining academic classification
    String academicClass;
    if (GPA >= 3.5f) {
        academicClass = "First Class";
    } else if (GPA >= 3.0) {
        academicClass = "Second Class Upper";
    } else if (GPA >= 2.5) {
        academicClass = "Second Class Lower";
    } else if (GPA >= 2.0) {
        academicClass = "Third Class";
    } else {
        academicClass = "Pass";
    }
    

    //4. Display Formatted Student Profile
    System.out.println();
    System.out.println("Student Profile");
    System.out.println("Name: " + fullname);
    System.out.println("Index Number: " + indexNumber);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    System.out.println("Department: " + Department);
    System.out.println("Level: " + level);
    System.out.println("GPA: " + GPA);
    System.out.println("Adult Status: " + adultStatus);
    System.out.println("Academic Classification: " + academicClass);
    System.out.println("***********");

    input.close();

}

    public static void main(String[] args) {
        StudentInfo student = new StudentInfo();
    }
}
