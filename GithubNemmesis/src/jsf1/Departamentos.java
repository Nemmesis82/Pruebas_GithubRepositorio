package jsf1;


import java.util.List;

import jsf2.*;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class Departamentos 
{
	/**
	 * Genero una lista de departamentos
	 */
	@ManagedProperty(value="#{lista}")
	List<Departments> lista;

	/**
	 * Añado gettes y setter de la lista
	 * @return
	 */
	public  List<Departments> getLista() {
		return lista;
	}

	public void setLista(List<Departments> lista) {
		this.lista = lista;
	}


@PostConstruct
public void cargarDepartamentos()
{
	
	EmployeesDAO emp=new EmployeesDAO();
	this.lista=emp.obtenerDepartamentos();
	for (Departments ldep : lista) 
	{
		System.out.println(ldep);
	}
}
}
