package com.defense.notecase.models;

public class NotificationModel {
    private String date;
    private String recordType;
    private String uploadedBy;
    private String fileLink;

    public NotificationModel(String date, String recordType, String uploadedBy, String fileLink) {
        this.date = date;
        this.recordType = recordType;
        this.uploadedBy = uploadedBy;
        this.fileLink = fileLink;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
