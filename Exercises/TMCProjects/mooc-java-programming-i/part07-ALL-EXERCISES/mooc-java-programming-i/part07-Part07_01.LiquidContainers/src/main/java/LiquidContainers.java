import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add") && amount > 0) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }

            if (input.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }

                first = first - amount;
                second = second + amount;

                if (second > 100) {
                    second = 100;
                }
            }

            if (input.equals("remove") && amount > 0) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }

            System.out.println("");
        }
    }

}


//
//import java.util.Scanner;
//
//public class LiquidContainers {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int firstContainer = 0;
//        int secondContainer = 0;
//
//        while (true) {
////            System.out.print("> ");
//            System.out.print(
//                    "First: " + firstContainer + "/100\n"
//                            + "Second: " + secondContainer + "/100 \n");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//            String[] parts = input.split(" ");
//            String command = parts[0];
//            int amount = Integer.valueOf(parts[1]);
//
//            if (command.equals("add")) {
//
//                if (amount <= 0) {
//                    return;
//                }
//
//                if ((firstContainer + amount) > 100) {
//                    firstContainer = 100;
//                } else {
//                    firstContainer += amount;
//                }
//                System.out.println("First: " + firstContainer + "/100");
//                System.out.println("Second: " + secondContainer + "/100");
//            } else if (command.equals("move")) {
//
//                if (amount <= 0 || firstContainer == 0) {
//                    return;
//                }
//
//                if (amount >= 100) {
//                    firstContainer = 0;
//                    secondContainer = 100;
//                } else if (secondContainer + amount <= 100) {
//                    secondContainer += amount;
//                    firstContainer -= amount;
//                } else {
//                    secondContainer = 100;
//                    firstContainer = 0;
//                }
//
//            } else if (command.equals("remove")) {
//                if (amount <= 0) {
//                    return;
//                }
//                if (amount > secondContainer) {
//                    secondContainer = 0;
//                } else secondContainer -= amount;
//
//            } else {
//                System.out.println("Unknown command");
//            }
//        }
//    }
//}


//import java.util.Scanner;
//
//public class LiquidContainers {
//    //this is pretty messy btw but works
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int firstContainer = 0;
//        int secondContainer = 0;
//
//        boolean shouldLoop = true;
//        while (shouldLoop) {
//            System.out.print(
//                    "First: " + firstContainer + "/100\n"
//                            + "Second: " + secondContainer + "/100 \n");
//
//            String userInput = scanner.nextLine();
//            if (userInput.equals("quit")) {
//                shouldLoop = false;
//                break;
//            }
//
//            String[] userInputSplit = userInput.split(" ");
//
//            String command = userInputSplit[0];
//
//            int amount = Integer.valueOf(userInputSplit[1]);
//
//            switch (command) {
//                case "add":
//
//                    if (amount <= 0) {
//                        return;
//                    }
//
//                    if (firstContainer + amount <= 100) {
//
//                        firstContainer += amount;
//                    } else if (firstContainer + amount > 100) {
//                        firstContainer = 100;
//                    }
//
//                    break;
//                case "move":
//
//                    if (amount <= 0 || firstContainer == 0) {
//                        return;
//                    }
//
//                    if (firstContainer - amount < 0) {
//                        amount = firstContainer;
//                    }
//
//                    if (amount >= 100) {
//                        firstContainer = 0;
//                        secondContainer = 100;
//
//                    } else if (secondContainer + amount <= 100) {
//                        secondContainer += amount;
//                        firstContainer -= amount;
//                    } else if (amount + secondContainer > 100 && amount + firstContainer > 100) {
//
//                        secondContainer = 100;
//
//                        firstContainer = 0;
//                    }
//
//                    break;
//                case "remove":
//
//                    if (amount <= 0) {
//                        return;
//                    }
//
//                    if (amount > secondContainer) {
//                        amount = 0;
//                    } else {
//                        secondContainer -= amount;
//                    }
//
//                    break;
//                default:
//                    System.out.println("Unknown command");
//
//            }
//
//        }
//    }
//}