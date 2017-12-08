package experiment06_1;


/*
    Introduction to OOP with Java 3rd Ed, McGraw-Hill

    Wu/Otani

    Chapter 13 Sample Development: Compute Grades for Undergraduate
                                    and Graduate Students

    File: ComputeGrades.java

*/

import java.io.*;
import java.util.*;
import javax.swing.*;


//-----------------------  STEP 4 -------------------------//

/**
 *   Class ComputeGrades
 *
 *   The top level object for managing all other objects in the program
 *
 */
class ComputeGrades extends MainWindow {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * The default size for the roster array
     */
    private static final int DEFAULT_SIZE = 25;

    /**
     * The type indicator for undergraduate students
     */
    private static final String UNDER_GRAD = "U";

    /**
     * The type indicator for graduate students
     */
    private static final String GRAD = "G";

    /**
     * The string value to indicate the end of file
     */
    private static final String END_OF_FILE_STR = "END";

    /**
     * An outputbox for displaying the result
     */
    private OutputBox   outputBox;

    /**
     * An array of Student for maintaining student info
     */
    private Student[]   roster;

    /**
     * The number student information loaded from a file
     */
    private int         studentCount;

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public ComputeGrades() {
        this (DEFAULT_SIZE);
    }

    /**
     * Constructs this object with the designated size
     * for an array.
     *
     * @param arraySize the size of the roster array
     */
    public ComputeGrades(int arraySize) {
        super();   // an explicit call to the supercalss constructor

        outputBox   = new OutputBox(this);

        roster      = new Student[arraySize];

        studentCount = 0;
    }

//-----------------------------------
// Main
//-----------------------------------
    public static void main(String[] args) {
      ComputeGrades gradeComputer = new ComputeGrades();
      gradeComputer.processData();
    }

//-------------------------------------------------
//      Public Methods:
//
//          void    processData   (           )
//
//------------------------------------------------

    /**
     * Loads the data from a file, computes the grades,
     * and display the result.
     *
     */
    public void processData() {
         setVisible(true);
         outputBox.setVisible(true);

         boolean success = readData();

         if (success) {
            computeGrade();
            printResult();
         } else {
            outputBox.println("File Input Error");
         }
    }

//-------------------------------------------------
//      Private Methods:
//
//        boolean     buildRoster         (  String                   )
//        void        computeGrade        (                           )

//        void        createStudent       (  String                   )
//        void        newStudentWithData  (  String, StringTokenizer  )
//
//        void        printResult         (                           )
//        boolean     readData            (                           )
//
//------------------------------------------------

    private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Builds the roster array.
     *
     * @param filename the name of the file to load
     *                 the student info
     *
     * @return true if the operation is successful;
                    false otherwise.
     *
     */
    private boolean buildRoster(String filename) {
        String  inputLine;
        Student student;

        File             inFile;
        FileReader       fileReader;
        BufferedReader   bufReader;

        boolean status   = true;
        boolean done     = false;

        try {
           inFile = new File(filename);
           fileReader = new FileReader(inFile);
           bufReader = new BufferedReader(fileReader);

           while ( !done ) {

              inputLine = bufReader.readLine(); //read one line

              if (inputLine.equalsIgnoreCase(END_OF_FILE_STR)) {
                 done = true;
              }
              else {
                 student = createStudent(inputLine);

                 if (student != null) {
                    roster[studentCount] = student;
                    studentCount++;
                 }
              }
           } // while

           bufReader.close();
        }
        catch (IOException e) {
            status = false;
        }

        return status;
    }

    /**
     * Scans through the roster array and computes
     * the course grades.
     *
     */
    private void computeGrade()
    {
        for (int i = 0; i < studentCount; i++) {
           roster[i].computeCourseGrade();
        }
    }


    /**
     * Creates a single student of either the Undergraduate
     * or Graduate class from a single line of input text.
     *
     * @param line  one line of text that contains the whole
     *              information for one student
     *
     * @return an Undergraduate or Graduate object created from the input line;
     *         a null is returned if there's an error in input line
     */
    private Student createStudent(String line) {
        Student          student;
        StringTokenizer  parser = new StringTokenizer(line);
        String           type;

        try {
           type = parser.nextToken();

           if (type.equals(UNDER_GRAD) || type.equals(GRAD)) {

              student = newStudentWithData(type, parser);

           } else {

              student = null;
           }
        } catch (NoSuchElementException e) { //no token
           student = null;
        }

        return student;
    }


    /**
     * Creates a new student of the specified type (G or U) by
     * processing the data provided by the StringTokenizer
     *
     * @param type   it indicates the type of the student (G or U)
     * @param parser the StringTokenizer that provides tokens from
     *               a single line of input.
     *
     * @return an Undergraduate or Graduate object created from the input line;
     *         a null is returned if there's an error in input line
     */
    private Student newStudentWithData(String type, StringTokenizer parser) {
        Student student;

        try {
            if (type.equals(UNDER_GRAD)) {

               student = new UndergraduateStudent();

            } else {

               student = new GraduateStudent();
            }

            //set the student name
            String  firstName   = parser.nextToken();
            String  lastName    = parser.nextToken();

            student.setName(firstName + " " + lastName);

            //set the student test scores
            for (int testNum = 1; testNum <= Student.NUM_OF_TESTS; testNum++) {
               student.setTestScore( testNum, Integer.parseInt(parser.nextToken()));
            }
        } catch (Exception e) { //either parser.nextToken() or
                                //Integer.parseInt(...)  thrown exception
            student = null;
        }

        return student;

    }


    /**
     * Displays the result in an outputBox.
     *
     */
    private void printResult() {
        for (int i = 0; i < studentCount; i++) {

            //print one student
            outputBox.print(roster[i].getName());

            for (int testNum = 1; testNum <= Student.NUM_OF_TESTS; testNum++) {

                outputBox.print("\t" + roster[i].getTestScore(testNum));
            }

            outputBox.println("\t" + roster[i].getCourseGrade());
        }
    }

    /**
     * Opens a textfile, read in data, and
     * construct the roster array.
     *
     * @return true if the operation is successful
     *
     */
    private boolean readData() {
        //get file to open
        JFileChooser fileChooser = new JFileChooser(".");
                                        //start the listing from the current directory

        int returnVal = 0;//fileChooser.showOpenDialog(this);

        boolean result = false;

        if(returnVal == JFileChooser.APPROVE_OPTION) {
           String filename = fileChooser.getSelectedFile().getAbsolutePath();

            if (filename != null) {

                result = buildRoster(filename);
            }
        }

        return result;
    }
}
