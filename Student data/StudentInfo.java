import java.util.Scanner;
class StudentInfo {
    private String[] studentNames;
    private int[] studentMarks;
    private int currentIndex;

 
    public StudentInfo(int numberOfStudents) {
        studentNames = new String[numberOfStudents];
        studentMarks = new int[numberOfStudents];
        currentIndex = 0;
    }

  
    public void inputStudentInfo(Scanner scanner) {
        while (currentIndex < studentNames.length) {
            System.out.print("Enter student name for student " + (currentIndex + 1) + ": ");
            studentNames[currentIndex] = scanner.next();

            System.out.print("Enter marks for student " + (currentIndex + 1) + ": ");
            studentMarks[currentIndex] = scanner.nextInt();

            currentIndex++;
        }
    }


    public void searchAndDisplay(String searchName) {
        int index = linearSearch(studentNames, searchName);

        if (index != -1) {
            System.out.println("Marks for " + searchName + ": " + studentMarks[index]);
        } else {
            System.out.println("Student not found");
        }
    }


    private static int linearSearch(String[] array, String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(key)) {
                return i; 
            }
        }
        return -1; 
    }
}