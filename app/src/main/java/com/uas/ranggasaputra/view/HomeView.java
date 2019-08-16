package com.uas.ranggasaputra.view;

import com.uas.ranggasaputra.data.model.User;



public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
