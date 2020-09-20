package bttd.enginit.bttd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static bttd.enginit.bttd.Utils.area1;
import static bttd.enginit.bttd.Utils.ix1;
import static bttd.enginit.bttd.Utils.iy1;


public class Rectangle extends Activity {
    private String hText, wText;
    private Double h, w, area, ix, iy;
    private EditText hEditText, wEditText, areaEditText, ixEditText, iyEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.rectangle_layout);
        // Take the edit text objects
        hEditText = findViewById(R.id.hEditText);
        wEditText = findViewById(R.id.wEditText);
        areaEditText = findViewById(R.id.areaEditText);
        ixEditText = findViewById(R.id.ixEditText);
        iyEditText = findViewById(R.id.iyEditText);
        // Set up button as in layout
        Button calcButton = findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take value
                hText = hEditText.getText().toString();
                wText = wEditText.getText().toString();
                if ((hText.matches("") || wText.matches("")) ||
                        (Double.parseDouble(hText) <= 0 || Double.parseDouble(wText) <= 0)) {
                    Toast.makeText(Rectangle.this, "Hãy nhập lại", Toast.LENGTH_SHORT).show();
                    return;
                }
                h = Double.parseDouble(hText);
                w = Double.parseDouble(wText);
                // Calculate properties
                area = area1(h, w);
                areaEditText.setText(area.toString());
                ix = ix1(h, w);
                ixEditText.setText(ix.toString());
                iy = iy1(h, w);
                iyEditText.setText(iy.toString());
            }
        });
    }

    public void onBackButtonClick(View view) {
        // Passing a Context and the Activity that we want to open
        Intent mainScreenIntent = new Intent(this, MainActivity.class);
        //Start activity and don't expect a result to be sent back
        startActivity(mainScreenIntent);
    }
}
