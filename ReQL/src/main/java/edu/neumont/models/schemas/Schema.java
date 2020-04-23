package edu.neumont.models.schemas;

import java.util.List;
import java.util.Map;

public class Schema
{
    private String table;
    private String filePath;
    private Map<String, Column> columns;
    private String definition;

    public String getTable()
    {
        return table;
    }

    public void setTable(String table)
    {
        this.table = table;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public Map<String, Column> getColumns()
    {
        return columns;
    }

    public void setColumns(Map<String, Column> columns)
    {
        this.columns = columns;
    }

    public String getDefinition()
    {
        return definition;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
    }

    public void addColumn(Column column)
    {

    }
}
