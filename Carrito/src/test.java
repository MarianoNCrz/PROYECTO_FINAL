import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
	static Producto p;

	public static void main(String[] args) {
		int descuento=0;
		p = new Producto();
		compra();
		//System.out.println(p.desc());
		if(p.getMedioPago().equals("efectivo")){
			descuento=descuento+10;
		}else if(p.getMedioPago().equals("credito")){
			if(p.getTipoTarjeta().equals("American Express")) descuento=descuento+5;
			if(p.getTipoTarjeta().equals("Visa")) descuento=descuento+3;
			if(p.getTipoTarjeta().equals("Mastercard")) descuento=descuento+2;
			}
		if(p.getTipo().equals("libro")) descuento=descuento+5;
		
		System.out.println("Precio sin descuento: "+p.getPrecio()+" - Descuento %"+descuento);
		double preciofinal=p.getPrecio()*(descuento/100);
		System.out.println("Precio con descuento: "+preciofinal);
				
		}
	static void compra(){
		try {
			System.out.println("Nombre:");
			String nombre=readString();
			p.setNombre(nombre);
			
			System.out.println("Precio:");
			int precio=readInt();
			p.setPrecio(precio);
			
			//libro, electrodomestico, pelicula, musica
			boolean ok=false;
			String tipo="";
			while(!ok){
				System.out.println("Tipo:");
				tipo=readString();
				if(tipo.equals("libro") || tipo.equals("electrodomestico") ||tipo.equals("pelicula") ||tipo.equals("musica")){
					ok=true;
				}
			}
			p.setTipo(tipo);
			
			//efectivo, cheque, débito, crédito
			ok=false;
			String pago="";
			while(!ok){
				System.out.println("Medio de pago:");
				pago=readString();
				if(pago.equals("efectivo") || pago.equals("cheque") ||pago.equals("debito") ||pago.equals("credito")){
					ok=true;
				}
			}
			p.setMedioPago(pago);
			
			//American Express, Visa, Mastercard
			if(pago.equals("credito")){
				ok=false;
				String tarjeta="";
				while(!ok){
					System.out.println("Tipo tarjeta:");
					tarjeta=readString();
					if(tarjeta.equals("American Express") || tarjeta.equals("Visa") ||tarjeta.equals("Mastercard")){
						ok=true;
					}
				}
				p.setTipoTarjeta(tarjeta);
			}
						
			System.out.println("Pais destino:");
			String pais=readString();
			p.setPaisDestino(pais);
			
			System.out.println("Direccion:");
			String dir=readString();
			p.setDireccion(dir);
			
		} catch (Exception e) {
			System.out.println("Error");
			}
		
	}
	
	private static String readString () throws Exception {
		BufferedReader br = new BufferedReader (
		new InputStreamReader(System.in));
		return br.readLine();
	}
	
	private static int readInt () {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		}

	private static float readFloat() {
	Scanner sc = new Scanner(System.in);
	return sc.nextFloat();
		}

	

}
