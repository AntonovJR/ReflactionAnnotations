package reflectionAnotationExercise.barracksWars.core.commands;

import reflectionAnotationExercise.barracksWars.interfaces.Executable;
import reflectionAnotationExercise.barracksWars.interfaces.Repository;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
