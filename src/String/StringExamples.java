package String;

public class StringExamples {

    public static void main (String[] args){
        String name = "Kalaiselvan";
        String trimname = "  Kayal    ";
        int number = 21;

        //returns character value for the particular index
        System.out.println(name.charAt(4)); //Prints "i"

        //returns string length
        System.out.println(name.length()); //Prints 11

        //checks the equality of the given string
        System.out.println(name.equals("Kayal")); //Prints False

        //check the equality ignoring the case sensitivity
        System.out.println(name.equalsIgnoreCase("KALAISELVAN")); //True

        //check if string is empty or not
        System.out.println(name.isEmpty()); //False

        //returns true or false based on the given value is present or not
        System.out.println(name.contains("s")); //True
        System.out.println(name.contains("laisel")); //True

        //take a particular portion of the string
        System.out.println(name.substring(3)); //Prints aiselvan

        //take a particular portion of the string begin and end index
        System.out.println(name.substring(2,6)); //lais

        //appends the given string to the existing one
        System.out.println(name.concat(" Kayal")); //Prints Kalaiselvan Kayal

        //replaces the existing char with the given character
        System.out.println(name.replace('l','L')); //Prints KaLaiSeLvan

        //finds the position of the character in a string
        System.out.println(name.indexOf('s')); //Prints 5

        //finds the character specified from the index position -- give 3 examples
        System.out.println((name.indexOf('a',2))); //Print 3
        System.out.println((name.indexOf('a',4))); //Print 9
        System.out.println((name.indexOf("van",6))); //Print 8

        //Trim the whitespace before and after the string
        System.out.println(trimname.trim()); //Prints Kayal

        //convert the given data type to String
        System.out.println((String.valueOf(number)));

        //convert uppercase to lowercase and viceversa
        String uppercase = "KALAISELVAN";
        System.out.println(uppercase.toLowerCase());

        String lowercase = "kayal";
        System.out.println(lowercase.toUpperCase());

        //Split
        String splitthis = "I am an Indian";
        String [] splittedwords = splitthis.split(" ");
        for (String string: splittedwords){
            System.out.println(string);
        }

        // Use Join with given demiliter
        System.out.println(String.join("-", "Sachin","Dhoni","Rohit"));
        System.out.println(String.join("/", "21","07","1989"));


    }
}
