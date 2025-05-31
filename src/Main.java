public class DeafEase {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student("john_doe", "john@example.com", "password123", "S001");
        Student student2 = new Student("jane_smith", "jane@example.com", "password456", "S002");

        // Create a professor
        Professor professor1 = new Professor("prof_smith", "prof.smith@example.com", "profpass123", "Professor");

        // Create a course
        Course course1 = new Course("CS101", "Introduction to Computer Science");

        // Create an EnrollmentService and add course
        EnrollmentService enrollmentService = new EnrollmentService();
        enrollmentService.addCourse(course1);

        // Enroll students
        enrollmentService.enrollStudentInCourse(student1, course1);
        enrollmentService.enrollStudentInCourse(student2, course1);

        // Define quiz
        String[] quizQuestions = {
            "What is Java?",
            "What is the purpose of a constructor?",
            "Explain the difference between method overloading and overriding."
        };
        String[] correctAnswers = {
            "A programming language",
            "To initialize objects",
            "Overloading is when you have methods with the same name but different parameters, overriding is when you redefine a method."
        };

        // Professor creates quiz
        professor1.createQuiz("Q001", course1, "2024-12-20", quizQuestions, correctAnswers);

        // Simulate students taking the quiz
        String[] student1Answers = {
            "A programming language",
            "To initialize objects",
            "Overloading is when you have methods with the same name but different parameters."
        };

        String[] student2Answers = {
            "A Language used for web development",
            "For creating a new class",
            "Overloading is for changing method behavior."
        };

        // Students take quiz
        Quiz quiz1 = course1.getQuizzes()[0]; // Assuming it's the first quiz
        quiz1.takeQuiz(student1, student1Answers);
        quiz1.takeQuiz(student2, student2Answers);

        // Display scores
        System.out.println("Score for " + student1.getUsername() + ": " + quiz1.getScore(0) + "/" + quiz1.getQuestions().length);
        System.out.println("Score for " + student2.getUsername() + ": " + quiz1.getScore(1) + "/" + quiz1.getQuestions().length);
    }
}
