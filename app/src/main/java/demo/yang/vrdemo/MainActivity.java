package demo.yang.vrdemo;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class MainActivity extends AppCompatActivity {
    VrPanoramaView vrPanoramaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vrPanoramaView = (VrPanoramaView) findViewById(R.id.pano_view);
        VrPanoramaView.Options options = new VrPanoramaView.Options();
        options.inputType = VrPanoramaView.Options.TYPE_MONO;
        vrPanoramaView.loadImageFromBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.xuedi),options);
    }
}
