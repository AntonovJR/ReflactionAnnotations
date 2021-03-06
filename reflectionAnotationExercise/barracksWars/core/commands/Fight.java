package reflectionAnotationExercise.barracksWars.core.commands;

import reflectionAnotationExercise.barracksWars.interfaces.Repository;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

public class Fight extends Command{
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
