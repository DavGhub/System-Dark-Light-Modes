package themes.dav.darkandlightthemes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.dav.darkandlightthemes.databinding.FragmentSunBinding;

public class SunFragment extends Fragment implements View.OnClickListener {

    private FragmentSunBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSunBinding.inflate(inflater,container,false);

        binding.dialogBtn.setOnClickListener(this);

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        new AlertDialog.Builder(requireActivity())
                .setTitle("Title")
                .setMessage("Message")
                .show();
    }
}