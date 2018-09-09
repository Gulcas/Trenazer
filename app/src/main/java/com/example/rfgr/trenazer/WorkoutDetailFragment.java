package com.example.rfgr.trenazer;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutId; //identyfikator wyboru dokonanego przez usera aplikacji

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong("workoutId");
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView(); //metoda getView pobiera główny widok fragmentu który możemy później uzyc do pobrania referencji
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workoouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

  @Override
  public void onSaveInstanceState (Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", workoutId);
  }

    public void setWorkout(long id) { //tej metody aktywność będzie używać do określenia identyfikatora treningu
        this.workoutId = id;
    }
}
