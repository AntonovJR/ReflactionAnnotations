package reflectionAnotationExercise.barracksWars;


import reflectionAnotationExercise.barracksWars.core.Engine;
import reflectionAnotationExercise.barracksWars.core.factories.UnitFactoryImpl;
import reflectionAnotationExercise.barracksWars.data.UnitRepository;
import reflectionAnotationExercise.barracksWars.interfaces.Repository;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
