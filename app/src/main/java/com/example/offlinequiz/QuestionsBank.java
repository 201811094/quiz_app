package com.example.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank  {

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("what is the size of int variable?", "16 bit", "8 bit", "32 bit", "64 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("what is the default value of Boolean variable?","true", "false", "null", "not defined", "false", "");
        final QuestionsList question3 = new QuestionsList("what is the following is the default of an instance variable?", "Depends upon the type of variable", "null", "0", "not assigned", "Depends upon the type of variable", "");
        final QuestionsList question4 = new QuestionsList("which is a reserved word in the java programming language?", "method", "native", "reference", "array", "native", "");
        final QuestionsList question5 = new QuestionsList("which of the following is NOT a keywords or reserved words in Java? ", "if", "then", "goto", "while", "then","");
        final QuestionsList question6 = new QuestionsList("which is the valid declaretion within an interface definition?", "public double methode();", "public final double methode();", "static void methoda(double d1);", "protected void methoda(double d1);", "public final double methode();", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }


    private static List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Which of the following is the default file extension of PHP files?", ".php", ".ph", ".html", ".xml", ".php", "");
        final QuestionsList question2 = new QuestionsList("How to define a function in PHP?","functionName(parameters) {function body}", "function {function body}", "function functionName(parameters) {function body}", "data type functionName(parameters) {function body}", "function functionName(parameters) {function body}", "");
        final QuestionsList question3 = new QuestionsList("Which is the right way of declaring a variable in PHP?", "$3hello", " $_hello", "$this", "$5_Hello", "$_hello", "");
        final QuestionsList question4 = new QuestionsList("Which of the following PHP functions can be used for generating unique ids?", "md5()", "uniqueid()", "mdid()", "id()", "uniqueid()", "");
        final QuestionsList question5 = new QuestionsList("Which of the following web servers are required to run the PHP script? ", "Apache and PHP", "IIS", "XAMPP", " Any of the mentioned", "IIS","");
        final QuestionsList question6 = new QuestionsList("What does PDO stand for?", "PHP Database Orientation", "PHP Data Orientation", "PHP Data Object", "PHP Database Object", "PHP Data Object", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }



    private static List<QuestionsList> htmlQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Who is the father of HTML?", "Rasmus Lerdorf", " Tim Berners-Lee", "Brendan Eich", "Sergey Brin", " Tim Berners-Lee", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is used to read an HTML page and render it?","Web server", "Web network", "Web browser", "Web matrix", "Web browser", "");
        final QuestionsList question3 = new QuestionsList("What is the correct syntax of doctype in HTML5?", "</doctype html>", "  <doctype html>", "<doctype html!>", "<!doctype html>", "<!doctype html>", "");
        final QuestionsList question4 = new QuestionsList(" Which of the following tag is used for inserting the largest heading in HTML?", " head", "<h1>", "<h6>", "heading", "<h1>", "");
        final QuestionsList question5 = new QuestionsList("In which part of the HTML metadata is contained? ", "head tag", "title tag", "html tag", " body tag", "head tag","");
        final QuestionsList question6 = new QuestionsList("Which of the following is not a HTML5 tag?", " <track>", "<video>", "<slider>", " <source>", "<slider>", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    private static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Under which of the following Android is licensed", "OSS", " Sourceforge", "Apache/MIT", "None of the above", " Apache/MIT", "");
        final QuestionsList question2 = new QuestionsList("For which of the following Android is mainly developed?","Server", "Desktops", "Laptops", "Mobile devices", "Mobile devices", "");
        final QuestionsList question3 = new QuestionsList("Which of the following virtual machine is used by the Android operating system?", "JVM", "Dalvik virtual machine", "Simple virtual machine", "None of the above", "Dalvik virtual machine", "");
        final QuestionsList question4 = new QuestionsList(" Android is based on which of the following language?", "Java", "C++", "C", "Html", "Java", "");
        final QuestionsList question5 = new QuestionsList("Which of the following converts Java byte code into Dalvik byte code? ", "Dalvik converter", "Dex compiler", "Mobile interpretive compiler (MIC)", " None of the above", "Dex compiler","");
        final QuestionsList question6 = new QuestionsList("What is an activity in android?", "android class", "android package", "A single screen in an application with supporting java code", "Non of the above", "android class", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    public static List<QuestionsList> getQuestionsList(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
            return javaQuestions();

            case "php":
                return phpQuestions();

            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}