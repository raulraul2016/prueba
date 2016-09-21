
package modelo;

/**
 *
 * @author bgh007
 */
public class Metodologia {
    
    private Long id_metodologia;
    private String descripcion_trabajo;
    private String descripcion_tiempo_produ;
    private Double precio_producto;
    private Integer cantidad_producto;

    public Metodologia() {
    }

    public Metodologia(Long id_metodologia, String descripcion_trabajo, String descripcion_tiempo_produ, Double precio_producto, Integer cantidad_producto) {
        this.id_metodologia = id_metodologia;
        this.descripcion_trabajo = descripcion_trabajo;
        this.descripcion_tiempo_produ = descripcion_tiempo_produ;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
    }

    public Long getId_metodologia() {
        return id_metodologia;
    }

    public void setId_metodologia(Long id_metodologia) {
        this.id_metodologia = id_metodologia;
    }

    public String getDescripcion_trabajo() {
        return descripcion_trabajo;
    }

    public void setDescripcion_trabajo(String descripcion_trabajo) {
        this.descripcion_trabajo = descripcion_trabajo;
    }

    public String getDescripcion_tiempo_produ() {
        return descripcion_tiempo_produ;
    }

    public void setDescripcion_tiempo_produ(String descripcion_tiempo_produ) {
        this.descripcion_tiempo_produ = descripcion_tiempo_produ;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Integer getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }
    
}
