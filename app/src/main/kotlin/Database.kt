import android.database.Cursor
import android.database.sqlite.SQLiteCursorDriver
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteQuery

class TransactionAbortException : RuntimeException()


fun SQLiteDatabase.transaction(code: SQLiteDatabase.() -> Unit) {
    try {
        beginTransaction()
        code()
        setTransactionSuccessful()
    } catch (e: TransactionAbortException) {
        // Do nothing, just stop the transaction
    } finally {
        endTransaction()
    }
}

fun SQLiteDatabase.delete(tableName: String, whereClause: String = "", vararg args: Pair<String, Any>): Int {
    return -1
}

class Factory : SQLiteDatabase.CursorFactory {
    override fun newCursor(db: SQLiteDatabase?, masterQuery: SQLiteCursorDriver?, editTable: String?, query: SQLiteQuery?): Cursor? {
        return null
    }
}

fun main(args: Array<String>) {

    val db : SQLiteDatabase = SQLiteDatabase.create(Factory())

    db.transaction {
        db.delete("people", "is_singer = ?", "is_singer" to true)
    }
}
