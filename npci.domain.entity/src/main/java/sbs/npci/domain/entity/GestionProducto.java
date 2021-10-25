package sbs.npci.domain.entity;

import java.util.List;
import java.util.Objects;

import sbs.npci.domain.entity.base.BaseEntity;

public class GestionProducto extends BaseEntity {

	private Integer idGestProd;
	private Integer idInformeDet;
	private String tipGestProd;
	private String descripcion;
	private String tipoNivel0;
	private String tipoNivel1;
	private String relevante;
	private String exposicion;
	private String aceptado;
	private String respuesta;
	private Short indActivo;
	private List<String> codigosPlan;
	private List<String> codigosControl;
	private List<Control> controles;
	private List<Plan> planes;
	
	public Integer getIdGestProd() {
		return idGestProd;
	}
	public void setIdGestProd(Integer idGestProd) {
		this.idGestProd = idGestProd;
	}
	public Integer getIdInformeDet() {
		return idInformeDet;
	}
	public void setIdInformeDet(Integer idInformeDet) {
		this.idInformeDet = idInformeDet;
	}
	public String getTipGestProd() {
		return tipGestProd;
	}
	public void setTipGestProd(String tipGestProd) {
		this.tipGestProd = tipGestProd;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoNivel0() {
		return tipoNivel0;
	}
	public void setTipoNivel0(String tipoNivel0) {
		this.tipoNivel0 = tipoNivel0;
	}
	public String getTipoNivel1() {
		return tipoNivel1;
	}
	public void setTipoNivel1(String tipoNivel1) {
		this.tipoNivel1 = tipoNivel1;
	}
	public String getRelevante() {
		return relevante;
	}
	public void setRelevante(String relevante) {
		this.relevante = relevante;
	}
	public String getExposicion() {
		return exposicion;
	}
	public void setExposicion(String exposicion) {
		this.exposicion = exposicion;
	}
	public String getAceptado() {
		return aceptado;
	}
	public void setAceptado(String aceptado) {
		this.aceptado = aceptado;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Short getIndActivo() {
		return indActivo;
	}
	public void setIndActivo(Short indActivo) {
		this.indActivo = indActivo;
	}	
	public List<String> getCodigosPlan() {
		return codigosPlan;
	}
	public void setCodigosPlan(List<String> codigosPlan) {
		this.codigosPlan = codigosPlan;
	}
	public List<String> getCodigosControl() {
		return codigosControl;
	}
	public void setCodigosControl(List<String> codigosControl) {
		this.codigosControl = codigosControl;
	}
	public List<Control> getControles() {
		return controles;
	}
	public void setControles(List<Control> controles) {
		this.controles = controles;
	}
	public List<Plan> getPlanes() {
		return planes;
	}
	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aceptado, 
							descripcion, 
							exposicion, 
							idGestProd, 
							idInformeDet, 
							indActivo, 
							relevante,
							respuesta, 
							tipGestProd, 
							tipoNivel0, 
							tipoNivel1,
							this.getAuditUserCrea(),
							this.getAuditFecCrea(),
							this.getAuditUserMod(),
							this.getAuditFecMod());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GestionProducto other = (GestionProducto) obj;
		return Objects.equals(aceptado, other.aceptado) 
				&& Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(exposicion, other.exposicion) 
				&& Objects.equals(idGestProd, other.idGestProd)
				&& Objects.equals(idInformeDet, other.idInformeDet) 
				&& Objects.equals(indActivo, other.indActivo)
				&& Objects.equals(relevante, other.relevante) 
				&& Objects.equals(respuesta, other.respuesta)
				&& Objects.equals(tipGestProd, other.tipGestProd) 
				&& Objects.equals(tipoNivel0, other.tipoNivel0)
				&& Objects.equals(tipoNivel1, other.tipoNivel1)
				&& Objects.equals(this.getAuditUserCrea(), other.getAuditUserCrea())
				&& Objects.equals(this.getAuditFecCrea(), other.getAuditFecCrea())
				&& Objects.equals(this.getAuditUserMod(), other.getAuditUserMod())
				&& Objects.equals(this.getAuditFecMod(), other.getAuditFecMod());
	}
	
}
