public class EnrollmentService {
    private Course[] courses;
    private int courseCount;
    private static final int MAX_COURSES = 50;

    public EnrollmentService() {
        this.courses = new Course[MAX_COURSES];
        this.courseCount = 0;
    }

    public void enrollStudentInCourse(Student student, Course course) {
        course.enrollStudent(student);
    }

    public void addCourse(Course course) {
        if (courseCount < MAX_COURSES) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println(course.getCourseName() + " has been added.");
        } else {
            System.out.println("Unable to add course: Max courses limit reached.");
        }
    }

    public void addAssignmentToCourse(Assignment assignment, Course course) {
        course.addAssignment(assignment);
    }

    public void addContentToCourse(Content content, Course course) {
        course.addContent(content);
    }

    public void addQuizToCourse(Quiz quiz, Course course) {
        course.addQuiz(quiz);
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courseCount;
    }
}
