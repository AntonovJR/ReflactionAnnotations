package reflectionAnotationExercise.barracksWars.core.commands;

import reflectionAnotationExercise.barracksWars.interfaces.Repository;
import reflectionAnotationExercise.barracksWars.interfaces.Unit;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

public class Add extends Command {

    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        return unitType + " added!";

    }

}
