package com.example.realmapp;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class ApplicationRealm extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        realm.close();
    }

    // configuracion del realm
    private void setupRealmConfig(){
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .schemaVersion(1)
                .migration(new RealmMigration())
                .build();
        Realm.setDefaultConfiguration(config);
    }

}
