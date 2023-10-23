package exemples

import java.sql.DriverManager

fun delete(){
    val url = "jdbc:sqlite:identifier.sqlitejdbc:sqlite:ruta_del_fitxer_sqlite"
    val con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("DELETE FROM USUARIO WHERE Nombre LIKE Bernat")

    st.close()
    con.close()
}