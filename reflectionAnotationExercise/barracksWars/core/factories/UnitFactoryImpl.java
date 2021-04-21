package reflectionAnotationExercise.barracksWars.core.factories;

import reflectionAnotationExercise.barracksWars.interfaces.Unit;
import reflectionAnotationExercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "reflectionAnotationExercise.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType){
        Unit unit = null;
        try {
            Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
            unit = (Unit) clazz.getDeclaredConstructor().newInstance();

                } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException e) {
            throw  new IllegalStateException(e);
        }
        return unit;
    }
}
