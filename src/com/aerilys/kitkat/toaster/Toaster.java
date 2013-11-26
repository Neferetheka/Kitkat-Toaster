package com.aerilys.kitkat.toaster;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public abstract class Toaster {
	public static void toast(Activity context, String message) {
		LayoutInflater inflater = context.getLayoutInflater();
		View layout = inflater.inflate(R.layout.toaster,
				(ViewGroup) context.findViewById(R.id.toast_layout_root));

		TextView text = (TextView) layout.findViewById(R.id.toasterLabel);
		text.setText(message);

		Toast toast = new Toast(context);
		toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 50);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(layout);
		toast.show();
	}
}
