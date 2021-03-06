package reflectionAnotationExercise.barracksWars.core.commands;

import reflectionAnotationExercise.barracksWars.interfaces.Repository;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

public class Retire extends Command {
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        this.getRepository().removeUnit(unitType);
        return unitType + " retired!" ;
    }
}
