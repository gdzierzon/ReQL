package edu.neumont.views;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class StatementBuilderViewTest
{

    @Test
    void should_get_input_from_user()
    {
        //arrange
        String expected = "CREATE TABLE 'TEST' ( col1, col2 ); ";
        String createString = "CREATE TABLE 'TEST' (\n" +
                "col1, col2 );";
        InputStream inputStream = new ByteArrayInputStream(createString.getBytes(StandardCharsets.UTF_8));
        StatementBuilderView view = new StatementBuilderView(inputStream, "Enter your create statement");

        //act
        String actual = view.display();

        //assert
        assertEquals(expected, actual);
    }
}