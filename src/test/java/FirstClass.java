import org.testng.annotations.Test;

public class FirstClass {

    //prints something
    @Test
    public void testName001(){
        System.out.println("This will be printed");
    }

    @Test
    public void testName002(){
        int myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void testName003() {
        // Create a string with a constructor
        String message1 = new String("Who let the dogs out?");        // String object stored in heap memory
        // Just using "" creates a string, so no need to write it the previous way.
        String message2 = "Who who who who!";                         // String literal stored in String pool
        // Java defined the operator + on strings to concatenate:
        String completeMessage = message1 + message2;

        //print string s3
        System.out.println(completeMessage);

    }

    @Test
    public void testName004() {
        int num = 5;
        String message = "I have " + num + " cookies";
        System.out.println(message);

    }

    @Test
    public void testName005() {
        boolean toBe = false;

        boolean b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }


    }


    //TODO: change to accept parametersso it will always print correct message
    @Test
    public void testName006() {
        int a = 4;
        int b = 4;

        if (a == b) {
            System.out.println("Ohhh! So a is " + a +"!");
        }
        else {
            System.out.println("a is not equal to " + b + "!");
        }

    }

    @Test
    public void testName007() {
        int[] arrOfIntegers = {1, 9, 9, 5};

        for (int i = 0; i < arrOfIntegers.length; i++) {
            int currentElement = arrOfIntegers[i];
            System.out.println(currentElement);
        }

    }



    //Create all of the primitives (except long and double) with different values.
    // Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true
    @Test
    public void testName008(){
    byte num1 = 31;        //value of byte data type size is -128 to 127
    short num2 = 1;     // value of -32,768 and a maximum value of 32,767 (inclusive)
    int num3 = 0;      // minimum value of -2.147.483.648 and a maximum value of 2.147.483.647.
    float num4 = 2.0f;  //up to 7 decimal digits
    char character1 = 'H';
    char character2 = 'w';
    char character3 = 'r';
    char character4 = 'd';
    boolean z = true;    //true, false

    String completeMessage;
    completeMessage = character1 + "" + num1 + "" + num2 + "" + num3 + " " + character2 + num3 + character3 + num2 + character4 + " " + num4 + " " + z;

    System.out.println(completeMessage);
    }







}


