package nla.org.test_bitrise;

import nla.org.test_bitrise.R;
import android.Manifest;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainIntroActivity extends IntroActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_simple)
                .description(R.string.description)
                .image(R.drawable.ic_launcher)
                .background(R.color.background)
                .backgroundDark(R.color.background_dark)
                .scrollable(false)
                .permission(Manifest.permission.CAMERA)
                .build());
    }
}
