package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import pens.lab.app.belajaractivity.FirstActivity;
import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.login.LoginActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfilFragment extends BaseFragment<ProfilActivity, ProfilContract.Presenter> implements ProfilContract.View {
    EditText tEmail;
    EditText tPassword;
    Button btnBack;
    String email, password;

    public ProfilFragment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilPresenter(this);
        mPresenter.start();

        tEmail = fragmentView.findViewById(R.id.t_email);
        tPassword = fragmentView.findViewById(R.id.t_password);
        btnBack = fragmentView.findViewById(R.id.bt_back);
        tEmail.setText(email);
        tPassword.setText(password);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectToProfile();
            }
        });

        setTitle("Profile");

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfilContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToProfile() {
        Intent intent = new Intent(activity, LoginActivity.class);

        startActivity(intent);
        activity.finish();
    }


}
