package cz.mendelu.pef.configuration;

import android.provider.BaseColumns;

public interface SectionDatabaseScheme extends BaseColumns {
    String TABLE_NAME = "tasks";

    String _NAME = "name";
    String _DESCRIPTION = "description";

    String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + _ID + " INTEGER PRIMARY KEY,"
            + _NAME + " TEXT,"
            + _DESCRIPTION + " TEXT"
            + ")";
    String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
