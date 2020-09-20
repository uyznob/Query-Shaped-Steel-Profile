package bttd.enginit.bttd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static bttd.enginit.bttd.Utils.area2;
import static bttd.enginit.bttd.Utils.ix2;
import static bttd.enginit.bttd.Utils.iy2;

public class Circle extends Activity {
    private String dText;
    private Double d, area, ix, iy;
    private EditText dEditText, areaEditText, ixEditText, iyEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.circle_layout);
        // Take the edit text objects
        dEditText = findViewById(R.id.dEditText);
        areaEditText = findViewById(R.id.areaEditText);
        ixEditText = findViewById(R.id.ixEditText);
        iyEditText = findViewById(R.id.iyEditText);
        // Set up button as in layout
        Button calcButton = findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Take value
                dText = dEditText.getText().toString();
                if ((dText.matches("")) ||
                        (Double.parseDouble(dText) <= 0)) {
                    Toast.makeText(Circle.this, "Hãy nhập lại", Toast.LENGTH_SHORT).show();
                    return;
                }
                d = Double.parseDouble(dText);
                // Calculate properties
                area = area2(d);
                areaEditText.setText(area.toString());
                ix = ix2(d);
                ixEditText.setText(ix.toString());
                iy = iy2(d);
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
