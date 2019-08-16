package com.uas.ranggasaputra.view;

import com.uas.ranggasaputra.data.model.Friends;



public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
