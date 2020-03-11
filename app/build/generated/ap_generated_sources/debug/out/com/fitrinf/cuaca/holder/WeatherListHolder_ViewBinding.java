// Generated code from Butter Knife. Do not modify!
package com.fitrinf.cuaca.holder;

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

public class WeatherListHolder_ViewBinding implements Unbinder {
  private WeatherListHolder target;

  @UiThread
  public WeatherListHolder_ViewBinding(WeatherListHolder target, View source) {
    this.target = target;

    target.maxTempList = Utils.findRequiredViewAsType(source, R.id.maxTempList, "field 'maxTempList'", TextView.class);
    target.minTempList = Utils.findRequiredViewAsType(source, R.id.minTempList, "field 'minTempList'", TextView.class);
    target.statusList = Utils.findRequiredViewAsType(source, R.id.statusList, "field 'statusList'", TextView.class);
    target.timeList = Utils.findRequiredViewAsType(source, R.id.timeList, "field 'timeList'", TextView.class);
    target.statusDetail = Utils.findRequiredViewAsType(source, R.id.statusDetail, "field 'statusDetail'", TextView.class);
    target.iconMiniList = Utils.findRequiredViewAsType(source, R.id.iconMiniList, "field 'iconMiniList'", GifImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WeatherListHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.maxTempList = null;
    target.minTempList = null;
    target.statusList = null;
    target.timeList = null;
    target.statusDetail = null;
    target.iconMiniList = null;
  }
}
