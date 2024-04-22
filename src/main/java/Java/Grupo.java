package Java;
import javax.persistence.*;
@Entity
@Table(name="Grupo")

public class Grupo {
	
	@Column
	String id_grupo;
	@Column
	String nombre_Grupo;
	@Column
	String id_Instituto;
	
	public String getId_grupo() {
		return id_grupo;
	}
	public void setId_grupo(String id_grupo) {
		this.id_grupo = id_grupo;
	}
	public String getNombre_Grupo() {
		return nombre_Grupo;
	}
	public void setNombre_Grupo(String nombre_Grupo) {
		this.nombre_Grupo = nombre_Grupo;
	}
	public String getId_Instituto() {
		return id_Instituto;
	}
	public void setId_Instituto(String id_Instituto) {
		this.id_Instituto = id_Instituto;
	}
	
	
}
