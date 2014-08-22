package com.freecatalyst.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;




public class MyFragment extends Fragment
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedState){
		
		return inflater.inflate(R.layout.fragview, container, false);
	}
}
