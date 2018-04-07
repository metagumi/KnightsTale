package knights;

import org.junit.Test;
import static org.mockito.Mockito.*;


/**
 * Created by sylvesterharvey on 5/2/17.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
