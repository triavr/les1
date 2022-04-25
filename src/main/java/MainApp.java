import com.egartech.animals.Airplane;
import com.egartech.animals.Duck;
import com.egartech.animals.Flyable;

public class MainApp {

       public static void main(String[] args) {
        Flyable[] flyable = {
                new Duck(),
                new Airplane()


        };

        for (Flyable f : flyable) {
            f.fly();
        }

        Flyable somethingFlyable = new Duck();

        somethingFlyable.fly();

    }

}
