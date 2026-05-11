public class Main {
    public static void main(String[] args) {

      Celular celular1 = new Celular("Xiaomi","Redmi 10A","32GB","2G","4G");
      /*celular1.marca = "Xiaomi";
        celular1.modelo = "Redmi 10A";
        celular1.memoria = "32GB";
        celular1.ram = "2GB";
        celular1.conectividad = "4G";
        System.out.println(celular1.marca);
        System.out.println(celular1.modelo);
        System.out.println(celular1.memoria);
        System.out.println(celular1.ram);
        System.out.println(celular1.conectividad);
       */
       Celular celular2 = new Celular("Apple","iphone15","128GB","6GB","5G");
        System.out.println(celular1.mostrarInformacion());



    }
}