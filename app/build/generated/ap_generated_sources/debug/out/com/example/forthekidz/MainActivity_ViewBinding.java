// Generated code from Butter Knife. Do not modify!
package com.example.forthekidz;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

<<<<<<< HEAD
  private View view7f070091;
=======
  private View view7f0700ab;

  private View view7f07003f;
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.testButton, "method 'showModal'");
<<<<<<< HEAD
    view7f070091 = view;
=======
    view7f0700ab = view;
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showModal(p0);
      }
    });
<<<<<<< HEAD
=======
    view = Utils.findRequiredView(source, R.id.closeModalButton, "method 'closeModal'");
    view7f07003f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.closeModal(p0);
      }
    });
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


<<<<<<< HEAD
    view7f070091.setOnClickListener(null);
    view7f070091 = null;
=======
    view7f0700ab.setOnClickListener(null);
    view7f0700ab = null;
    view7f07003f.setOnClickListener(null);
    view7f07003f = null;
>>>>>>> 45a7aeb4a1eed0afe223b5ce20eeaae85175dd26
  }
}
