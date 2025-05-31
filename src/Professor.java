public class Professor extends User {
    private String professorId;

    // Constructor
    public Professor(String username, String email, String password, String role, String professorId) {
        super(username, email, password, role);
        this.professorId = professorId;
    }

    // Getter for professorId
    public String getProfessorId() {
        return professorId;
    }

    // Password validation method
    public boolean validatePassword(String password) {
        return this.getPassword().equals(password);
    }

    // Method to create a quiz
    public void createQuiz(String quizId, Course course, String dueDate, String[] questions, String[] correctAnswers) {
        // Create a new quiz with the provided parameters
        Quiz quiz = new Quiz(quizId, dueDate, questions, correctAnswers, course);
        // Add the quiz to the course
        course.addQuiz(quiz);
        // Notify that the quiz has been successfully created
        System.out.println("Quiz " + quizId + " has been created for the course " + course.getCourseName() + " with due date: " + dueDate);
    }
}
