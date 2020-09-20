package bttd.enginit.bttd;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class SearchI extends Activity {
    private static final String TAG = "THÉP CHỬ I";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchic_layout);

        ImageView imageView = findViewById(R.id.imageView);
        Resources res = getResources(); /** from an Activity */
        imageView.setImageDrawable(res.getDrawable(R.drawable.ic));

        ListView listView = findViewById(R.id.listView);
        ArrayList<RowDataIC> rowDataList = new ArrayList<>();

        for (int i = 0; i <= dataCol1.length - 1; i++) {
            RowDataIC temp = new RowDataIC(dataCol1[i], dataCol2[i], dataCol3[i], dataCol4[i], dataCol5[i], dataCol6[i], dataCol7[i]);
            rowDataList.add(temp);
        }

        RowDataICAdapter adapter = new RowDataICAdapter(this, R.layout.adapter_searchic_layout, rowDataList);
        listView.setAdapter(adapter);
    }

    // Data
    private static String[] dataCol1 = {
            "10",
            "12",
            "14",
            "16",
            "18",
            "18",
            "20",
            "20a",
            "22",
            "22a",
            "24",
            "24a",
            "27",
            "27a",
            "30",
            "30a",
            "33",
            "36",
            "40",
            "45",
            "50",
            "55",
            "60"
    };

    private static Integer[] dataCol2 = {
            100,
            120,
            140,
            160,
            180,
            180,
            200,
            200,
            220,
            220,
            240,
            240,
            270,
            270,
            300,
            300,
            330,
            360,
            400,
            450,
            500,
            550,
            600
    };

    private static Integer[] dataCol3 = {
            55,
            64,
            73,
            81,
            90,
            100,
            100,
            110,
            110,
            120,
            115,
            125,
            125,
            135,
            135,
            145,
            140,
            145,
            155,
            160,
            170,
            180,
            190
    };

    private static Double[] dataCol4 = {
            4.5,
            4.8,
            4.9,
            5.0,
            5.1,
            5.1,
            5.2,
            5.2,
            5.4,
            5.4,
            5.6,
            5.6,
            6.0,
            6.0,
            6.5,
            6.5,
            7.0,
            7.5,
            8.3,
            9.0,
            10.0,
            11.0,
            12.0
    };

    private static Double[] dataCol5 = {
            7.2,
            7.3,
            7.5,
            7.8,
            8.1,
            8.3,
            8.4,
            8.6,
            8.7,
            8.9,
            9.5,
            9.8,
            9.8,
            10.2,
            10.2,
            10.7,
            11.2,
            12.3,
            13.0,
            14.2,
            15.2,
            16.5,
            17.8
    };

    private static Double[] dataCol6 = {
            9.5,
            11.5,
            13.7,
            15.9,
            18.4,
            19.9,
            21.0,
            22.7,
            24.0,
            25.8,
            27.3,
            29.4,
            31.5,
            33.9,
            36.5,
            39.2,
            42.2,
            48.6,
            57.0,
            66.5,
            78.5,
            92.6,
            108.0
    };

    private static Double[] dataCol7 = {
            12.0,
            14.7,
            17.4,
            20.2,
            23.4,
            25.4,
            26.8,
            28.9,
            30.6,
            32.8,
            34.8,
            37.5,
            40.2,
            43.2,
            46.5,
            19.9,
            53.8,
            61.9,
            72.6,
            84.7,
            100.0,
            118.0,
            138.0
    };
}
