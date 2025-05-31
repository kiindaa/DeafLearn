public class Quiz {
    private String quizId;
    private String dueDate;
    private String[] questions;
    private String[] correctAnswers; // Store the correct answers for each question
    private int[] scores; // Array to store scores for each student
    private Course course; // Reference to the course this quiz belongs to

    // Constructor
    public Quiz(String quizId, String dueDate, String[] questions, String[] correctAnswers, Course course) {
        this.quizId = quizId;
        this.dueDate = dueDate;
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.scores = new int[course.getEnrolledStudents().length]; // Initialize scores array based on enrolled students count
        this.course = course;
    }

    // Getters
    public String getQuizId() {
        return quizId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String[] getQuestions() {
        return questions;
    }

    public String[] getCorrectAnswers() {
        return correctAnswers;
    }

    // Get the score for a specific student by index
    public int getScore(int studentIndex) {
        return scores[studentIndex];
    }

    // Method for a student to take the quiz and calculate their score
    public void takeQuiz(Student student, String[] studentAnswers) {
        int studentIndex = findStudentIndex(student); // Find the student index in the course
        if (studentIndex == -1) {
            System.out.println("Error: Student not enrolled in this quiz.");
            return;
        }

        if (studentAnswers.length != questions.length) {
            System.out.println("Error: Number of answers does not match number of questions.");
            return;
        }

        int totalCorrect = 0;
        // Compare student's answers with correct answers
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                totalCorrect++;
            }
        }

        // Store the student's score in the scores array
        this.scores[studentIndex] = totalCorrect;
        System.out.println(student.getUsername() + " scored: " + totalCorrect + "/" + questions.length);
    }

    // Helper method to find the student's index in the course's enrolled students array
    private int findStudentIndex(Student student) {
        Student[] students = course.getEnrolledStudents();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student)) { // Null check + proper equality
                return i;
            }
        }
        return -1; // Student not found
    }

    @Override
    public String toString() {
        return "Quiz ID: " + quizId + ", Due Date: " + dueDate;
    }
}
