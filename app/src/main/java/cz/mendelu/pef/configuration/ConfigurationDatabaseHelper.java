package cz.mendelu.pef.configuration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConfigurationDatabaseHelper extends SQLiteOpenHelper {

    private static final String NAME = "configuration_db";
    private static final int VERSION = 1;

    public ConfigurationDatabaseHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
