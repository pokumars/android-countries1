package com.pokumars.countrylist.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.pokumars.countrylist.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static ActionDetailFragment actionDetailFragment(@NonNull String name,
      @NonNull String capital, @NonNull String callCode, @NonNull String population,
      @NonNull String neighbors, @NonNull String domain, @NonNull String demonym) {
    return new ActionDetailFragment(name, capital, callCode, population, neighbors, domain, demonym);
  }

  public static class ActionDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetailFragment(@NonNull String name, @NonNull String capital,
        @NonNull String callCode, @NonNull String population, @NonNull String neighbors,
        @NonNull String domain, @NonNull String demonym) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      if (capital == null) {
        throw new IllegalArgumentException("Argument \"capital\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("capital", capital);
      if (callCode == null) {
        throw new IllegalArgumentException("Argument \"callCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("callCode", callCode);
      if (population == null) {
        throw new IllegalArgumentException("Argument \"population\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("population", population);
      if (neighbors == null) {
        throw new IllegalArgumentException("Argument \"neighbors\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("neighbors", neighbors);
      if (domain == null) {
        throw new IllegalArgumentException("Argument \"domain\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("domain", domain);
      if (demonym == null) {
        throw new IllegalArgumentException("Argument \"demonym\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("demonym", demonym);
    }

    @NonNull
    public ActionDetailFragment setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      return this;
    }

    @NonNull
    public ActionDetailFragment setCapital(@NonNull String capital) {
      if (capital == null) {
        throw new IllegalArgumentException("Argument \"capital\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("capital", capital);
      return this;
    }

    @NonNull
    public ActionDetailFragment setCallCode(@NonNull String callCode) {
      if (callCode == null) {
        throw new IllegalArgumentException("Argument \"callCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("callCode", callCode);
      return this;
    }

    @NonNull
    public ActionDetailFragment setPopulation(@NonNull String population) {
      if (population == null) {
        throw new IllegalArgumentException("Argument \"population\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("population", population);
      return this;
    }

    @NonNull
    public ActionDetailFragment setNeighbors(@NonNull String neighbors) {
      if (neighbors == null) {
        throw new IllegalArgumentException("Argument \"neighbors\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("neighbors", neighbors);
      return this;
    }

    @NonNull
    public ActionDetailFragment setDomain(@NonNull String domain) {
      if (domain == null) {
        throw new IllegalArgumentException("Argument \"domain\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("domain", domain);
      return this;
    }

    @NonNull
    public ActionDetailFragment setDemonym(@NonNull String demonym) {
      if (demonym == null) {
        throw new IllegalArgumentException("Argument \"demonym\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("demonym", demonym);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("name")) {
        String name = (String) arguments.get("name");
        __result.putString("name", name);
      }
      if (arguments.containsKey("capital")) {
        String capital = (String) arguments.get("capital");
        __result.putString("capital", capital);
      }
      if (arguments.containsKey("callCode")) {
        String callCode = (String) arguments.get("callCode");
        __result.putString("callCode", callCode);
      }
      if (arguments.containsKey("population")) {
        String population = (String) arguments.get("population");
        __result.putString("population", population);
      }
      if (arguments.containsKey("neighbors")) {
        String neighbors = (String) arguments.get("neighbors");
        __result.putString("neighbors", neighbors);
      }
      if (arguments.containsKey("domain")) {
        String domain = (String) arguments.get("domain");
        __result.putString("domain", domain);
      }
      if (arguments.containsKey("demonym")) {
        String demonym = (String) arguments.get("demonym");
        __result.putString("demonym", demonym);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getName() {
      return (String) arguments.get("name");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCapital() {
      return (String) arguments.get("capital");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCallCode() {
      return (String) arguments.get("callCode");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPopulation() {
      return (String) arguments.get("population");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getNeighbors() {
      return (String) arguments.get("neighbors");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDomain() {
      return (String) arguments.get("domain");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDemonym() {
      return (String) arguments.get("demonym");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDetailFragment that = (ActionDetailFragment) object;
      if (arguments.containsKey("name") != that.arguments.containsKey("name")) {
        return false;
      }
      if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
        return false;
      }
      if (arguments.containsKey("capital") != that.arguments.containsKey("capital")) {
        return false;
      }
      if (getCapital() != null ? !getCapital().equals(that.getCapital()) : that.getCapital() != null) {
        return false;
      }
      if (arguments.containsKey("callCode") != that.arguments.containsKey("callCode")) {
        return false;
      }
      if (getCallCode() != null ? !getCallCode().equals(that.getCallCode()) : that.getCallCode() != null) {
        return false;
      }
      if (arguments.containsKey("population") != that.arguments.containsKey("population")) {
        return false;
      }
      if (getPopulation() != null ? !getPopulation().equals(that.getPopulation()) : that.getPopulation() != null) {
        return false;
      }
      if (arguments.containsKey("neighbors") != that.arguments.containsKey("neighbors")) {
        return false;
      }
      if (getNeighbors() != null ? !getNeighbors().equals(that.getNeighbors()) : that.getNeighbors() != null) {
        return false;
      }
      if (arguments.containsKey("domain") != that.arguments.containsKey("domain")) {
        return false;
      }
      if (getDomain() != null ? !getDomain().equals(that.getDomain()) : that.getDomain() != null) {
        return false;
      }
      if (arguments.containsKey("demonym") != that.arguments.containsKey("demonym")) {
        return false;
      }
      if (getDemonym() != null ? !getDemonym().equals(that.getDemonym()) : that.getDemonym() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getName() != null ? getName().hashCode() : 0);
      result = 31 * result + (getCapital() != null ? getCapital().hashCode() : 0);
      result = 31 * result + (getCallCode() != null ? getCallCode().hashCode() : 0);
      result = 31 * result + (getPopulation() != null ? getPopulation().hashCode() : 0);
      result = 31 * result + (getNeighbors() != null ? getNeighbors().hashCode() : 0);
      result = 31 * result + (getDomain() != null ? getDomain().hashCode() : 0);
      result = 31 * result + (getDemonym() != null ? getDemonym().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDetailFragment(actionId=" + getActionId() + "){"
          + "name=" + getName()
          + ", capital=" + getCapital()
          + ", callCode=" + getCallCode()
          + ", population=" + getPopulation()
          + ", neighbors=" + getNeighbors()
          + ", domain=" + getDomain()
          + ", demonym=" + getDemonym()
          + "}";
    }
  }
}
