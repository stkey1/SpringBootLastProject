package com.bilgeadam.like.consts;

/**
 * @author stkey
 * @customize
 * @add
 * @components
 * @throws
 * @return
 * @since 29.03.2023
 */

public class EntityConstants {

    public static final String STATE = "state";
    public static final short DELETED = 0;
    public static final short UNDELETED = 1;
    public static final String WHERE_CLAUSE = STATE + " <> " + DELETED;
    public static final String SQLDELETE_CLAUSE = "set state=0 where id= ? and version=?";

}