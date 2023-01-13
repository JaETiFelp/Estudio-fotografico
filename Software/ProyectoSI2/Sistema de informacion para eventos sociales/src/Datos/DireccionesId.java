package Datos;
// Generated 13-05-2014 06:34:34 PM by Hibernate Tools 3.6.0



/**
 * DireccionesId generated by hbm2java
 */
public class DireccionesId  implements java.io.Serializable {


     private int idEven;
     private String descripcion;

    public DireccionesId() {
    }

    public DireccionesId(int idEven, String descripcion) {
       this.idEven = idEven;
       this.descripcion = descripcion;
    }
   
    public int getIdEven() {
        return this.idEven;
    }
    
    public void setIdEven(int idEven) {
        this.idEven = idEven;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DireccionesId) ) return false;
		 DireccionesId castOther = ( DireccionesId ) other; 
         
		 return (this.getIdEven()==castOther.getIdEven())
 && ( (this.getDescripcion()==castOther.getDescripcion()) || ( this.getDescripcion()!=null && castOther.getDescripcion()!=null && this.getDescripcion().equals(castOther.getDescripcion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEven();
         result = 37 * result + ( getDescripcion() == null ? 0 : this.getDescripcion().hashCode() );
         return result;
   }   


}

