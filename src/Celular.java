public class Celular {
    //atributos
    private String marca;
    private String modelo;
    private String memoria;
    private String ram;
    private String conectividad;

    public Celular(String marca, String modelo,String memoria, String ram,String conectividad) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.ram = ram;
        this.conectividad = conectividad;


    }


    public String getMarca(){
        return this.marca;
    }

    public  String getModelo(){
        return this.modelo;
    }

    public String getMemoria(){
        return this.memoria;
    }

    public String getRam(){
        return this.ram;
    }
    public String getConectividad(){
        return this.conectividad;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;

    public void setMemoria(String memoria)
        this.memoria = memoria;
    }
}
