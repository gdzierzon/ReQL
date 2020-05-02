package edu.neumont.models.schemas;

import edu.neumont.models.regex.RegExParser;

import java.util.List;
import ryan.libexample.lib.*;

public class SchemaBuilder
{
    private String statement;

    public SchemaBuilder(String statement)
    {
        this.statement = statement;
    }

    public String getTableName()
    {
        String pattern = "'\\w+'";
        String tableName = RegExParser.parse(statement,pattern)
                                      .replace("'", "");

        return tableName;

    }

    public String getFilePath(){


        String pattern = "'\\w+'";
        String filePath = RegExParser.parse(statement,pattern)
                .replace("'", "");

        return filePath;
    }

    public List<String> getColumnNames(){
        return null;
    }

    public String getRexExPatternString(){
        return null;
    }

    public List<String> getRegExPatterns(){
        return null;
    }

    public List<Column> getColumns(){ return null; }

    public Schema build()
    {
        return null;
    }
}
