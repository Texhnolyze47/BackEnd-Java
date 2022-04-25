package practicaMultiverse;

public class Spiderman {

    private String name;
    private String spiderman;
    private String tierraOrigen;
    private String sexo;
    private String estatura;

    public  Spiderman (String name,String spiderman, String tierraOrigen, String sexo, String estatura){
        this.name = name;
        this.spiderman = spiderman;
        this.tierraOrigen = tierraOrigen;
        this.sexo = sexo;
        this.estatura = estatura;
    }

    public String getName(){  return  name; }
    public String getSpiderman(){  return spiderman;  }
    public String getTierraOrigen(){  return  tierraOrigen;  }
    public String getSexo() {  return sexo;  }
    public String getEstatura(){  return estatura;  }

    public String showMessage(){
        return "Nombre: "+name+
                "\nSpiderman: "+spiderman+
                "\nTierra de Origen: "+tierraOrigen+
                "\nSexo: "+sexo+
                "\nEstatura: "+estatura;

    }

}
