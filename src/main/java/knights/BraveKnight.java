package knights;

/**
 * Created by sylvesterharvey on 5/1/17.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
