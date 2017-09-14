package eu.dubedout.tests.autovalue;


import android.location.Location;

import com.google.auto.value.AutoValue;


import java.util.List;

@AutoValue
public abstract class Area {
    public abstract List<Double> latitude();
    public abstract Location longitude();
    public abstract float radius();

    public static Area create(List<Double> latitude, Location longitude, float radius) {
        return new AutoValue_Area(latitude, longitude, radius);
    }


}
