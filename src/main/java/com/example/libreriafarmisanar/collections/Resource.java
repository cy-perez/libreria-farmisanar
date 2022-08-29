package com.example.libreriafarmisanar.collections;

import java.util.Date;

public class Resource {

    private int id;

    private int autorId;

    private int categoryId;

    private String isbn;

    private Date publishDate;

    private String title;

    private double price;

    private String description;

    private String image;

    private String mimeType;

    private String fileName;

    private Date imageLastUpdate;

    public Resource() {
    }

    public Resource(int id, int autorId, int categoryId, String isbn, Date publishDate, String title, double price, String description, String image, String mimeType, String fileName, Date imageLastUpdate) {
        this.id = id;
        this.autorId = autorId;
        this.categoryId = categoryId;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.mimeType = mimeType;
        this.fileName = fileName;
        this.imageLastUpdate = imageLastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getImageLastUpdate() {
        return imageLastUpdate;
    }

    public void setImageLastUpdate(Date imageLastUpdate) {
        this.imageLastUpdate = imageLastUpdate;
    }
}
