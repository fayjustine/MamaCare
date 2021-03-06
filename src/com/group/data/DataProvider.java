package com.group.data;
/**
 * justin
 */

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class DataProvider extends ContentProvider {

	private SQLiteDatabase database;

	public synchronized SQLiteDatabase getDatabase(Context context) {

		if (database == null || !database.isOpen()) {
			DatabaseHelper helper = new DatabaseHelper(context, "mamacaredatabase");
			database = helper.getWritableDatabase();
			if (database != null) {
				database.setLockingEnabled(false);
			}
		}

		return database;
	}

	public synchronized SQLiteDatabase getReadableDatabase(Context context) {

		if (database == null || !database.isOpen()) {
			DatabaseHelper helper = new DatabaseHelper(context, "mamacaredatabase");
			database = helper.getReadableDatabase();
		}

		return database;
	}

	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		return 0;
	}

	@Override
	public String getType(Uri arg0) {
		return null;
	}

	@Override
	public Uri insert(Uri arg0, ContentValues arg1) {

		return null;
	}

	@Override
	public boolean onCreate() {
		return false;
	}

	@Override
	public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3,
			String arg4) {
		return null;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		return 0;
	}

}
