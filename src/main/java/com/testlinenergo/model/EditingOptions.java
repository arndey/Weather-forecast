package com.testlinenergo.model;

/**
 * Created by kosty on 19.06.2017.
 */
public class EditingOptions {
    private Integer rowNumber;

    private Integer columnNumber;

    private String replacingData;

    private NeedOfColumns columns;

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(Integer columnNumber) {
        this.columnNumber = columnNumber;
    }

    public String getReplacingData() {
        return replacingData;
    }

    public void setReplacingData(String replacingData) {
        this.replacingData = replacingData;
    }

    public NeedOfColumns getColumns() {
        return columns;
    }

    public void setColumns(NeedOfColumns columns) {
        this.columns = columns;
    }
}
