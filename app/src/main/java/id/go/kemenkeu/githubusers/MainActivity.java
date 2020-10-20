package id.go.kemenkeu.githubusers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUsers;
    private ArrayList<User> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUsers = findViewById(R.id.rv_users);
        rvUsers.setHasFixedSize(true);

        list.addAll(UserData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUsers.setLayoutManager(new LinearLayoutManager(this));
        ListUserAdapter listUserAdapter = new ListUserAdapter(list);
        rvUsers.setAdapter(listUserAdapter);

        rvUsers.setOnClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                User user = new User();
                user.setName(list.get(i).getName());
                user.setPhoto(list.get(i).getPhoto());
                user.setUsername(list.get(i).getUsername());
                user.setCompany(list.get(i).getCompany());
                user.setLocation(list.get(i).getLocation());
                user.setRepository(list.get(i).getRepository());
                user.setFollower(list.get(i).getFollower());
                user.setFollowing(list.get(i).getFollowing());

                Intent moveUser = new Intent(MainActivity.this, DetilUser.class);
                moveUser.putExtra(DetilUser.EXTRA_PERSON, user);
                startActivity(moveUser);
            }
        });
    }
}