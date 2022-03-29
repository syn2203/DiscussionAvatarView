package com.discussionavatarview;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GlideUtil {

    //Glide加载图片为圆形
    public static void loadCircleImageView(Context context, String url, ImageView iv, boolean isShowFrame, int width, int color) {
        if (context != null) {
            if (context instanceof Activity) {
                if (!((Activity) context).isDestroyed()) {
                    if (isShowFrame) {
                        loadCircleBorder(context, url, iv, width, color);
                    } else {
                        loadCircle(context, url, iv);
                    }
                }
            } else {
                if (isShowFrame) {
                    loadCircleBorder(context, url, iv, width, color);
                } else {
                    loadCircle(context, url, iv);
                }
            }
        }
    }

    private static void loadCircle(Context context, String url, ImageView iv) {
        Glide.with(context).load(url).transform(new GlideCircleTransform()).
                diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(iv);
    }

    private static void loadCircleBorder(Context context, String url, ImageView iv, int width, int color) {
        Glide.with(context).load(url).
                diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).
                transform(new GlideCircleTransformWithBorder(width, color)).
                into(iv);
    }
}
