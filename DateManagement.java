import org.joda.time.DateTime; //Clase que estan en el jar
import org.joda.time.Period;
//https://www.joda.org/joda-time/quickstart.html

//Maven y Graddle son opensource que son usadon usados como manejadores de dependencias (dependency management). Verifica tambien las subdepencias para tener nuestra marco completo de trabajo.
//Donwload Maven e install, colocar en variables de entorno y agregar el PATH de /bin y en disco local c la carpeta completa
public class DateManagement {
    public static void main(String[] args) {
        org.joda.time.DateTime dt = new DateTime(2005, 3, 26, 12, 0, 0, 0);
        org.joda.time.DateTime plusPeriod = dt.plus(Period.days(1));
        System.out.println(plusPeriod.toLocalDate());
    }
}
