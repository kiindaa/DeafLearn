public class Course {
    private String courseId;
    private String courseName;
    private Student[] enrolledStudents;
    private int enrolledCount;
    private static final int MAX_STUDENTS = 30;

    private Assignment[] assignments;
    private Quiz[] quizzes;
    private Content[] content;

    // Constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new Student[MAX_STUDENTS];
        this.enrolledCount = 0;
        this.assignments = new Assignment[10];
        this.quizzes = new Quiz[5];
        this.content = new Content[10];
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public Assignment[] getAssignments() {
        return assignments;
    }

    public Quiz[] getQuizzes() {
        return quizzes;
    }

    public Content[] getContent() {
        return content;
    }

    // Enroll a student
    public void enrollStudent(Student student) {
        if (enrolledCount < MAX_STUDENTS) {
            enrolledStudents[enrolledCount++] = student;
            System.out.println(student.getUsername() + " has been enrolled in " + courseName);
        } else {
            System.out.println("Course is full.");
        }
    }

    // Add an assignment
    public void addAssignment(Assignment assignment) {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] == null) {
                assignments[i] = assignment;
                break;
            }
        }
    }

    // Add a quiz
    public void addQuiz(Quiz quiz) {
        for (int i = 0; i < quizzes.length; i++) {
            if (quizzes[i] == null) {
                quizzes[i] = quiz;
                break;
            }
        }
    }

    // Add content
    public void addContent(Content contentItem) {
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                content[i] = contentItem;
                break;
            }
        }
    }
}
