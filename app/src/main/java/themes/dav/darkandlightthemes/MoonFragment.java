package themes.dav.darkandlightthemes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dav.darkandlightthemes.databinding.FragmentMoonBinding;
import com.google.android.material.snackbar.Snackbar;


public class MoonFragment extends Fragment implements View.OnClickListener {

    private FragmentMoonBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMoonBinding.inflate(inflater,container,false);

        binding.snackBarBtn.setOnClickListener(this);

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        Snackbar.make(view, "Snack bar ", Snackbar.LENGTH_SHORT).show();
    }
}