package com.defense.notecase.models;

public class FileModel {
    private String fileName;
    private String fileLink;
    private String uploadedBy;
    private String uploadDate;

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public FileModel(String fileName, String fileLink, String uploadedBy, String uploadDate) {
        this.fileName = fileName;
        this.fileLink = fileLink;
        this.uploadedBy = uploadedBy;
        this.uploadDate = uploadDate;
    }


    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
