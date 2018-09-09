package com.example.rfgr.trenazer;
/**Utworzona klasa Workout będzie wykorzystywana przez fragment WorkoutDetailFragment*/
public class Workout {

    /**
     * Każdy obiekt klasy Workout zawiera nazwę i opis dlatego tutaj określam zmienne private
     */
    private String name;
    private String description;

    /**
     * tablica workouts zawiera 4 obiekty klasy Workout
     */
    public static final Workout[] workoouts = {
            new Workout("Pierwszy", "Opis pierwszy"),
            new Workout("Drugi", "Opis drugi"),
            new Workout("Trzeci", "Opis trzeci"),
            new Workout("Czwarty", "Opis czwarty"),
    };

    /**
     * Każdy obiekt klasy Workout zawiera nazwę i opis
     */
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Metody get pobierają dane zmiennych prywatnych
     */
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
