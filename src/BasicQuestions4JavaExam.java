import java.util.*;
public class BasicQuestions4JavaExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        welcome1();
        switch09(scan);
    }
    public static void setupAndRunQuiz() {
        Quiz quiz = new Quiz();

        // Create questions
        Question q1 = new Question(
                "Q1/34: Which of the following is a primitive type in Java?",
                Arrays.asList("String", "int", "ArrayList", "Scanner", "Boolean"),
                1
        );

        Question q2 = new Question(
                "Q2/34: Which escape sequence is used to insert a new line in a string?",
                Arrays.asList("\\t", "\\n", "\\r", "\\b", "\\a"),
                1
        );

        Question q3 = new Question(
                "Q3/34: What is the result of the expression 5 + 3 * 2 in Java?",
                Arrays.asList("16", "11", "10", "8", "15"),
                1
        );
        Question q4 = new Question(
                "Q4/34: Which keyword is used to define a method in Java, if the method does not return any value?",
                Arrays.asList("class", "method", "void", "return", "function"),
                2
        );
        Question q5 = new Question(
                "Q5/34: What is a parameter in Java?",
                Arrays.asList("A value returned by a method", "A variable passed to a method", "A class attribute", "A method name", "A package"),
                1
        );
        Question q6 = new Question(
                "Q6/34: How are parameters passed to methods in Java?",
                Arrays.asList("By reference", "By value", "By pointer", "By address", "By link"),
                1
        );
        Question q7 = new Question(
                "Q7/34: Which statement about methods with multiple parameters in Java is true?",
                Arrays.asList("Methods cannot have more than one parameter", "Parameters must be of the same type", "Order of parameters matters", "All parameters are passed by reference", "Parameters are optional"),
                2
        );
        Question q8 = new Question(
                "Q8/34: What is the purpose of a return value in a method?",
                Arrays.asList("To print output", "To return control to the caller", "To store temporary data", "To provide a result to the caller", "To create a new variable"),
                3
        );
        Question q9 = new Question(
                "Q9/34: What does method overloading in Java allow?",
                Arrays.asList("Defining multiple methods with the same name but different parameters", "Defining methods with the same name and parameters", "Defining multiple constructors", "Defining static methods", "Defining abstract methods"),
                0
        );
        Question q10 = new Question(
                "Q10/34: What is the meaning of the static keyword in Java?",
                Arrays.asList("It creates an instance variable", "It belongs to the class rather than any object", "It defines an abstract method", "It allows method overriding", "It makes a variable final"),
                1
        );
        Question q11 = new Question(
                "Q11/34: Which type of loop is best suited for iterating a known number of times?",
                Arrays.asList("while", "do-while", "for", "foreach", "switch"),
                2
        );
        Question q12 = new Question(
                "Q12/34: Which loop evaluates its condition before executing the loop body?",
                Arrays.asList("for", "while", "do-while", "foreach", "if"),
                1
        );
        Question q13 = new Question(
                "Q13/34: Which loop evaluates its condition after executing the loop body at least once?",
                Arrays.asList("for", "while", "do-while", "foreach", "if"),
                2
        );
        Question q14 = new Question(
                "Q14/34: Which loop is specifically used to iterate over arrays or collections?",
                Arrays.asList("for", "while", "do-while", "foreach", "switch"),
                3
        );
        Question q15 = new Question(
                "Q15/34: What problem does the fencepost loop solve?",
                Arrays.asList("Off-by-one errors", "Infinite loops", "Unreachable code", "Memory leaks", "Null pointer exceptions"),
                0
        );
        Question q16 = new Question(
                "Q16/34: What is the purpose of a sentinel loop?",
                Arrays.asList("To iterate a fixed number of times", "To detect off-by-one errors", "To execute at least once", "To repeat until a special value is encountered", "To iterate over collections"),
                3
        );
        Question q17 = new Question(
                "Q17/34: What is a loop table used for?",
                Arrays.asList("To initialize arrays", "To document variable changes during each loop iteration", "To implement nested loops", "To prevent infinite loops", "To manage memory allocation"),
                1
        );
        Question q18 = new Question(
                "Q18/34: What is Boolean Zen in Java?",
                Arrays.asList("Using simple boolean expressions", "Avoiding boolean variables", "Using complex logical operators", "Relying on bitwise operations", "Ignoring boolean values"),
                0
        );

        Question q19 = new Question(
                "Q19/34: Which class is commonly used for reading text files in Java?",
                Arrays.asList("FileReader", "FileInputStream", "Scanner", "BufferedReader", "File"),
                2
        );
        Question q20 = new Question(
                "Q20/34: What is the purpose of the Scanner object in Java?",
                Arrays.asList("To read input from various sources", "To write output to a file", "To manage collections", "To create graphics", "To handle exceptions"),
                0
        );
        Question q21 = new Question(
                "Q21/34: What is a token in the context of reading input?",
                Arrays.asList("A single line of text", "A sequence of characters separated by delimiters", "An error message", "A method name", "A file reference"),
                1
        );
        Question q22 = new Question(
                "Q22/34: What is the purpose of the PrintStream class?",
                Arrays.asList("To read data from files", "To write formatted data to an output stream", "To manage network connections", "To handle graphics", "To parse XML"),
                1
        );
        Question q23 = new Question(
                "Q23/34: What is an exception in Java?",
                Arrays.asList("A compile-time error", "A special variable type", "An event that disrupts program execution", "A keyword for defining classes", "A loop control statement"),
                2
        );
        Question q24 = new Question(
                "Q24/34: What is the relationship between a class and an object in Java?",
                Arrays.asList("A class is an instance of an object", "An object is a blueprint for a class", "A class is a blueprint for objects", "A class and an object are the same", "An object is a method"),
                2
        );
        Question q25 = new Question(
                "Q25/34: In object-oriented programming, what do state and behavior refer to?",
                Arrays.asList("State refers to methods, behavior refers to variables", "State refers to variables, behavior refers to methods", "State and behavior are the same", "State refers to classes, behavior refers to objects", "State refers to constructors, behavior refers to methods"),
                1
        );
        Question q26 = new Question(
                "Q26/34: What does the 'this' keyword refer to in Java?",
                Arrays.asList("The class itself", "The current object", "The superclass", "A static variable", "A method"),
                1
        );
        // Inheritance
        Question q27 = new Question(
                "Q27/34: What does inheritance in Java allow?",
                Arrays.asList("Defining methods with the same name", "Sharing code between classes", "Creating private variables", "Overloading methods", "Handling exceptions"),
                1
        );
        // Superclass/Subclass
        Question q28 = new Question(
                "Q28/34: What is the relationship between a superclass and a subclass?",
                Arrays.asList("A subclass extends a superclass", "A superclass extends a subclass", "A subclass implements a superclass", "A superclass overrides a subclass", "A superclass is private to a subclass"),
                0
        );
        // @Override Annotation
        Question q29 = new Question(
                "Q29/34: What is the purpose of the @Override annotation?",
                Arrays.asList("To mark a method as deprecated", "To override a superclass method", "To create a new class", "To handle exceptions", "To define an interface"),
                1
        );
        // ArrayList
        Question q30 = new Question(
                "Q30/34: What is the main advantage of ArrayList over an array in Java?",
                Arrays.asList("Arrays have variable size", "ArrayList is not type-safe", "ArrayList cannot store primitives", "ArrayList automatically resizes", "Arrays are more efficient"),
                3
        );
        // ArrayList vs. Array
        Question q31 = new Question(
                "Q31/34: What is a key difference between ArrayList and an array in Java?",
                Arrays.asList("ArrayList has a fixed size", "Arrays are resizable", "ArrayList can store primitive types", "Arrays can store objects", "ArrayList is not iterable"),
                2
        );
        // Wrapper
        Question q32 = new Question(
                "Q32/34: What is the purpose of wrapper classes in Java?",
                Arrays.asList("To wrap primitive types in objects", "To provide additional functionality to arrays", "To handle exceptions", "To define custom exceptions", "To define custom comparators"),
                0
        );
        // Collection.sort
        Question q33 = new Question(
                "Q33/34: What does the Collection.sort() method do in Java?",
                Arrays.asList("Sorts elements in descending order", "Sorts elements in ascending order", "Randomly shuffles elements", "Converts elements to strings", "Removes duplicates from the collection"),
                1
        );
        // Comparable/compareTo
        Question q34 = new Question(
                "Q34/34: What is the purpose of the Comparable interface in Java?",
                Arrays.asList("To define custom exceptions", "To handle exceptions", "To compare objects", "To define custom comparators", "To provide additional functionality to arrays"),
                2
        );

        // Add questions to quiz
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q7);
        quiz.addQuestion(q8);
        quiz.addQuestion(q9);
        quiz.addQuestion(q10);
        quiz.addQuestion(q11);
        quiz.addQuestion(q12);
        quiz.addQuestion(q13);
        quiz.addQuestion(q14);
        quiz.addQuestion(q15);
        quiz.addQuestion(q16);
        quiz.addQuestion(q17);
        quiz.addQuestion(q18);
        quiz.addQuestion(q19);
        quiz.addQuestion(q20);
        quiz.addQuestion(q21);
        quiz.addQuestion(q22);
        quiz.addQuestion(q23);
        quiz.addQuestion(q24);
        quiz.addQuestion(q25);
        quiz.addQuestion(q26);
        quiz.addQuestion(q27);
        quiz.addQuestion(q28);
        quiz.addQuestion(q29);
        quiz.addQuestion(q30);
        quiz.addQuestion(q31);
        quiz.addQuestion(q32);
        quiz.addQuestion(q33);
        quiz.addQuestion(q34);


        // Start the quiz
        quiz.start();
    }

    public static void welcome1() {
        System.out.println("***Welcome to Java Programming***");
        System.out.println("page 1/3");
        System.out.println("Here you can learn about basic programming");
        System.out.println("Learn about a topic, and then qet quizzed afterwards");
        System.out.println("1. Primitive types");
        System.out.println("2. Escape sequence");
        System.out.println("3. Precedence");
        System.out.println("4. Methods");
        System.out.println("5. Parameters");
        System.out.println("6. Parameters transfer");
        System.out.println("7. Multiple parameters");
        System.out.println("8. Return values");
        System.out.println("9. ***Next page***");
        System.out.println("66. ***Se this menu again***");
        System.out.println("99. ***Back to the previous page***");
        System.out.println("911. ***Quiz***\n");
    }


    public static void welcome2() {
        System.out.println("***Welcome to Java Programming***");
        System.out.println("Page 2/3");
        System.out.println("Here you can learn about basic programming");
        System.out.println("Learn about a topic, and then qet quizzed afterwards");
        System.out.println("1. Overloading");
        System.out.println("2. Static");
        System.out.println("3. Loops, (For loop, do while loop, for each loop)");
        System.out.println("4. Fencepost");
        System.out.println("5. Sentinel loop, Loop tables & Boolean zen");
        System.out.println("6. Files, Scanner object");
        System.out.println("7. Line/Token");
        System.out.println("8. PrintStream, Exceptions");
        System.out.println("9. ***Next page***");
        System.out.println("66. ***Se this menu again***");
        System.out.println("99. ***Back to the previous page***");
        System.out.println("911. ***Quiz***\n");
    }
    public static void welcome3() {
        System.out.println("***Welcome to Java Programming***");
        System.out.println("Page 3/3");
        System.out.println("Here you can learn about basic programming");
        System.out.println("Learn about a topic, and then qet quizzed afterwards");
        System.out.println("1. Classes vs Objects");
        System.out.println("2. State vs Behavior & This");
        System.out.println("3. Inheritance, Superclass/SubClass");
        System.out.println("4. Override");
        System.out.println("5. ArrayList, ArrayList vs Array");
        System.out.println("6. Wrapper");
        System.out.println("7. Collection.sort");
        System.out.println("8. Comparable/Compare to");
        System.out.println("9. ***Next page***");
        System.out.println("66. ***Se this menu again***");
        System.out.println("99. ***Back to the previous page***");
        System.out.println("911. ***Quiz***\n");
    }

    public static void switch09(Scanner scan) {

                while (true) {
                    System.out.println("Pick a topic");
                    System.out.println("99 for menu, & 9 for next page (911 for Quiz)");
                    int choice = scan.nextInt();
                    scan.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Primitive types");
                            System.out.println("In Java, primitive types are the most basic data types that are built into the language.\n" +
                                    "They are not objects and hold simple values directly in the memory allocated for them. \n" +
                                    "Java provides eight primitive data types, each serving a specific purpose. \nHere’s an overview of these types:\n" +
                                    "byte, short, int, long, float, double, boolean, char");
                            break;

                        case 2:
                            System.out.println("Escape sequences");
                            System.out.println("In Java, escape sequences are special characters used within strings to represent certain special characters, \n" +
                                    "such as newline, tab, or quotation marks. These sequences start with a backslash (\\) \n" +
                                    "followed by a character that has a special meaning. \n" +
                                    "Escape sequences are used to insert characters that are otherwise difficult to include directly in a string.\n" +
                                    "Common escape types are:\n" +
                                    "\\r (moves the cursur to the beginnning of the line)\n" +
                                    "\\n (makes a new line)\n" +
                                    "\\' (single quotation mark)\n" +
                                    "\\t (tab, adds space between chars\n" +
                                    "\\\\ (Backslash)");
                            break;

                        case 3:
                            System.out.println("Precedence");
                            System.out.println("In Java, operator precedence determines the order in which operators are evaluated in expressions. \n" +
                                    "Operators with higher precedence are evaluated before operators with lower precedence. \n" +
                                    "When operators have the same precedence, their associativity (either left-to-right or right-to-left) determines the order of evaluation.");
                            System.out.println("Common precedence: \n" +
                                    "Additive operators  +, -\n" +
                                    "Multiplicative operators / *, %, / \n" +
                                    "Equality operators  == , !=\n" +
                                    "Bitwise AND operators  &\n" +
                                    "Bitwise OR operators  |");
                            break;

                        case 4:
                            System.out.println("Methods in Java\n" +
                                    "Definition:\n" +
                                    "A method is a block of code that performs a specific task. It is a fundamental part of Java programming and helps to modularize and organize code. \n" +
                                    "Methods can be called or invoked to execute their code from other parts of a program.\n" +
                                    "Key Components:\n" +
                                    "\n" +
                                    "Method Signature:\n" +
                                    "Return Type: The data type of the value the method returns. If the method does not return any value, the return type is void.\n" +
                                    "Method Name: A unique name that identifies the method. It follows the naming conventions in Java.\n" +
                                    "Parameters (Optional): A list of input values that the method can accept. Each parameter has a type and a name.\n"
                                    );

                            break;

                        case 5:
                            System.out.println("Parameters");
                            System.out.println("Parameters are inputs to methods that allow you to pass values into the method when you call it. \n" +
                                    "Parameters are specified in the method definition and can be used within the method body.");
                            break;

                        case 6:
                            System.out.println("Parameter transfer");
                            System.out.println("Java uses pass-by-value for parameter transfer. This means that when you pass a variable to a method, the method receives a copy of the variable's value. \n" +
                                    "Changes made to the parameter within the method do not affect the original variable.");
                            break;

                        case 7:
                            System.out.println("Multiple parameters");
                            System.out.println("Methods can take multiple parameters, separated by commas.");
                            break;

                        case 8:
                            System.out.println("Return values");
                            System.out.println("Methods can return values using the return keyword. The type of the returned value must match the method's return type.");
                            break;

                        case 9:
                            //next page
                            welcome2();
                            switch0919(scan);
                            break;

                        case 66:
                            //show menu
                            welcome1();
                            switch09(scan);
                            break;

                        case 99:
                            //previous page
                            System.out.println("This is the first page, you cannot go further back");
                            welcome1();
                            switch09(scan);
                            break;

                        case 911:
                            setupAndRunQuiz();
                            break;

                        default:
                            System.out.println("Wrong choice");
                    }

        }

    }

    public static void switch0919(Scanner scan) {

        while (true) {
            System.out.println("Pick a topic");
            System.out.println("99 for previous page, & 9 for next page(911 for Quiz)");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Overloading");
                    System.out.println("In Java, method overloading refers to the ability to create multiple methods in the same class with the same name but different parameters.\n" +
                            "It allows methods to perform similar operations with different types or numbers of input parameters. \n" +
                            "Method overloading improves the readability of the code and enhances its flexibility.\n");
                    break;

                case 2:
                    System.out.println("Static");
                    System.out.println( "In Java, the keyword static is used to indicate that a particular member (variable, method, or nested class) belongs to the class itself, \n" +
                            "rather than to instances of the class. This means that the static member is shared among all instances of the class. \n");
                    break;

                case 3:
                    System.out.println("For loops, while loops, do while loops, for each loop");
                    System.out.println("For loop");
                    System.out.println("A for loop is used when you know in advance how many times you want to execute a block of code. \n" +
                            "It consists of three parts: initializing the loop control variable, checking a condition to continue the loop, and updating the loop control variable after each iteration. \n" +
                            "For example, if you want to print numbers from 0 to 4, you can set up a for loop that starts a counter at 0, checks if the counter is less than 5, prints the counter, and then increments the counter by 1 after each print.");
                    System.out.println("");
                    System.out.println("While-Loop");
                    System.out.println("A while loop is useful when you want to repeat a block of code as long as a specific condition is true, but you don't necessarily know in advance how many times it needs to be repeated. \n" +
                            "For instance, you might keep reading user input until they enter a specific value. The loop will check the condition before each iteration and continue running as long as the condition is true.");
                    System.out.println("");
                    System.out.println("Do-while");
                    System.out.println("A do-while loop is similar to a while loop but with one key difference: it guarantees that the block of code will be executed at least once, regardless of whether the condition is true initially. \n" +
                            "This is because the condition is checked after the code block has been executed. \n" +
                            "For example, you might want to ask a user for input at least once and then continue to ask for input until they provide a valid response.");
                    System.out.println("");
                    System.out.println("for-each loop");
                    System.out.println("A for-each loop, also known as an enhanced for loop, is used specifically for iterating over elements in an array or a collection (like a list). \n" +
                            "It simplifies the code by eliminating the need for a loop control variable and directly accessing each element in the array or collection. \n" +
                            "For example, if you have a list of numbers and you want to print each number, you can use a for-each loop to go through each number in the list and print it without needing to manage an index variable.");
                    System.out.println("");
                    System.out.println("Comparison and usage");
                    System.out.println("For Loop: Best used when you know the exact number of iterations required. It provides precise control with initialization, condition-checking, and updating steps.\n");
                    System.out.println("While Loop: Ideal for scenarios where the number of iterations is not known upfront. It keeps executing the code block as long as the condition remains true.\n");
                    System.out.println("Do-While Loop: Useful when you need to ensure that the code block is executed at least once, as the condition is checked after the first execution.\n");
                    System.out.println("For-Each Loop: Simplifies the process of iterating over arrays or collections, making the code cleaner and easier to read. It's used when you need to process every element in a collection or array.\n");
                    break;

                case 4:
                    System.out.println("Fencepost");
                    System.out.println("The \"fencepost\" problem, also known as the \"off-by-one\" error, is a common issue in programming, particularly when using loops. \n" +
                            "It occurs when the loop doesn't handle the first or last iteration correctly, leading to an incorrect number of iterations or missing out on the edge cases. \n" +
                            "The name comes from the analogy of placing fence posts and rails: if you have n fence posts, you need n-1 rails to connect them.");
                    break;

                case 5:
                    System.out.println("Sentinel Loop, Loop tables, Boolean zen");
                    System.out.println("Sentinel Loop");
                    System.out.println("A sentinel loop is a loop that continues to process data until a special value, known as the sentinel value, is encountered. \n" +
                            "The sentinel value indicates the end of the data and is not processed as regular data. This type of loop is commonly used when the amount of data to process is unknown in advance.");
                    System.out.println("");
                    System.out.println("Loop tables");
                    System.out.println("Loop tables are used to help visualize and plan the behavior of a loop. They are particularly useful for debugging and understanding how variables change during each iteration. \n" +
                            "A loop table typically includes columns for each variable and row for each iteration of the loop.");
                    System.out.println("");
                    System.out.println("Boolean zen");
                    System.out.println("Boolean Zen refers to the practice of writing clear, concise, and readable boolean expressions. It emphasizes simplicity and avoiding unnecessary comparisons or conditions. \n" +
                            "The goal is to make the code easier to understand and maintain.");
                    System.out.println("");
                    System.out.println("Summary");
                    System.out.println("Sentinel Loop: Uses a special value to indicate the end of data processing. Continues looping until the sentinel value is encountered.");
                    System.out.println("Loop Tables: Visual tools for planning and debugging loops by tracking variable values through each iteration. They help understand how loops operate and evolve over time.");
                    System.out.println("Boolean Zen: Promotes writing simple, clear, and direct boolean expressions. Avoids unnecessary complexity to make the code more readable and maintainable.");
                    break;

                case 6:
                    System.out.println("Files, Scanner object");
                    System.out.println("Files in Java are used for reading from and writing to external files stored on the file system. This is essential for persistent data storage, allowing data to be saved between program executions.\n" +
                            "\n" +
                            "Key Concepts:\n" +
                            "Reading Files: You can read data from a file, which is useful for loading previously saved data, such as user settings, application configurations, or logs.\n" +
                            "Writing Files: You can write data to a file, enabling you to save data generated by the program, such as user input, results of computations, or logs.\n" +
                            "File Handling Classes: Java provides several classes in the java.io package (like FileReader, BufferedReader, FileWriter, and BufferedWriter) and in the java.nio.file package for file handling.");
                    System.out.println("");
                    System.out.println("Scanner object");
                    System.out.println("The Scanner object in Java is a versatile utility for parsing primitive types and strings using regular expressions. It can be used to read input from various sources, including user input from the console, files, or other input streams.\n" +
                            "\n" +
                            "Key Concepts:\n" +
                            "Reading User Input: The Scanner object is commonly used to read user input from the console. This is useful for interactive applications where user commands or data are required.\n" +
                            "Reading from Files: The Scanner can also read data from files, making it convenient for processing text files line by line or token by token.\n" +
                            "Parsing Data: Scanner can parse different types of data (e.g., integers, doubles, strings) directly, which simplifies the process of reading and converting input.");
                    System.out.println("");
                    System.out.println("Summary");
                    System.out.println("Files: Used for reading and writing persistent data to and from the file system. Essential for data that needs to be retained between program runs.\n" +
                            "Scanner Object: A flexible tool for reading and parsing input from various sources, including user input from the console and data from files. It simplifies data handling and conversion.");
                    break;

                case 7:
                    System.out.println("Line/Token");
                    System.out.println("Line");
                    System.out.println("A line is a sequence of characters that ends with a newline character or sequence (like \"\\n\" or \"\\r\\n\" depending on the system). \n" +
                            "In the context of reading data (whether from a file, console input, or another source), a line typically represents a complete unit of data, such as a sentence, a record, or a log entry.");
                    System.out.println();
                    System.out.println("Token");
                    System.out.println("A token is a smaller piece of data extracted from a larger body of text, typically separated by delimiters such as spaces, commas, or other characters. \n" +
                            "Tokens break down a line into its individual components, making it easier to work with each part separately.");
                    break;

                case 8:
                    System.out.println("PrintStream, Exceptions");
                    System.out.println("A PrintStream in Java represents an output stream that can be used to write data to various output destinations, such as the console, files, or other output streams. \n" +
                            "It provides methods to print different data types, such as strings, integers, and floating-point numbers, in a formatted way.\n" +
                            "\n" +
                            "Conceptual Use:\n" +
                            "\n" +
                            "Printing to Console: PrintStream is commonly used to output messages, status updates, or results to the console for debugging or user interaction purposes.\n" +
                            "Writing to Files: It can also be used to write data to files, allowing you to save program output or logs for future reference.\n" +
                            "Sending Data Over Network: PrintStream can be used in networking applications to send formatted data to other systems or services over a network connection.\n" +
                            "By using PrintStream, you can easily output data to different destinations in a controlled and formatted manner, enhancing the readability and usability of your programs.");
                    System.out.println();
                    System.out.println("Exceptions");
                    System.out.println("Exceptions\n" +
                            "An exception in Java represents an abnormal condition or error that occurs during the execution of a program, disrupting the normal flow of control. \n" +
                            "Exceptions can occur due to various reasons, such as invalid input, resource unavailability, or programming errors.\n" +
                            "\n" +
                            "Conceptual Use:\n" +
                            "\n" +
                            "Error Handling: Exceptions are used to handle errors and abnormal conditions gracefully, preventing program crashes and providing feedback to users about the problem.\n" +
                            "Exception Propagation: Exceptions can be propagated up the call stack until they are caught and handled by an appropriate exception handler, allowing you to handle errors at different levels of the program.\n" +
                            "Resource Management: Exceptions are often used to manage resources, such as file streams or database connections, ensuring that resources are properly closed and released even in the event of an error.\n" +
                            "By using exceptions effectively, you can improve the robustness and reliability of your programs, making them more resilient to unexpected situations and errors.");
                    break;

                case 9:
                    //next page
                    welcome3();
                    switch1928(scan);
                    break;

                case 66:
                    //menu
                    welcome2();
                    switch0919(scan);
                    break;

                case 99:
                    //previous page
                    welcome1();
                    switch09(scan);
                    break;

                case 911:
                    setupAndRunQuiz();
                    break;

                default:
                    System.out.println("Wrong choice");
            }

        }

    }
    public static void switch1928(Scanner scan) {

        while (true) {
            System.out.println("Pick a topic");
            System.out.println("99 for previous menu, & 9 for this menu ((911 for Quiz) \n*This is the last page*");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Classes vs. Objects\n" +
                            "Classes: In Java, a class is a blueprint or template for creating objects. It defines the properties (attributes or fields) and behaviors (methods) that objects of that class will have. \n" +
                            "Classes serve as a model for creating objects with similar characteristics." +
                            "\n" +
                            "Objects: An object is an instance of a class. It represents a specific entity or instance with its own state (data) and behavior (methods). Objects are created using the \"new\" keyword followed by the constructor of the class.");
                    break;

                case 2:
                    System.out.println("State vs Behavior & This");
                    System.out.println("State and Behavior\n" +
                            "State: The state of an object refers to the values of its attributes or fields at a particular point in time. These attributes represent the data or properties associated with the object. For example, a \"Car\" class might have attributes like \"color\", \"speed\", and \"fuel level\".\n" +
                            "\n" +
                            "Behavior: The behavior of an object refers to the actions or operations that it can perform. These behaviors are implemented as methods defined within the class. For example, a \"Car\" class might have methods like \"accelerate()\", \"brake()\", and \"refuel()\".");
                    System.out.println("\"this\" Keyword\n" +
                            "The \"this\" keyword in Java refers to the current object instance within a class. It can be used to access or refer to the current object's attributes or methods, especially in cases where there might be ambiguity between instance variables and local variables.\n" +
                            "\n" +
                            "Usage: Inside a class, \"this\" can be used to refer to the current object's attributes or methods. For example, \"this.color\" refers to the \"color\" attribute of the current object.\n" +
                            "\n" +
                            "Avoiding Ambiguity: When a method parameter has the same name as an instance variable, \"this\" can be used to differentiate between the two. For example, \"this.color = color\" assigns the value of the method parameter \"color\" to the instance variable \"color\".\n" +
                            "\n" +
                            "Conceptual Understanding\n" +
                            "Classes and Blueprints: Classes define the structure and behavior of objects, serving as blueprints for creating objects with similar characteristics.\n" +
                            "\n" +
                            "Objects and Instances: Objects are individual instances of a class, each with its own state (data) and behavior (methods).\n" +
                            "\n" +
                            "State and Behavior: Objects encapsulate both state (data) and behavior (methods), providing a comprehensive model for representing real-world entities.\n" +
                            "\n" +
                            "\"this\" for Clarity: The \"this\" keyword helps clarify and distinguish between instance variables and local variables within a class, improving code readability and reducing ambiguity.");
                    break;

                case 3:
                    System.out.println("Inheritance, Superclass/subClass");
                    System.out.println("Inheritance\n" +
                            "Inheritance is a key concept in object-oriented programming (OOP) that allows a class (subclass) to inherit attributes and methods from another class (superclass). It establishes a hierarchical relationship between classes, where subclasses can extend and specialize the behavior of their superclass.\n" +
                            "\n" +
                            "Relationship: Inheritance represents an \"is-a\" relationship, where a subclass is a more specialized version of its superclass. For example, a \"Car\" class may inherit from a more general \"Vehicle\" class.\n" +
                            "\n" +
                            "Code Reusability: Inheritance promotes code reuse by allowing subclasses to inherit common attributes and methods from their superclass. This reduces redundancy and improves code maintainability.\n" +
                            "\n" +
                            "Superclass and Subclass\n" +
                            "Superclass: A superclass, also known as a parent class or base class, is a class from which other classes inherit attributes and methods. It defines common behavior shared by multiple subclasses.\n" +
                            "\n" +
                            "Subclass: A subclass, also known as a child class or derived class, is a class that inherits attributes and methods from a superclass. It can add its own unique attributes and methods, as well as override methods inherited from the superclass.\n" +
                            "\n" +
                            "Key Characteristics\n" +
                            "Inherited Features: Subclasses inherit all accessible attributes and methods from their superclass. This includes both public and protected members.\n" +
                            "\n" +
                            "Extensibility: Subclasses can extend the functionality of their superclass by adding new attributes and methods or by overriding existing methods to provide custom behavior.\n" +
                            "\n" +
                            "Code Organization: Inheritance facilitates code organization by promoting a hierarchical structure among classes. It helps categorize classes based on their common characteristics and relationships.");
                    break;

                case 4:
                    System.out.println("Override");
                    System.out.println("Override\n" +
                            "Method overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. This means that a subclass can replace or modify the behavior of a method inherited from its superclass.\n" +
                            "\n" +
                            "Key Points:\n" +
                            "Inheritance Requirement: Method overriding is possible only when there is a superclass-subclass relationship.\n" +
                            "\n" +
                            "Same Signature: The overriding method in the subclass must have the same method signature (name, parameters, and return type) as the method in the superclass.\n" +
                            "\n" +
                            "Subclass Customization: Method overriding allows subclasses to customize or extend the behavior of methods inherited from the superclass.");
                    System.out.println("Summary\n" +
                            "Method overriding allows a subclass to provide a specific implementation of a method inherited from its superclass.\n" +
                            "\n" +
                            "It enables customization and specialization of behavior in subclasses while promoting modularity and code reuse.\n" +
                            "\n" +
                            "Method overriding is a key feature of object-oriented programming that facilitates dynamic polymorphism and enhances the flexibility and extensibility of Java programs.");
                    break;

                case 5:
                    System.out.println("ArrayList, ArrayList vs Array");
                    System.out.println("ArrayList\n" +
                            "An ArrayList in Java is a dynamic array-like data structure that allows for flexible and efficient storage of elements. It is part of the Java Collections Framework and provides functionality for dynamically resizing the underlying array, making it easier to manage and manipulate collections of objects.\n" +
                            "\n" +
                            "Key Characteristics:\n" +
                            "Dynamic Size: Unlike arrays, ArrayLists can dynamically resize themselves to accommodate a variable number of elements. This makes them more flexible and convenient for managing collections of objects.\n" +
                            "\n" +
                            "Generic: ArrayLists support generics, allowing them to store elements of a specific type (e.g., integers, strings, custom objects) and provide type safety at compile time.\n" +
                            "\n" +
                            "Collection Operations: ArrayLists offer a wide range of methods for adding, removing, accessing, and manipulating elements. These methods make it easy to perform common collection operations efficiently.");
                    System.out.println("Arrays\n" +
                            "An array in Java is a fixed-size data structure that stores a collection of elements of the same type. Arrays provide a contiguous block of memory for storing elements, making them efficient for random access and traversal.\n" +
                            "\n" +
                            "Key Characteristics:\n" +
                            "Fixed Size: Arrays have a fixed size determined at the time of creation. Once created, the size of the array cannot be changed, and it cannot dynamically resize itself to accommodate more elements.\n" +
                            "\n" +
                            "Static Type: Arrays have a static type that is determined at compile time. This means that the type of elements stored in the array must be known at compile time and cannot be changed during runtime.\n" +
                            "\n" +
                            "Efficient Access: Arrays offer constant-time access to elements based on their index, making them efficient for random access and traversal operations.");
                    System.out.println("Comparison\n" +
                            "Flexibility: ArrayLists are more flexible than arrays because they can dynamically resize themselves, allowing for the storage of a variable number of elements. Arrays, on the other hand, have a fixed size and cannot change once created.\n" +
                            "\n" +
                            "Type Safety: ArrayLists provide type safety through generics, ensuring that only elements of the specified type can be added to the list. Arrays offer less type safety because they can store elements of any type, potentially leading to runtime errors if incorrect types are used.\n" +
                            "\n" +
                            "Convenience: ArrayLists provide a wide range of methods for adding, removing, and manipulating elements, making them convenient for managing collections of objects. Arrays offer fewer built-in operations and require manual memory management.");
                    System.out.println("Summary\n" +
                            "ArrayLists provide dynamic resizing, type safety, and built-in collection operations, making them flexible and convenient for managing collections of objects.\n" +
                            "\n" +
                            "Arrays offer fixed-size storage, efficient random access, and traversal operations, making them suitable for situations where memory efficiency and static typing are important.");
                    break;

                case 6:
                    System.out.println("Wrapper");
                    System.out.println("Wrapper Classes\n" +
                            "Wrapper classes in Java are part of the java.lang package and are used to convert primitive data types (such as int, char, double, etc.) into objects. Each primitive data type has a corresponding wrapper class that provides methods to perform various operations on the primitive values as objects.\n" +
                            "\n" +
                            "Primitive Types and Their Wrappers\n" +
                            "int -> Integer\n" +
                            "char -> Character\n" +
                            "double -> Double\n" +
                            "boolean -> Boolean\n" +
                            "float -> Float\n" +
                            "long -> Long\n" +
                            "short -> Short\n" +
                            "byte -> Byte");
                    System.out.println("Purpose and Benefits of Wrapper Classes\n" +
                            "Object Manipulation: Wrapper classes allow primitive types to be treated as objects. This is particularly useful when you need to use primitives in collections like ArrayList, which only store objects.\n" +
                            "\n" +
                            "Utility Methods: Wrapper classes provide a number of utility methods for converting between types, parsing strings, and performing operations like comparison, hashing, and formatting.\n" +
                            "\n" +
                            "Type Conversion: Wrappers facilitate type conversion between strings and primitives. For example, converting a string representation of a number into an actual numeric value.\n" +
                            "\n" +
                            "Null Values: Wrappers can represent null values, which is not possible with primitive types. This is useful in situations where a variable might not have a value.");
                    System.out.println("Summary\n" +
                            "Wrapper classes in Java bridge the gap between primitive data types and objects. They enable primitive types to be used where objects are required, \n" +
                            "provide useful utility methods for operations and conversions, and support features like autoboxing and unboxing for seamless integration. \n" +
                            "Understanding wrapper classes enhances your ability to handle primitive data in an object-oriented manner and leverage Java's collection framework effectively.");
                    break;

                case 7:
                    System.out.println("Collection.sort");
                    System.out.println("Collections.sort()\n" +
                            "Collections.sort() is a method provided by the Collections utility class in the java.util package. It is used to sort elements in a list according to their natural order or according to a specified comparator.\n" +
                            "\n" +
                            "Key Points\n" +
                            "Natural Order Sorting: By default, Collections.sort() sorts elements in their natural order. The natural order is defined by the Comparable interface, which the elements must implement. For example, numbers are sorted in ascending order, and strings are sorted lexicographically.\n" +
                            "\n" +
                            "Custom Order Sorting: You can also sort elements using a custom order by providing a Comparator. A Comparator is an interface that defines a custom order by implementing the compare method.\n" +
                            "\n" +
                            "In-place Sorting: Collections.sort() sorts the list in-place, meaning it modifies the original list rather than creating a new sorted list. The elements are rearranged within the same list object.\n" +
                            "\n" +
                            "Generics: The method is generic, allowing it to sort lists containing elements of any type, provided the elements are either naturally comparable or a comparator is supplied.");
                    System.out.println("Use Cases\n" +
                            "Sorting Data: Use Collections.sort() to organize data in a list before displaying it to the user, such as sorting a list of products by price or a list of names alphabetically.\n" +
                            "\n" +
                            "Preparation for Binary Search: Sorting a list is often a prerequisite for performing a binary search, which requires the data to be in order.\n" +
                            "\n" +
                            "Consistent Order: Ensure a consistent and predictable order of elements in a list, which is essential for certain algorithms and operations.");
                    System.out.println("Summary\n" +
                            "Collections.sort() is a powerful and versatile method in Java's Collections utility class that simplifies the task of sorting lists. It supports both natural and custom ordering, performs in-place sorting, \n" +
                            "and works with generic types, making it a fundamental tool for managing ordered collections in Java applications.");
                    break;

                case 8:
                    System.out.println("Comparable, Compare to");
                    System.out.println("Comparable Interface\n" +
                            "Comparable is an interface in Java that defines a natural ordering for objects of a class. When a class implements the Comparable interface, it can be sorted using Java's sorting methods (like Collections.sort()) based on the natural order defined by the class.");
                    System.out.println("compareTo Method\n" +
                            "The compareTo method is the single abstract method declared in the Comparable interface. It defines the natural order for objects of the class that implements Comparable.\n" +
                            "\n" +
                            "Key Points:\n" +
                            "Natural Ordering: Implementing the Comparable interface allows you to define a natural order for the objects of your class. For example, numerical values might be sorted in ascending order, and strings might be sorted lexicographically.\n" +
                            "\n" +
                            "Single Method: The compareTo method is the only method in the Comparable interface. It takes one parameter (an object to compare with) and returns an integer that indicates the order of the objects.\n" +
                            "\n" +
                            "Return Values:\n" +
                            "\n" +
                            "A negative integer indicates that the current object is less than the specified object.\n" +
                            "Zero indicates that the current object is equal to the specified object.\n" +
                            "A positive integer indicates that the current object is greater than the specified object.");
                    System.out.println("Use Cases\n" +
                            "Numeric Comparison: For classes representing numeric values, compareTo can define ordering based on numerical magnitude (e.g., smallest to largest).\n" +
                            "\n" +
                            "Lexicographical Comparison: For classes representing strings or text, compareTo can define ordering based on lexicographical order (e.g., alphabetical).\n" +
                            "\n" +
                            "Custom Objects: For custom objects like Person with attributes like name and age, compareTo can define ordering based on a chosen attribute (e.g., by age or name).");
                    System.out.println("Summary\n" +
                            "The Comparable interface and its compareTo method in Java enable classes to define a natural order for their objects. This natural ordering facilitates sorting and comparison operations, allowing objects to be managed in ordered collections and sorted lists. \n" +
                            "By implementing Comparable and defining compareTo, you provide a clear and consistent way to compare and sort instances of your class, enhancing the usability and integration of your objects within the Java ecosystem.");
                    break;

                case 9:
                    //next page
                    welcome3();
                    System.out.println("This is the last page");
                    break;
                case 66:
                    //menu
                    welcome3();
                    switch1928(scan);
                    break;

                case 99:
                    //previous page
                    welcome2();
                    switch0919(scan);
                    break;

                case 911:
                    setupAndRunQuiz();
                    break;

                default:
                    System.out.println("Wrong choice");
            }

        }

    }


}