package com.pokumars.countrylist.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("name")) {
      String name;
      name = bundle.getString("name");
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("name", name);
    } else {
      throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("capital")) {
      String capital;
      capital = bundle.getString("capital");
      if (capital == null) {
        throw new IllegalArgumentException("Argument \"capital\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("capital", capital);
    } else {
      throw new IllegalArgumentException("Required argument \"capital\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("callCode")) {
      String callCode;
      callCode = bundle.getString("callCode");
      if (callCode == null) {
        throw new IllegalArgumentException("Argument \"callCode\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("callCode", callCode);
    } else {
      throw new IllegalArgumentException("Required argument \"callCode\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("population")) {
      String population;
      population = bundle.getString("population");
      if (population == null) {
        throw new IllegalArgumentException("Argument \"population\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("population", population);
    } else {
      throw new IllegalArgumentException("Required argument \"population\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("neighbors")) {
      String neighbors;
      neighbors = bundle.getString("neighbors");
      if (neighbors == null) {
        throw new IllegalArgumentException("Argument \"neighbors\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("neighbors", neighbors);
    } else {
      throw new IllegalArgumentException("Required argument \"neighbors\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("domain")) {
      String domain;
      domain = bundle.getString("domain");
      if (domain == null) {
        throw new IllegalArgumentException("Argument \"domain\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("domain", domain);
    } else {
      throw new IllegalArgumentException("Required argument \"domain\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("demonym")) {
      String demonym;
      demonym = bundle.getString("demonym");
      if (demonym == null) {
        throw new IllegalArgumentException("Argument \"demonym\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("demonym", demonym);
    } else {
      throw new IllegalArgumentException("Required argument \"demonym\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
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
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "name=" + getName()
        + ", capital=" + getCapital()
        + ", callCode=" + getCallCode()
        + ", population=" + getPopulation()
        + ", neighbors=" + getNeighbors()
        + ", domain=" + getDomain()
        + ", demonym=" + getDemonym()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String name, @NonNull String capital, @NonNull String callCode,
        @NonNull String population, @NonNull String neighbors, @NonNull String domain,
        @NonNull String demonym) {
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
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      return this;
    }

    @NonNull
    public Builder setCapital(@NonNull String capital) {
      if (capital == null) {
        throw new IllegalArgumentException("Argument \"capital\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("capital", capital);
      return this;
    }

    @NonNull
    public Builder setCallCode(@NonNull String callCode) {
      if (callCode == null) {
        throw new IllegalArgumentException("Argument \"callCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("callCode", callCode);
      return this;
    }

    @NonNull
    public Builder setPopulation(@NonNull String population) {
      if (population == null) {
        throw new IllegalArgumentException("Argument \"population\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("population", population);
      return this;
    }

    @NonNull
    public Builder setNeighbors(@NonNull String neighbors) {
      if (neighbors == null) {
        throw new IllegalArgumentException("Argument \"neighbors\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("neighbors", neighbors);
      return this;
    }

    @NonNull
    public Builder setDomain(@NonNull String domain) {
      if (domain == null) {
        throw new IllegalArgumentException("Argument \"domain\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("domain", domain);
      return this;
    }

    @NonNull
    public Builder setDemonym(@NonNull String demonym) {
      if (demonym == null) {
        throw new IllegalArgumentException("Argument \"demonym\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("demonym", demonym);
      return this;
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
  }
}
