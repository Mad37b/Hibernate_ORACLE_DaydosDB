package Java;


import javax.persistence.*;
@Entity
@Table(name="Instituto")



public class Instituto {
	
	
	@Column(name="nombre_Instituto")
	String nombre_Instituo;
	@Column(name="localidad")
	String localidad;
	@Column(name="direccion")
	String direccion;
	@Column(name="matriculacion")
	String matriculacion;
	@Id
	@Column(name="id_Instituto")
	String id_Instituto;

	
	
	public String getNombre_Instituo() {
		return nombre_Instituo;
	}
	public void setNombre_Instituo(String nombre_Instituo) {
		this.nombre_Instituo = nombre_Instituo;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMatriculacion() {
		return matriculacion;
	}
	public void setMatriculacion(String matriculacion) {
		this.matriculacion = matriculacion;
	}
	public String getId_Instituto() {
		return id_Instituto;
	}
	public void setId_Instituto(String id_Instituto) {
		this.id_Instituto = id_Instituto;
	}
	

}
