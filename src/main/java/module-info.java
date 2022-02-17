/**
 * @author Grégory Van den Borre
 */

open module be.yildizgames.module.database.updater {

    requires java.sql;

    requires liquibase.core;
    requires be.yildizgames.module.database;

    exports be.yildizgames.module.database.updater;

}