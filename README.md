# ASK
A Java-based software engineering project🚀

Project Title: DeafLearn Online Learning Platform 

👥 Team Members: Kinda Albarghati, Abderrahmen Bchini, Sajeda Albarghati, Chams Ghorbel. 

Project Manager (Abderrahmen Bchini) 🗂️: Oversees the project, manages timelines, and ensures communication within the team.
Lead Developer (Abderrahmen Bchini)💻: Responsible for the main coding tasks and architecture of the application.
UI/UX Designer (Kinda Albarghati) 🎨: Designs the user interface and user experience, ensuring the application is user-friendly.
Backend Developer (Chams Ghorbel)🛠️: Develops the backend logic, handles data processing, and integration with any databases or services.
QA Engineer (Abderrahmen Bchini) 🔍: Tests the application, identifies bugs, and ensures the software meets quality standards.
Technical Writer (Sajeda Albraghati) 📝: Creates and maintains documentation for the project, including user manuals and technical specifications.

📋 Project Overview
This project is designed to enhance the educational experience for deaf and hard-of-hearing students. By integrating innovative features tailored to their unique needs, DeafLearn aims to create an inclusive learning environment that supports academic success. The goal is to create a software solution that addresses the daily challenges faced by deaf students in traditional educational settings. This project will utilize Java and Object-Oriented Programming (OOP) principles to ensure scalability, maintainability, and clean design.


⚙️ Project Development Steps
1. Define Functional and Non-Functional Requirements 📝
Functional Requirements (FR):
1. User Authentication:
 . Users (students, teachers, and administrators) must be able to create accounts and log in securely.
 . Password recovery options should be available.
2. Course Management:
 . Teachers can create, edit, and delete courses.
 . Students can enroll in available courses and view course materials.
3. Interactive Learning Tools:
 . Integration of sign language videos to explain concepts.
 . Text-to-speech and speech-to-text functionalities for communication.
4. Assessment and Feedback:
 . Ability for teachers to create quizzes and assignments.
 . Students can submit assignments and receive feedback.
5. Communication Features:
 . Real-time chat functionality with text and video options.
 . Discussion forums for students to interact with peers and instructors.
6. Accessibility Features:
 . Customizable interface options (e.g., font size, color contrast).
 . Support for multiple languages, most importantly sign language.
7. Progress Tracking:
 . Students can view their academic progress and grades.
 . Teachers can monitor student performance and engagement levels.
8. Resource Library:
 . A repository of educational materials (videos, articles, etc.) specifically designed for deaf and hard-of-hearing students with animated sign language avatars.

Non-Functional Requirements (NFR): 
1. Usability:
 . The user interface should be intuitive and easy to navigate for all users.
2. Performance: 
 . The platform should provide a quick and seamless experience for users, handling a large number of users at the same time without slowing down.
3. Reliability:
 . The system should ensure that every user can access the platform consistently.
 . Data backup should occur daily to prevent data loss and ensure data integrity.
 4. Scalability:
 . The architecture should support the addition of new features and an increasing number of users without requiring a complete redesign.
5. Security: 
 . User data must be encrypted both in transit and at rest.
 . To safeguard sensitive information, the system must utilize role-based access control.
6. Maintenance:
 . The codebase should follow OOP principles for modularity and ease of updates.
 . Documentation should be comprehensive to assist future developers in understanding the system.


3. Define Your Process (If Agile) ⚡
If you choose Agile, such as Scrum or Kanban, follow these steps:
Scrum Example
Roles:
Product Owner: Defines the vision and backlog.
Scrum Master: Facilitates the process.
Team Members: Develop the product.
Sprint Planning: Break the project into Sprints (1-2 week cycles) with goals.
Daily Standups: Short meetings to discuss progress and blockers.
Sprint Review & Retrospective: After each Sprint, review the work and reflect on how to improve.
🖥️ Coding and Workflow
1. Set Up the Project Structure 📁
src/: Source code
lib/: External libraries
docs/: Documentation
2. Code Development Workflow 🔄
Create a new branch for each feature or task:
git checkout -b feature-branch-name
Commit and push your changes:
git add .
git commit -m "Implemented feature X"
git push origin feature-branch-name
Open a pull request on GitHub for code review and merging.
🧪 Testing
Write unit tests for key components.
To run tests:
mvn test
or
gradle test
📦 Requirements
Java version X.X or higher.
Other dependencies or libraries (e.g., Maven, Gradle).
Build & Run Instructions 🏃‍♂️
Clone the repository:

git clone https://github.com/[username]/[repository-name].git
Navigate into the directory:

cd [repository-name]
Build the project:

Maven: mvn clean install
Gradle: gradle build
Run the project:

java -jar target/your-project-name.jar
🤝 Contribution Workflow
Create a new branch for your work:
git checkout -b your-branch-name
Commit your changes:
git add .
git commit -m "Description of changes"
Push your branch:
git push origin your-branch-name
Open a pull request for code review and merging.
📝 License
[Choose your license, e.g., MIT License]

🙌 Credits
This project was developed by [Team Name] as part of the Software Engineering course at MUST University.
