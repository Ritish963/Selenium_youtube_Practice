package org.example;



public class Exceptions {
    public static void main(String[] args) {
    try {
        CustomException.age(19);
        } catch (CustomException e) {
            System.out.println(e);
        }

    }
}
class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
    public static void age(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("You must be at least 18 years old.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
