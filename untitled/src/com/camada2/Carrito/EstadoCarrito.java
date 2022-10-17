package com.company.clase20.mesas;

public interface EstadoCarrito {
    public void agregarProducto(Producto p);
    public void cancelarCarrito();
    public void volver();
    public void pasar();
    public void pagar();

}