package edu.neumont.models.schemas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchemaBuilderTest
{
    String statement;
    SchemaBuilder builder;

    @BeforeEach
    public void setup()
    {
        statement = "CREATE TABLE 'appointment' \n" +
                "(patient, doctor, date, time, notes) : \n" +
                " line format /(^(\\w+ (\\w+ )*\\w+)) (\\w+ (\\w+ )*\\w+) (\\d{1,2}\\/\\d{1,2}\\/\\d{4}) (\\d{1,2}:\\d{2}) (\\w+$)/ \n" +
                " file 'C:/path/appointments.txt' \n" +
                ";";

        builder = new SchemaBuilder(statement);
    }

    @Test
    void should_get_table_name()
    {
        //arrange
        String expected = "appointment";

        //act
        String actual = builder.getTableName();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void should_get_file_path()
    {
        //arrange
        String expected = "C:/path/appointments.txt";

        //act
        String actual = builder.getFilePath();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void should_get_column_names()
    {
        //arrange
        List<String> expected = new ArrayList<> ();
        expected.add("patient");
        expected.add("doctor");
        expected.add("date");
        expected.add("time");
        expected.add("notes");

        //act
        List<String> actual = builder.getColumnNames();

        //assert
        assertEquals(expected.size(), actual.size());
    }

    @Test
    void should_get_regex_pattern_string()
    {
        //arrange
        String expected = "(^(\\w+ (\\w+ )*\\w+)) (\\w+ (\\w+ )*\\w+) (\\d{1,2}\\/\\d{1,2}\\/\\d{4}) (\\d{1,2}:\\d{2}) (\\w+$)";

        //act
        String actual = builder.getRexExPatternString();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void should_get_regex_pattern_list()
    {
        //arrange
        List<String> expected = new ArrayList<> ();
        expected.add("(^(\\w+ (\\w+ )*\\w+))");
        expected.add("(\\w+ (\\w+ )*\\w+)");
        expected.add("(\\d{1,2}\\/\\d{1,2}\\/\\d{4})");
        expected.add("(\\d{1,2}:\\d{2})");
        expected.add("(\\w+$)");

        //act
        List<String> actual = builder.getRegExPatterns();

        //assert
        assertEquals(expected.size(), actual.size());
    }

    @Test
    void should_return_columns(){
        //arrange
        List<Column> expectedList = new ArrayList<>();
        expectedList.add(new Column("patient",""));
        expectedList.add(new Column("doctor",""));
        expectedList.add(new Column("date",""));
        expectedList.add(new Column("time",""));
        expectedList.add(new Column("notes",""));

        //act
        List<Column> actualList = builder.getColumns();

        //assert
        assertEquals(expectedList.size(), actualList.size());
        for (int i = 0; i < expectedList.size(); i++) {
            Column expected = expectedList.get(i);
            Column actual = actualList.get(i);
            assertEquals(expected.getName(), actual.getName());
            assertEquals(expected.getRegexPattern(), actual.getRegexPattern());
        }

    }

    @Test
    void should_build_schema()
    {
        //arrange
        Schema expected = new Schema();
        expected.setDefinition(statement);
        //todo: build out expected schema

        //act
        Schema actual = builder.build();

        //assert
        assertNotNull(actual);
        assertEquals(expected.getDefinition(), actual.getDefinition());

    }
}