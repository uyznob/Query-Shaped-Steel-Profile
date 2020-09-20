package bttd.enginit.bttd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class SearchTGDC extends Activity {
    private static final String TAG = "THÉP GÓC ĐỀU CẠNH";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchtgdc_tgkdc_layout);

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowData> rowDataList = new ArrayList<>();

        for (int i = 0; i <= dataCol1.length - 1; i++) {
            RowData temp = new RowData(dataCol1[i], dataCol2[i], dataCol3[i]);
            rowDataList.add(temp);
        }

        RowDataAdapter adapter = new RowDataAdapter(this, R.layout.adapter_searchtgdc_tgkdc_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    // Data
    private static String[] dataCol1 = {
            "20X20X3",
            "25X25X3",
            "25X25X4",
            "30X30X3",
            "30X30X4",
            "35X35X3",
            "35X35X4",
            "40X40X3",
            "40X40X4",
            "40X40X5",
            "45X45X4",
            "45X45X5",
            "50X50X4",
            "50X50X5",
            "50X50X6",
            "60X60X5",
            "60X60X6",
            "60X60X8",
            "65X65X6",
            "65X65X8",
            "70X70X6",
            "70X70X7",
            "75X75X6",
            "75X75X8",
            "80X80X6",
            "80X80X8",
            "80X80X10",
            "90X90X7",
            "90X90X8",
            "90X90X9",
            "90X90X10",
            "100X100X8",
            "100X100X10",
            "100X100X12",
            "120X120X8",
            "120X120X10",
            "120X120X12",
            "125X125X8",
            "125X125X10",
            "125X125X12",
            "150X150X10",
            "150X150X12",
            "150X150X15",
            "180X180X15",
            "180X180X18",
            "200X200X16",
            "200X200X20",
            "200X200X24",
            "250X250X28",
            "250X250X35",

    };

    private static Double[] dataCol2 = {
            0.38,
            1.12,
            1.45,
            1.36,
            1.78,
            2.09,
            2.57,
            1.34,
            2.42,
            2.49,
            2.74,
            3.38,
            3.06,
            3.77,
            4.47,
            4.57,
            5.42,
            7.09,
            5.91,
            7.73,
            6.38,
            7.38,
            6.85,
            8.99,
            7.34,
            9.63,
            119.00,
            9.61,
            10.90,
            12.20,
            15.00,
            12.20,
            15.00,
            17.80,
            14.70,
            18.20,
            21.60,
            15.30,
            19.00,
            22.60,
            23.00,
            27.30,
            33.80,
            40.90,
            48.60,
            48.50,
            59.90,
            71.10,
            104.00,
            128.00

    };

    private static Double[] dataCol3 = {
            1.12,
            1.42,
            1.85,
            1.74,
            2.27,
            2.67,
            3.28,
            2.35,
            3.08,
            3.79,
            4.30,
            4.30,
            3.89,
            4.80,
            5.69,
            5.82,
            6.91,
            9.03,
            7.53,
            9.85,
            8.13,
            9.40,
            8.73,
            11.40,
            9.35,
            12.30,
            15.10,
            12.20,
            13.90,
            15.50,
            17.10,
            15.50,
            19.20,
            22.70,
            18.70,
            23.20,
            27.50,
            19.50,
            24.20,
            28.70,
            29.30,
            34.80,
            43.00,
            52.10,
            61.90,
            61.80,
            76.30,
            90.60,
            133.00,
            163.00

    };

}
