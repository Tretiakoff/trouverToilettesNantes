package com.example.tretiakoff.trouvertoilettenantes.model;

public class ListWc {

    private String recordid;
    private String datasetid;
    private DataWc data;
    private String record_timestamp;

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getDatasetid() {
        return datasetid;
    }

    public void setDatasetid(String datasetid) {
        this.datasetid = datasetid;
    }

    public DataWc getData() {
        return data;
    }

    public void setData(DataWc data) {
        this.data = data;
    }

    public String getRecord_timestamp() {
        return record_timestamp;
    }

    public void setRecord_timestamp(String record_timestamp) {
        this.record_timestamp = record_timestamp;
    }
}
