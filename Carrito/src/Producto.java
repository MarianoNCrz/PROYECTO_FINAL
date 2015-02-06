
public class Producto {
	private String nombre;
	private int precio;
	private String tipo;
	private String medioPago;
	private String tipoTarjeta;
	private String paisDestino;
	private String direccion;
	
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMedioPago() {
		return medioPago;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String desc(){
		return nombre+" - "+precio+" - "+tipo+" - "+medioPago+" - "+tipoTarjeta+" - "+paisDestino+" - "+direccion;
	}
	
}
