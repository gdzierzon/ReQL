package edu.neumont.models.schemas;

import java.util.List;

public class QueryBuilder
{
    private String queryText;

    public String getQueryText()
    {
        return queryText;
    }

    public void setQueryText(String queryText)
    {
        this.queryText = queryText;
    }

    public QueryBuilder(String queryText)
    {
        this.queryText = queryText;
    }

    public Schema getSchema()
    {
        return null;
    }

    public List<Column> getColumns()
    {
        return null;
    }

    public List<Condition> getConditions()
    {
        return null;
    }

    public Query build()
    {
        return null;
    }

}
