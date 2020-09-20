package bttd.enginit.bttd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static bttd.enginit.bttd.Utils.area6;
import static bttd.enginit.bttd.Utils.ix6;
import static bttd.enginit.bttd.Utils.iy6;
import static java.lang.Math.round;

public class Channel extends Activity {
    private double sum;
    private String hText, wText, twText, tfText;
    private Double h, w, tw, tf, area, ix, iy, iyg, xg;
    private EditText hEditText, wEditText, twEditText, tfEditText, areaEditText, ixEditText, iyEditText, xgEditText, iygEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.channel_layout);
        // Take the edit text objects
        hEditText = findViewById(R.id.hEditText);
        wEditText = findViewById(R.id.wEditText);
        twEditText = findViewById(R.id.twEditText);
        tfEditText = findViewById(R.id.tfEditText);
        areaEditText = findViewById(R.id.areaEditText);
        ixEditText = findViewById(R.id.ixEditText);
        iyEditText = findViewById(R.id.iyEditText);
        iygEditText = findViewById(R.id.iygEditText);
        xgEditText = findViewById(R.id.xgEditText);
        // Set up button as in layout
        Button calcButton = findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take value
                hText = hEditText.getText().toString();
                wText = wEditText.getText().toString();
                twText = twEditText.getText().toString();
                tfText = tfEditText.getText().toString();
                if ((hText.matches("") || wText.matches("") || twText.matches("") || tfText.matches("")) ||
                        (Double.parseDouble(hText) <= 0 || Double.parseDouble(wText) <= 0 || Double.parseDouble(twText) <= 0 || Double.parseDouble(tfText) <= 0)) {
                    Toast toast = Toast.makeText(Channel.this, "Hãy nhập lại", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                h = Double.parseDouble(hText);
                w = Double.parseDouble(wText);
                tw = Double.parseDouble(twText);
                tf = Double.parseDouble(tfText);
                // Calculate properties
                area = area6(h, w, tw, tf);
                areaEditText.setText(area.toString());
                ix = ix6(h, w, tw, tf);
                ixEditText.setText(ix.toString());
                iy = iy6(h, w, tw, tf);
                iyEditText.setText(iy.toString());
                xg = xg6(h, w, tw, tf);
                xgEditText.setText(xg.toString());
                iyg = round((iy - area*xg*xg)*100.0)/100.0;
                iygEditText.setText(iyg.toString());
            }
        });
    }

    private double xg6(double h, double w, double tw, double tf) {
        int n = 20;
        double e = (w - tw) / n;
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (tw / 2 + (2 * i - 1) * e / 2) * (e * tf); //integration
        }
        return round((2 * sum / area6(h, w, tw, tf)) * 100.0) / 100.0;
    } //Distance of center in the x direction

    public void onBackButtonClick(View view) {
        // Passing a Context and the Activity that we want to open
        Intent mainScreenIntent = new Intent(this, MainActivity.class);
        //Start activity and don't expect a result to be sent back
        startActivity(mainScreenIntent);
    }
}
