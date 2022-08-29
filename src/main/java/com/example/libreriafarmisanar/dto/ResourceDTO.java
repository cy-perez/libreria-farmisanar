package com.example.libreriafarmisanar.dto;

import java.util.Date;

public class ResourceDTO {

    private int idLibro;

    private int idAutorLibro;

    private int idCategoriaLibro;

    private String isbnLibro;

    private Date fechaPublicacion;

    private String tituloLibro;

    private double precioLibro;

    private String descripcionLibro;

    private String imagenLibro;

    private String tipoMimeLibro;

    private String nombreArchivo;

    private Date ultimaActualizacionImagen;

    public ResourceDTO() {
    }

    public ResourceDTO(int idLibro, int idAutorLibro, int idCategoriaLibro, String isbnLibro, Date fechaPublicacion, String tituloLibro, double precioLibro, String descripcionLibro, String imagenLibro, String tipoMimeLibro, String nombreArchivo, Date ultimaActualizacionImagen) {
        this.idLibro = idLibro;
        this.idAutorLibro = idAutorLibro;
        this.idCategoriaLibro = idCategoriaLibro;
        this.isbnLibro = isbnLibro;
        this.fechaPublicacion = fechaPublicacion;
        this.tituloLibro = tituloLibro;
        this.precioLibro = precioLibro;
        this.descripcionLibro = descripcionLibro;
        this.imagenLibro = imagenLibro;
        this.tipoMimeLibro = tipoMimeLibro;
        this.nombreArchivo = nombreArchivo;
        this.ultimaActualizacionImagen = ultimaActualizacionImagen;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    public int getIdCategoriaLibro() {
        return idCategoriaLibro;
    }

    public void setIdCategoriaLibro(int idCategoriaLibro) {
        this.idCategoriaLibro = idCategoriaLibro;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        this.precioLibro = precioLibro;
    }

    public String getDescripcionLibro() {
        return descripcionLibro;
    }

    public void setDescripcionLibro(String descripcionLibro) {
        this.descripcionLibro = descripcionLibro;
    }

    public String getImagenLibro() {
        return imagenLibro;
    }

    public void setImagenLibro(String imagenLibro) {
        this.imagenLibro = imagenLibro;
    }

    public String getTipoMimeLibro() {
        return tipoMimeLibro;
    }

    public void setTipoMimeLibro(String tipoMimeLibro) {
        this.tipoMimeLibro = tipoMimeLibro;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Date getUltimaActualizacionImagen() {
        return ultimaActualizacionImagen;
    }

    public void setUltimaActualizacionImagen(Date ultimaActualizacionImagen) {
        this.ultimaActualizacionImagen = ultimaActualizacionImagen;
    }
}
