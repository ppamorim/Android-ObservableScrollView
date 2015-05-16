package com.github.ksoichiro.android.observablescrollview.samples;

import com.github.ksoichiro.android.observablescrollview.RecyclerViewScrollable;
import com.github.ksoichiro.android.observablescrollview.ScrollUtils;

public abstract class FillGap2BaseRecyclerActivity<S extends RecyclerViewScrollable>
    extends FillGapBaseRecyclerActivity<S> {
  protected float getHeaderTranslationY(int scrollY) {
    return ScrollUtils.getFloat(-scrollY + mFlexibleSpaceImageHeight - mHeaderBar.getHeight(),
        0, Float.MAX_VALUE);
  }
}