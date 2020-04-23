package edu.neumont.views;

import java.util.Scanner;

public class StatementBuilderView
{

    private String message;

    public StatementBuilderView(String message) {
        this.message = message;
    }

    public String display()
    {
        Scanner console = new Scanner(System.in);

        System.out.println(message);
        System.out.println();

        StringBuilder builder = new StringBuilder();
        boolean complete = false;

        while(!complete){
            System.out.print("> ");
            String line = console.nextLine();

            builder.append(line)
                    .append(" ");

            if(line.endsWith(";")){
                complete = true;
            }
        }

        return builder.toString();
    }
}
