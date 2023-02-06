package examen;

//@author Macarena Cardozo.
public class Examen {

    public static void main(String[] args) {

        // ---- INSTARCIAR OBJETOS ----\\
        Limusina limusin = new Limusina(true, 10);//LIMUSINA

        limusin.setLimuTamanio(LimuTamanio.MEDIANA);//LIMUSINA

        Hotel hh = new Hotel();//HOTEL

        HotelCuatroEstrella h4 = new HotelCuatroEstrella(15, 5, "GRANDIDIERITA VERDE-AZULADO", 200, 52000.35);//H4

        HotelCincoEstrella h5 = new HotelCincoEstrella(7, 250, 690, 36, 75000.95, 6, 43, 30, 10, "TAAFFEITE LAVANDA", 980);//H5

        AlojamientoExtrahotelero extrahh = new AlojamientoExtrahotelero(); //EXTRAHOTELERO 

        Cabania cabania = new Cabania();//CABAÑA

        Camping camping = new Camping();//CAMPING

        // ...... MÉTODOS DE RELACION ...... \\
        h5.agregarLimusina(limusin);// RELACION DE AGREGACION
        h5.setLimu(limusin);// SETEO EL OBJETO

        hh.setHotel4(h4);//RELACION DE ASOCIACION

        hh.setHotel5(h5);//RELACION DE ASOCIACION

        extrahh.setCab(cabania);//RELACION DE ASOCIACION

        extrahh.setCamp(camping);//RELACION DE ASOCIACION

        // ++++++ MÉTODOS DEL HOTEL  ++++++ \\
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬   EMPRESA TURÍSTICA 'EL DIAMANTE ROJO' ¬¬¬¬¬¬¬¬¬¬¬");

        System.out.println("");
        System.out.println("CARGÁ LOS DATOS DEL HOTEL 4 ESTRELLAS");
        System.out.println("");

        hh.getHotel4().crearHotel();//METODO N°1

        System.out.println("");
        System.out.println("**********************************************");

        System.out.println("");
        System.out.println("DATOS - HOTEL 4 ESTRELLAS");
        System.out.println("");

        hh.getHotel4().imprimirDatosHotel();//METODO N°2

        System.out.println("");
        System.out.println("**********************************************");

        System.out.println("");
        System.out.println("DATOS - HOTEL 5 ESTRELLAS ");
        System.out.println("");

        hh.getHotel5().imprimirDatosHotel();//METODO N°3

        System.out.println("");
        System.out.println("**********************************************");

        System.out.println("");
        System.out.println("CALCULAR TARIFAS - HOTEL 4 ESTRELLAS");
        System.out.println("");

        hh.getHotel4().calcularTarifa();//METODO N°4

        System.out.println("");
        System.out.println("");
        System.out.println("**********************************************");

        System.out.println("");
        System.out.println("CARCULAR TARIFAS - HOTEL 5 ESTRELLAS");
        System.out.println("");

        hh.getHotel5().calcularTarifa();//METODO N°5

        System.out.println("");
        //  *** MÉTODOS DEL ALOJAMIENTO EXTRAHOTELERO *** \\
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        
        System.out.println("CARGÁ LOS DATOS DE LA CABAÑA");
        System.out.println("");

        extrahh.getCab().crearCabania();//METODO N°6

        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        
        System.out.println("CARGÁ LOS DATOS DEL CAMPING");
        System.out.println("");

        extrahh.getCamp().crearCamping();//METODO N°7

        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        
        System.out.println("DATOS DE LA CABAÑA");
        System.out.println("");

        extrahh.getCab().mostrarDatos();//METODO N°10

        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("DATOS DEL CAMPING");
        System.out.println("");

        extrahh.getCamp().mostrarDatos();//METODO N°11
        System.out.println("");
        
        
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");
        

        System.out.println("CALCULAR TARIFAS DE LA CABAÑA");
        

        System.out.println();

        extrahh.getCab().calcularPrecio();//METODO N°8

        System.out.println("");
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("");

        System.out.println("CALCULAR TARIFAS DEL CAMPING");
        System.out.println("");
        

        extrahh.getCamp().calcularPrecio();//METODO N°9

        
        
        System.out.println("");
        System.out.println("");
     

    }
}


/*

*/
