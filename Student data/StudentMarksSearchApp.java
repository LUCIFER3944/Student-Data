import java.util.Scanner;


public class StudentMarksSearchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        StudentInfo studentInfo = new StudentInfo(5);


        studentInfo.inputStudentInfo(scanner);

      
        System.out.print("Enter student name to search: ");
        String searchName = scanner.next();

     
        studentInfo.searchAndDisplay(searchName);

    
        scanner.close();
    }
}