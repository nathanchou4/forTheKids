// Generated code from Butter Knife. Do not modify!
package com.example.forthekidz;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ModalFragment_ViewBinding implements Unbinder {
  private ModalFragment target;

  private View view7f070030;

  @UiThread
  public ModalFragment_ViewBinding(final ModalFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.close_modal_button, "field 'closeModalButton' and method 'closeModal'");
    target.closeModalButton = Utils.castView(view, R.id.close_modal_button, "field 'closeModalButton'", TextView.class);
    view7f070030 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.closeModal(p0);
      }
    });
    target.step_forward_block = Utils.findRequiredViewAsType(source, R.id.step_forward_block, "field 'step_forward_block'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ModalFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.closeModalButton = null;
    target.step_forward_block = null;

    view7f070030.setOnClickListener(null);
    view7f070030 = null;
  }
}
