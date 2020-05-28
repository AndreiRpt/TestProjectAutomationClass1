import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.INavigatorPanel;

import java.util.Arrays;

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


    //TODO: change to accept parameters so it will always print correct message
    @Test
    public void testName006() {
        int a = 6;
        int b = 5;

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



    /** JAVA EXERCISE*/


    @Test
    public void testName008() {
        System.out.println("Hello, World!");
    }



    /**Create all of the primitives (except long and double) with different values.
    Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true */
    @Test
    public void testName009(){
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


    /** Change the variables in the first section, so that each if statement resolves as true.*/
    @Test
    public void testName010() {
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }

    }


    /** Change the values in numbers so it will not raise an error. */
    @Test
    public void testName011() {
        int[] numbers = {1, 2, 3};   // values of the array numbers
        int length = numbers[2];    // int length = numbers[3];  // the integer length = the value of index 3, which doesn't exist.
                                   // Changed index to 2.  The length = 3

        char[] chars = new char[length];  // the array chars has the size of integer length 3
        chars[numbers.length - 1] = 'y'; // chars[numbers.length + 4] = 'y'; //the index 7 (3 + 4)of array chars = y.
                                        //the index 7 does not exist. Max index is 2.
                                       //So we could change to index 2 or numbers.length -1 which is also index 2
        System.out.println("Done!");

        // we can also change the value of index 2 of the numbers array to 8 or more and leave the code on line 138 unchanged.

    }

    /** Loop through and print out all even numbers, each in a separate line,
     * from the numbers list in the same order they are received.
     * Don't print any numbers that come after 237 in the sequence.*/

    //TODO not finished
    @Test
    public void test012() {

        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        // Your code goes here


    }



    /** Interview questions */

    // Loop that will return even numbers from 1-10
    @Test
    public void test00001() {
        for (int i = 1; i <=10; i++) {
            if (i%2==0)
                System.out.println(i);
        }
    }

    //If you want to print "hello world" at even numbers
    // then how would you do it?
    @Test
    public void printHelloAtEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0)
                System.out.println("hello world");
        }
    }



    public void printAllMembersOfArray(int[] arrayParameter) {

        for (int i = 0; i < arrayParameter.length; i++) {
            int currentElement = arrayParameter[i];
            System.out.println(currentElement);
        }
    }

//enchaced loop
    public void printAllMembersOfArrayE(int[] arrayParameter) {
        for (int eachMember : arrayParameter) {
            System.out.println(eachMember);
        }
    }


    @Test
    public void testName0007() {
        int[] arrOfIntegers = {1, 9, 9, 5};
        printAllMembersOfArray(arrOfIntegers);
    }


   /* Swap two numbers in an array */
    //1. create an inout array
    //2. create a method with parameter
    //3. new method will also take indexes of L eft and R ight elements
    //4. use indexes R and L respective elements will be swapped with eachover
    //5. Print out final version of the array
    @Test
    public void test_swapNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int indexL = 0;
        int indexR = 1;

        swap(input, indexL, indexR);
        printAllMembersOfArray(input);
        //or
        System.out.println(Arrays.toString(input));
    }

    // break your own code
    @Test
    public void test_swap_Exception () {
        int[] input = {1, 2, 3, 4, 5, 6};
        int indexL = -1;
        int indexR = 1;

        checkInputs(input, indexL, indexR);
        swap(input, indexL, indexR);
        printAllMembersOfArray(input);
    }

    //TODO: add checks for input array
    private void checkInputs(int[] input, int indexL, int indexR) {
        if(indexL >= 0 && indexL < input.length && indexR >= 0 && indexR < input.length) {
            System.out.println("Inputs are Ok");
        }
        else {
            throw new AssertionError("Inputs are not OK: indexL=" + indexL + ", indexR=" + indexR  );
        }

    }


    private void swap(int[] input, int indexL, int indexR){
    int temporaryElement = 0;
    temporaryElement = input[indexL];
    input[indexL] = input[indexR];
    input[indexR] = temporaryElement;
    }


   /** How would you count the number of letters 'l'
    */
  //TODO: break down into sub-steps (external methods), 'letter' should be a parameter as well
   @Test
   public void testCountLetters() {
       String input = "hello world";
       int result = 0;
       char letterParamenter = 'l';

       char[] charArray = input.toCharArray(); // transform String input to array

       for (char eachChar : charArray){
           if(eachChar == letterParamenter)
               result++;
       }
       System.out.println(result);
   }

    @Test
    public void test_ActorCreation() {
       Actor actor01 = new Actor(30, "Ivan", "Ivanov", 155, 100);
       int acto01Age = actor01.getAge();

        System.out.println(acto01Age);

        System.out.println(actor01.firstName + " " + actor01.lastName);

        Assert.assertEquals(acto01Age, 30);



    }











}









