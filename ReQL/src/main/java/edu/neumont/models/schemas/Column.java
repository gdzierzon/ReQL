package edu.neumont.models.schemas;

public class Column
{
    private String name;
    private String regexPattern;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRegexPattern()
    {
        return regexPattern;
    }

    public void setRegexPattern(String regexPattern)
    {
        this.regexPattern = regexPattern;
    }
}
