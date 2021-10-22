package PP_final_Exam;

import java.util.Arrays;

public class ExamMethods {
    //write a method called makeArr() that take three numbers. the method should
    // return an array that hold those numbers

    public static int[] makeArr(int n1, int n2, int n3){
        int[] arr = {n1, n2, n3};
        return arr;
    }

    //write a method called doubleValues() that take an array of numbers. the method should
    // return an array that hold each element of the input array multiply by 2.

    public static int[] doubleValues(int[] arr){
        int[] doubleValues = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            doubleValues[i] = arr[i] * 2;
        }
        return doubleValues;
    }

    //write a method called printRevRecursive() recursively that take an array. the method should
    // print out the reverse of array elements. Example: arr = {"A", "B", "C"};
    //printRevRecursive(arr, 0)--> CBA

    public static void printRevRecursive(String[] arr, int index){
        if (index == arr.length)
            return;
        printRevRecursive(arr, index + 1);
        System.out.print(arr[index]);
    }

    //write a method called countWords() recursively that take a sentence. the method should
    // return the number of words in a given sentence. Example: sentence = "abdelaziz is a student in MIU";
    //countWords(sentence)--> 6

    public static int countWords(String sentence){
        int index;
        String sent = sentence.trim();
        if (sent.isEmpty())
            return 0;
        index = sent.indexOf(" ");
        if (index == -1)
            return 1;
        return 1 + countWords(sent.substring(index + 1));
    }

    //write a method called addSummation() that take an 2D-Array. the method should
    // return the 2D-Array that hold all input array elements plus one row that hold the sum
    // of all elements in the same column Example: arr[][] = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}}
    //countWords(sentence)--> {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}, {6, 9, 12}}

    public static int[][] addSummation(int[][] arr){
        int [][] newArr = new int[arr.length + 1][];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = sumColumn(arr);
        return newArr;
    }

    public static int[] sumColumn(int[][] arr){
        int[] sums = new int[arr[0].length];
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++){
                sums[j] += arr[i][j];
            }
        }
        return sums;
    }

    //write a method called findByCourses() that takes an array of student objects and a course Id.
    //the method should print all student id's that have the input course.
    public static void findByCourse(Student1[] stds, String cId){
        for (int i = 0; i < stds.length; i++){
            Course1[] cs = stds[i].getCourses();
            for (int j = 0; j < cs.length; j++){
                if (cs[j].getcId().equals(cId)) {
                    System.out.println(stds[i].getId());
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        Course1 cs1 = new Course1("cs105", "Problem solving");
        Course1 cs2 = new Course1("cs201", "Problem solving");
        Course1 cs3 = new Course1("cs221", "Data structure");

        Student1 std1 = new Student1("abdelaziz", 111, new Course1[]{cs1, cs2});
        Student1 std2 = new Student1("john", 112, new Course1[]{cs1, cs3});
        Student1 std3 = new Student1("Ahmed", 113, new Course1[]{cs1, cs2, cs3});
        Student1[]  stds = {std1, std2, std3};

        int[] arr = {12, 34, -89, 67};
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {0, 4, 2}
        };
        String[] strs = {"A", "B", "C"};
        String  sent = "Abdelaziz student in MIU";
        System.out.println("*********************  make array *******************************");
        System.out.println(Arrays.toString(makeArr(3, 8, 78)));
        System.out.println("********************** double values off array ******************");
        System.out.println(Arrays.toString(doubleValues(arr)));
        System.out.println("********************** count words in a sentence *****************");
        System.out.println(countWords(sent));
        System.out.println("*********************** reverse array ***************************");
        printRevRecursive(strs, 0);
        System.out.println("\n********************* add summation of 2d-Array columns *******");
        int[][] arr2 = addSummation(arr1);
        for (int[] ele: arr2){
            System.out.println(Arrays.toString(ele));
        }
        System.out.println("************************ find student id's by course id**********");
        findByCourse(stds, "cs201");
        System.out.println("*****************************************************************");

    }
}
