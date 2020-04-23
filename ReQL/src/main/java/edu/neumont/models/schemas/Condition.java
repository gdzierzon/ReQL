package edu.neumont.models.schemas;

public class Condition
{
    private Column column;
    private String operator;
    private String compareValue;
    private Boolean isAnd = null;

    public Column getColumn()
    {
        return column;
    }

    public void setColumn(Column column)
    {
        this.column = column;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getCompareValue()
    {
        return compareValue;
    }

    public void setCompareValue(String compareValue)
    {
        this.compareValue = compareValue;
    }

    public Boolean getAnd()
    {
        return isAnd;
    }

    public void setAnd(Boolean and)
    {
        isAnd = and;
    }

    public Boolean evaluate(String row)
    {
        return null;
    }
}
