package nla.org.test_bitrise;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainIntroActivity extends IntroActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_simple)
                .description(R.string.description)
                .image(R.mipmap.ic_launcher)
                .background(R.color.background)
                .backgroundDark(R.color.background_dark)
                .scrollable(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_simple)
                .description(R.string.description)
                .image(R.mipmap.ic_guestconnect)
                .background(R.color.background)
                .backgroundDark(R.color.background_dark)
                .scrollable(false)
                .build());
    }
}
