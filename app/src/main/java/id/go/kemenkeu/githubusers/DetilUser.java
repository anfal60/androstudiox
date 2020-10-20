package id.go.kemenkeu.githubusers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetilUser extends AppCompatActivity {
    public static final String EXTRA_PERSON = "extra_person";
    ImageView imgUser;
    TextView textName, textUsername, textLocation, textRepository, textCompany, textFollowers, textFollowing;
    private String title = "Detil User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_user);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgUser = findViewById(R.id.avt_photo);
        textName = findViewById(R.id.txt_name);
        textUsername = findViewById(R.id.txt_username);
        textLocation = findViewById(R.id.txt_location);
        textCompany = findViewById(R.id.txt_company);
        textRepository = findViewById(R.id.txt_repository);
        textFollowers = findViewById(R.id.txt_followers);
        textFollowing = findViewById(R.id.txt_following);

        User users = getIntent().getParcelableExtra(EXTRA_PERSON);
        imgUser.setImageResource(users.getPhoto());
        textName.setText(users.getName());
        textUsername.setText(users.getUsername());
        textLocation.setText(users.getLocation());
        textCompany.setText(users.getCompany());
        textRepository.setText(users.getRepository());
        textFollowers.setText(users.getFollower());
        textFollowing.setText(users.getFollowing());
    }
}