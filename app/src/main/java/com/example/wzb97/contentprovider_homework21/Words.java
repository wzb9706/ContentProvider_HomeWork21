package com.example.wzb97.contentprovider_homework21;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by wzb97 on 2016/9/5.
 */
public class Words {
    public static final String AUTHORITY = "com.example.wzb97.wordsprovider";
    public Words(){

    }
    public static abstract class Word implements BaseColumns{
        public static final String TABLE_NAME="words";
        public static final String COLUMN_NAME_WORD="word";
        public static final String COLUMN_NAME_MEANING="meaning";
        public static final String COLUMN_NAME_SAMPLE="sample";

        //MIME类型
        public static final String MIME_DIR_PREFIX = "vnd.android.cursor.dir";
        public static final String MIME_ITEM_PREFIX = "vnd.android.cursor.item";
        public static final String MINE_ITEM = "vnd.example.wzb97.word";

        public static final String MINE_TYPE_SINGLE = MIME_ITEM_PREFIX + "/" + MINE_ITEM;
        public static final String MINE_TYPE_MULTIPLE = MIME_DIR_PREFIX + "/" + MINE_ITEM;

        public static final String PATH_SINGLE = "word/#";
        public static final String PATH_MULTIPLE = "word";

        //Content Uri
        public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + PATH_MULTIPLE;
        public static final Uri CONTENT_URI = Uri.parse(CONTENT_URI_STRING);
    }
}
