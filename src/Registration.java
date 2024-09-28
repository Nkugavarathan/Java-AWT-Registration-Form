import java.awt.*;
import  java.awt.event.*;
public class Registration extends Frame{
    Label lTitle,lName,lFatherName,lAge,lGender,lCourse,lHobbies,lAddress;
    TextField textName,textFatherName,textAge;

    Checkbox checkMale,checkFemale,hobby1,hobby2,hobby3,hobby4;
    CheckboxGroup cbg; //for radio btn
    Choice course;
    TextArea Address;

    Button btnSave,btnClear;

    Image backgroundImage;
    public Registration() {
        super("User Registration Form ");
        setSize(600, 600);
        setLayout(null);
        setBackground(Color.GRAY);
        setVisible(true);



        Font titleFont = new Font("Arial", Font.BOLD, 25);
        Font labelFont = new Font("Arial", Font.PLAIN, 18);

        lTitle = new Label("Welcome to Registration Form");
        lTitle.setBounds(60, 50, 400, 40);
        lTitle.setFont(titleFont);
        lTitle.setForeground(Color.YELLOW); // set color
        add(lTitle);

        lName = new Label("Name");
        lName.setBounds(20, 100, 100, 20);
        lName.setForeground(Color.WHITE);
        lName.setFont(labelFont);
        add(lName);

        textName = new TextField();
        textName.setBounds(160, 100, 300, 20);
        add(textName);

        lFatherName = new Label("Father Name");
        lFatherName.setBounds(20, 140, 120, 20);
        lFatherName.setForeground(Color.WHITE);
        lFatherName.setFont(labelFont);
        add(lFatherName);

        textFatherName = new TextField();
        textFatherName.setBounds(160, 140, 300, 20);
        add(textFatherName);

        lAge = new Label("Age");
        lAge.setBounds(20, 180, 100, 20);
        lAge.setForeground(Color.WHITE);
        lAge.setFont(labelFont);
        add(lAge);

        textAge = new TextField();
        textAge.setBounds(160, 180, 300, 20);
        add(textAge);

        lGender = new Label("Gender");
        lGender.setBounds(20, 220, 100, 20);
        lGender.setForeground(Color.WHITE);
        lGender.setFont(labelFont);
        add(lGender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male", cbg, true);
        checkMale.setBounds(160, 220, 100, 30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.WHITE);
        add(checkMale);

        checkFemale = new Checkbox("Female", cbg, true);
        checkFemale.setBounds(260, 220, 100, 30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.WHITE);
        add(checkFemale);

        lCourse = new Label("Course");
        lCourse.setBounds(20, 260, 100, 20);
        lCourse.setFont(labelFont);
        lCourse.setForeground(Color.WHITE);
        add(lCourse);


        course = new Choice();
        course.setFont(labelFont);
        course.setBounds(160, 260, 150, 100);
        course.add("C");
        course.add("C++");
        course.add("C#");
        course.add("Java");
        course.add("Python");
        add(course);

        lHobbies = new Label("Hobbies");
        lHobbies.setBounds(20, 300, 100, 25);
        lHobbies.setForeground(Color.WHITE);
        lHobbies.setFont(labelFont);
        add(lHobbies);

        hobby1 = new Checkbox("Drawing");
        hobby1.setBounds(160, 300, 100, 25);
        hobby1.setFont(labelFont);
        hobby1.setForeground(Color.WHITE);
        add(hobby1);

        hobby2 = new Checkbox("Singing");
        hobby2.setBounds(260, 300, 100, 25);
        hobby2.setFont(labelFont);
        hobby2.setForeground(Color.WHITE);
        add(hobby2);

        hobby3 = new Checkbox("Dancing");
        hobby3.setBounds(360, 300, 100, 25);
        hobby3.setFont(labelFont);
        hobby3.setForeground(Color.WHITE);
        add(hobby3);

        hobby4 = new Checkbox("Acting");
        hobby4.setBounds(460, 300, 100, 25);
        hobby4.setFont(labelFont);
        hobby4.setForeground(Color.WHITE);
        add(hobby4);

        lAddress = new Label("Address");
        lAddress.setBounds(20, 340, 100, 20);
        lAddress.setForeground(Color.WHITE);
        lAddress.setFont(labelFont);
        add(lAddress);

        Address = new TextArea();
        Address.setBounds(160, 340, 300, 100);
        add(Address);

        // we can define color
        Color btnsavebackground = new Color(226, 13, 13);

        btnSave = new Button("Save");
        btnSave.setBounds(160, 480, 100, 30);
        btnSave.setFont(labelFont);
        btnSave.setForeground(Color.WHITE);

        btnSave.setBackground(btnsavebackground);

        add(btnSave);

        Color btnclearbackground = new Color(0x13CB13);
        btnClear = new Button("Clear All");
        btnClear.setBounds(300, 480, 100, 30);
        btnClear.setFont(labelFont);
        btnClear.setForeground(Color.WHITE);
        btnClear.setBackground(btnclearbackground);
        add(btnClear);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }

}
class App{
    public static void main(String[] args) {
        new Registration();
    }
}