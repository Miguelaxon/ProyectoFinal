package modulo1;

public class Accidente extends Cliente{
	private int idAcc = 0;
	private int rutCliente = 0;
	private String dia = new String();
	private int hora = 0;
	private String lugar = new String();
	private String origen = new String();
	private String consecuencia = new String();
	public Accidente() {}
	public Accidente(int idAcc, int rutCliente, String dia, int hora, String lugar, String origen,
			String consecuencia) {
		this.idAcc = idAcc;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}
	public int getIdAcc() {
		return idAcc;
	}
	public void setIdAcc(int idAcc) {
		this.idAcc = idAcc;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getConsecuencia() {
		return consecuencia;
	}
	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}
	/******************
	 * Metodo to String
	 ******************/
	@Override
	public String toString() {
		return "Accidente [idAcc=" + idAcc + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", origen=" + origen + ", consecuencia=" + consecuencia + "]";
	}
	
}	
