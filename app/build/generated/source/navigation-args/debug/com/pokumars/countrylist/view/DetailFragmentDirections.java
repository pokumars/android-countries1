package com.pokumars.countrylist.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.pokumars.countrylist.R;

public class DetailFragmentDirections {
  private DetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListFragment() {
    return new ActionOnlyNavDirections(R.id.action_listFragment);
  }
}
