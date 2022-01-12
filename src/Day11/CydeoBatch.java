package Day11;

import jdk.swing.interop.SwingInterOpUtils;

public class CydeoBatch {
    public static void main(String[] args) {
        String batch = "Eu";
        //solution 1
        if (batch == "Us morning")
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        else if (batch == "Us evening")
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
        else if (batch == "Eu")
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        else
            System.out.println("invalid Batch");

        System.out.println("1111-------------------------------------------------------------");

        switch (batch) {

            case "Us morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "Us evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "Eu":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                break;
            default:
                System.out.println("Invalid batch");
        }
                System.out.println("2222-----------------------------------------------------");

                if (batch == "Us morning" || batch == "Us evening" || batch == "Eu") {

                    switch (batch) {

                        case "Us morning":
                            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                            break;
                        case "Us evening":
                            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                            break;
                        default:
                            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");


                    }


                } else System.out.println("Invalid batch");
                System.out.println("33333----------------------------------------------------");

        }
    }





/*    If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        If batch type is invalid, print "Invalid Btach" */