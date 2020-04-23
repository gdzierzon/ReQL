package edu.neumont.models.schemas;

import java.util.List;

public class SchemaBuilder
{
    private String statement;

    public SchemaBuilder(String statement)
    {
        this.statement = statement;
    }

    public String getTableName(){
        return null;
    }

    public String getFilePath(){
        return null;
    }

    public List<String> getColumnNames(){
        return null;
    }

    public List<String> getRegExPatterns(){
        return null;
    }

    public Schema build()
    {
        return null;
    }
}
