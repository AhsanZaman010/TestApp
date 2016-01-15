package com.play.app.adapters;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.accolite_.test_app.R;
import com.play.app.MySingleton;
import com.play.app.SlotItem;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Accolite- on 1/13/2016.
 */

/**
 * Created by Accolite_ on 12/18/2015.
 */
public class SlotsAdapter extends ArrayAdapter<SlotItem>
{
    private ProgressDialog progressDialog;
    private ListView listView;
    private static boolean colorChangeFlag=false;
    private Context applicationContext;
    private ArrayList<SlotItem> items=new ArrayList<SlotItem>();
    private RequestQueue requestQueue;
    private String accessToken="";
    public SlotsAdapter(Context context, int resource, ArrayList<SlotItem> objects) {
        super(context, resource, objects);
        applicationContext=context;
        requestQueue= MySingleton.getInstance(context).getRequestQueue();
        items=objects;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.slots_list_item, null);
        }
        final SlotItem item = items.get(position);

        if (item != null) {
            TextView slot1 = (TextView) v.findViewById(R.id.slot1);
            slot1.setText(item.getSlot1());
            TextView destinationName = (TextView) v.findViewById(R.id.slot2);
            destinationName.setText(item.getSlot2());

            slot1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
            return v;
    }
    public void setListView(ListView list)
    {
        listView=list;
    }
}
