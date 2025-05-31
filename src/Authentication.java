public class Authentication {
    private Student[] students;
    private Professor[] professors;
    private int studentCount;
    private int professorCount;
    private static final int MAX_USERS = 100;

    public Authentication() {
        this.students = new Student[MAX_USERS];
        this.professors = new Professor[MAX_USERS];
        this.studentCount = 0;
        this.professorCount = 0;
    }

    // Register a Student
    public void registerStudent(Student student) {
        if (studentCount < MAX_USERS) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student has been registered successfully!!");
        } else {
            System.out.println("Registration failed: Maximum student limit reached.");
        }
    }

    // Register a Professor
    public void registerProfessor(Professor professor) {
        if (professorCount < MAX_USERS) {
            professors[professorCount] = professor;
            professorCount++;
            System.out.println("Professor registered successfully!!");
        } else {
            System.out.println("Registration failed: Maximum professor limit reached.");
        }
    }

    // Student Login
    public Student loginStudent(String email, String password) {
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            if (student.getEmail().equals(email) && student.validatePassword(password)) {
                System.out.println("Student login successful for: " + student.getUsername());
                return student;
            }
        }
        System.out.println("Invalid student credentials.");
        return null;
    }

    // Professor Login
    public Professor loginProfessor(String email, String password) {
        for (int i = 0; i < professorCount; i++) {
            Professor professor = professors[i];
            if (professor.getEmail().equals(email) && professor.validatePassword(password)) {
                System.out.println("Professor login successful for: " + professor.getUsername());
                return professor;
            }
        }
        System.out.println("Invalid professor credentials.");
        return null;
    }
}
