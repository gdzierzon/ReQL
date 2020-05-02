package edu.neumont.views;

import java.io.InputStream;
import java.util.Scanner;

public class StatementBuilderView
{

    private String message;
    private Scanner console;

    public StatementBuilderView(InputStream stream, String message) {
        this.console = new Scanner(stream);
        this.message = message;
    }

    public StatementBuilderView(String message) {
        this(System.in, message);
    }

    public String display()
    {
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
