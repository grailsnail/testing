package com.freecatalyst.fragments;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		FragmentManager fm=getFragmentManager();
		
		FragmentTransaction ft= fm.beginTransaction();
		ft.add(R.layout.fragview, new MyFragment());
		ft.commit();
    }
}
