public class Main {
    public static void main(String[] args) {

        SmartDevice iPad = new SmartDevice("apple","mini","gris",2023);
        System.out.println(iPad.fabricante);
        System.out.println(iPad.modelo);
        System.out.println(iPad.color);
        System.out.println(iPad.year);

        SmartPhone iPhone = new SmartPhone();
        iPhone.fabricante = "apple";
        iPhone.pulgadas = 6.1;
        System.out.println(iPhone.fabricante);
        System.out.println(iPhone.pulgadas);

        SmartWatch iwatch = new SmartWatch();
        iwatch.modelo = "SE";
        iwatch.color = "verde";
        iwatch.duracionBateria = 18;
        System.out.println(iwatch.modelo);
        System.out.println(iwatch.color);
        System.out.println(iwatch.duracionBateria);




    }
}