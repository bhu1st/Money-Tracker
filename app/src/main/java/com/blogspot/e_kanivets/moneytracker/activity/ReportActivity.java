package com.blogspot.e_kanivets.moneytracker.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.blogspot.e_kanivets.moneytracker.R;
import com.blogspot.e_kanivets.moneytracker.adapter.ReportItemAdapter;
import com.blogspot.e_kanivets.moneytracker.helper.MTHelper;
import com.blogspot.e_kanivets.moneytracker.model.Report;

/**
 * Created by eugene on 11/09/14.
 */
public class ReportActivity extends Activity {

    private Activity activity;

    private TextView tvTitle;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        activity = this;

        tvTitle = (TextView) findViewById(R.id.tv_title);
        listView = (ListView) findViewById(R.id.listView);

        /*tvTitle.setText("REPORT (" + MTHelper.getInstance().getFirstDay() + " - "
                + MTHelper.getInstance().getLastDay() + ")");*/

        listView.setAdapter(new ReportItemAdapter(activity,
                new Report(MTHelper.getInstance().getRecords()).getReportList()));
    }
}