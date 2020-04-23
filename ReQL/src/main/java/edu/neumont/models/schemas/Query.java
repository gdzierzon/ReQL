package edu.neumont.models.schemas;

import java.util.ArrayList;
import java.util.List;

public class Query
{
    private Schema schema;
    private List<Column> columns;
    private List<Condition> conditions;

    private List<List<String>> results;

    public Schema getSchema()
    {
        return schema;
    }

    public void setSchema(Schema schema)
    {
        this.schema = schema;
    }

    public List<Column> getColumns()
    {
        return columns;
    }

    public void setColumns(List<Column> columns)
    {
        this.columns = columns;
    }

    public List<Condition> getConditions()
    {
        return conditions;
    }

    public void setConditions(List<Condition> conditions)
    {
        this.conditions = conditions;
    }

    public List<List<String>> getResults()
    {
        return results;
    }

    public Query()
    {
        results = new ArrayList<>();
    }

    public void execute()
    {

    }
}
