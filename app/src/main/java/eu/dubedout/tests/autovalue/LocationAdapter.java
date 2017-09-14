package eu.dubedout.tests.autovalue;

import android.location.Location;

import me.mattlogan.auto.value.firebase.adapter.TypeAdapter;

class LocationAdapter implements TypeAdapter<Location, String> {
    @Override
    public Location fromFirebaseValue(String value) {
        String[] split = value.split(";");
        Location location = new Location("firebase");
        location.setLatitude(Double.parseDouble(split[0]));
        location.setLongitude(Double.parseDouble(split[1]));
        return location;
    }

    @Override
    public String toFirebaseValue(Location value) {
        return value.getLatitude()+";"+value.getLongitude();
    }
}
