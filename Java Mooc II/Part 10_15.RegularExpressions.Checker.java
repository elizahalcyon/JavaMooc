

public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    } 

    public boolean allVowels(String string) {
    //  return string.matches("[aeiou]*");
        if (string.matches("[aeiou]*")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
        return false;
        }
    }    

    public boolean timeOfDay(String string) {
    //  return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
        if (string.matches("([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
}


/*
 for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ('a'|'e'|'i'|'o'|'u')) {
                continue;
            } else {
                System.out.println("The form is incorrect.");
                return false;
            }
        }
        System.out.println("The form is correct.");
        return true;
    }
 */