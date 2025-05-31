public class Student extends User {
    private String studentID;

    // Constructor
    public Student(String username, String email, String password, String studentID) {
        super(username, email, password, "Student");  // Pass Role as "Student"
        this.studentID = studentID;
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    // Password validation method
    public boolean validatePassword(String inputPassword) {
        return getPassword().equals(inputPassword);
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Role: " + getRole());
    }

    // Method for the student to take a quiz
    public void takeQuiz(Quiz quiz, String[] answers) {
        // Ensure that the number of answers matches the number of questions in the quiz
        if (answers.length != quiz.getQuestions().length) {
            System.out.println("Error: Number of answers does not match the number of questions.");
            return;
        }

        // Assuming Quiz class has a method to accept answers from students
        quiz.takeQuiz(this, answers);
    }
}
