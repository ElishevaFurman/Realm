package com.example.faigy.realm.adapters;

/**
 * Created by faigy on 7/11/2016.
 */
import android.content.Context;


import com.example.faigy.realm.model.Book;

import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}