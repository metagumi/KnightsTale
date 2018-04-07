package knights;

/**
 * Created by sylvesterharvey on 5/2/17.
 */
import java.io.PrintStream;
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }

}
