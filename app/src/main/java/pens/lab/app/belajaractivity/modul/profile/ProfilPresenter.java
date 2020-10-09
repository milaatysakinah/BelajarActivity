package pens.lab.app.belajaractivity.modul.profile;

/**
 * Created by fahrul on 13/03/19.
 */

public class ProfilPresenter implements ProfilContract.Presenter{
    private final ProfilContract.View view;

    public ProfilPresenter(ProfilContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        //proses login
        //if login success call redirect to profil
        view.redirectToProfile();
    }
}
