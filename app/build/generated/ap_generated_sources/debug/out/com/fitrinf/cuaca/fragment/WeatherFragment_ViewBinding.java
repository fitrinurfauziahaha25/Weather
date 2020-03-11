// Generated code from Butter Knife. Do not modify!
package com.fitrinf.cuaca.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.fitrinf.cuaca.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import pl.droidsonroids.gif.GifImageView;

public class WeatherFragment_ViewBinding implements Unbinder {
  private WeatherFragment target;

  @UiThread
  public WeatherFragment_ViewBinding(WeatherFragment target, View source) {
    this.target = target;

    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tvTime, "field 'tvTime'", TextView.class);
    target.tvCity = Utils.findRequiredViewAsType(source, R.id.tvCity, "field 'tvCity'", TextView.class);
    target.tvDayDate = Utils.findRequiredViewAsType(source, R.id.tvDayDate, "field 'tvDayDate'", TextView.class);
    target.tvMaxTemp = Utils.findRequiredViewAsType(source, R.id.tvMaxTemp, "field 'tvMaxTemp'", TextView.class);
    target.tvMinTemp = Utils.findRequiredViewAsType(source, R.id.tvMinTemp, "field 'tvMinTemp'", TextView.class);
    target.tvStatus = Utils.findRequiredViewAsType(source, R.id.tvStatus, "field 'tvStatus'", TextView.class);
    target.imgCuaca = Utils.findRequiredViewAsType(source, R.id.imgCuaca, "field 'imgCuaca'", GifImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WeatherFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTime = null;
    target.tvCity = null;
    target.tvDayDate = null;
    target.tvMaxTemp = null;
    target.tvMinTemp = null;
    target.tvStatus = null;
    target.imgCuaca = null;
  }
}
