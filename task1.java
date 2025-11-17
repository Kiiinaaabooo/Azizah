// import java.util.Scanner; 
// public class task1 {

//     public static void main(String[] args) {
//         task1();
//         task2();
//         task3();
//     }
    
//     public static void task1() {
//         // Import the scanner
//         Scanner sc = new Scanner(System.in);
//         String sentence = sc.nextLine();

//         // Define the index for the first space and second space of the sentence
//         int firstSpace = sentence.indexOf(" ");
//         int lastSpace = sentence.lastIndexOf(" ");

//         // Break down the first word, second word, and third word of the sentence
//         String firstWord = sentence.substring(0,firstSpace);
//         String middleWord = sentence.substring(firstSpace + 1, lastSpace);
//         String lastWord = sentence.substring (lastSpace + 1);

//         // Combine the first word, second word, and third word in reverse order
//         String swapped = lastWord + " " + middleWord + " " + firstWord;

//         // Make the first character of the swapped sentence become an upper case letter
//         swapped = swapped.substring(0, 1).toUpperCase() + swapped.substring(1).toLowerCase();

//         // Print the swapped sentence
//         System.out.println(swapped);
        
//         // Close the scanner
//         sc.close();
//     }
// }
    
//     public static void task2(){
//         // Your code here
//          // Welcome message
//         System.out.println("=== Welcome to GrandStay Hotels ===");
//         System.out.println("Please enter your full name for check-in.\n");

//         // Create Scanner object
//         Scanner scanner = new Scanner(System.in);

//         // Take guest name input
//         System.out.print("Enter your full name: ");
//         String fullName = scanner.nextLine().trim();

//         // Extract first and last name
//         int spaceIndex = fullName.indexOf(" ");
//         String firstName = fullName.substring(0, spaceIndex);
//         String lastName = fullName.substring(spaceIndex + 1);

//         // Convert first name to Standard
//         String firstLetterFirstName = firstName.substring(0, 1).toUpperCase();
//         String remainingFirstName = firstName.substring(1).toLowerCase();
//         String formattedFirstName = firstLetterFirstName + remainingFirstName;

//         // Convert last name to Standard
//         String firstLetterLastName = lastName.substring(0, 1).toUpperCase();
//         String remainingLastName = lastName.substring(1).toLowerCase();
//         String formattedLastName = lastName + remainingLastName;

//         // Combine formatted first and last name
//         String formattedFullName = formattedFirstName + " " + formattedLastName;

//         // Generate Booking Reference ID (First name ALL UPPERCASE, last name all lowercase)
//         String bookingRef = firstName.toUpperCase() + "_" + lastName.toLowerCase();

//         // Display processed name details
//         System.out.println("\n--- Check-in Details ---");
//         System.out.println("Guest Name: " + formattedFullName);
//         System.out.println("First Name: " + formattedFirstName);
//         System.out.println("Last Name: " + formattedLastName);
//         System.out.println("Booking Reference ID: " + bookingRef);
//         System.out.println("\nEnjoy your stay at GrandStay Hotels!");

//         // Close scanner
//         scanner.close();
//     }
// }
    
//     public static void task3(){
//         // Your code here
//         Scanner scanner = new Scanner(System.in);
//         //Input
//         System.out.println("Enter book title: ");
//         String bookTitle = scanner.nextLine();
//         System.out.println("Enter Current Separator: ");
//         String Separator = scanner.next();
//         System.out.println("Enter number of starting characters for code: ");
//         int code = scanner.nextInt();
        
//         //New Title
//         String formattedTitle = bookTitle.replace(Separator," ");
        
//         //Title Lenght
//         int charLenght = bookTitle.length()+1;
        
//         //Short Code
//         String shortCode = formattedTitle.substring(0, code);
        
//         //Output
//         System.out.println("Formatted Title:" + formattedTitle);
//         System.out.println("Title Lenght: " + charLenght + "   |   " + "Short Code:" + shortCode);
        
//     }
// }