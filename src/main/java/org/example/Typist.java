package org.example;
import java.util.Scanner;
import java.util.Stack;

public class Typist {

    Stack<String> stack = new Stack<>();

    Scanner scanner = new Scanner(System.in);


    public void display (){
        StringBuilder sentence = new StringBuilder();

        for(String word : stack){
            sentence.append(word).append(" ");
        }

        System.out.println(sentence.toString().trim());
    }




    public static void main(String[] args) {

        Typist typist = new Typist();

        String input="";
        while(true){

            input =typist.scanner.nextLine();

            if(input.equals("stop")){
                break;
            }

            if(input.equals("undo")){

                if(!typist.stack.isEmpty()){
                    typist.stack.pop();
                    typist.display();
                }else {
                    System.out.println("you have typed nothing");
                }
                continue;
            }

            if(input.split(" ").length==1){
                typist.stack.push(input);
            }else{
                for(String word : input.split(" ")){
                    typist.stack.push(word);
                }
            }

                typist.display();


            }






        }



    }


