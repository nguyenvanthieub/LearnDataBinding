package com.thieumao.learndatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thieumao.learndatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public String thieu = "123";
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User("Leo Linh Tinh", "Thieu Mao");
        binding.setAbc(this);
//        binding.setUser(mUser);mUser
//        binding.setAbc(mUser);
        mUser.setFirstName("Mot Mao");
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            userList.add(new User("Leo Linh Tinh " + i, "Thieu Mao"));
            if (i==10) {
                userList.add(new User("Leo Linh jhbkjknnkknn,msdl,fdslmfdslkmfdslkmfdmslkfkmldsklmfdsklmfklmsdkfmlsdlkmfmklsdlkmfldkmsflkmdslkmfkmlsdlkmfsdlkmfmklsdlkmflkmdsfkmlsdlkfklmdsklmfdskflkmdslkmfmkldslkmfldskmlfkmdsmfmdskmfldsklmfklmlkmfdsklmfsefdsjoifesjiofrrsojkfsdorawsrjok0 Tinh " + i, "Thieu Mao " + i ));
            }
        }
        UserAdapter userAdapter = new UserAdapter(this, userList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_user);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(userAdapter);

    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String mao() {
        return "ga thieu mao";
    }
}
