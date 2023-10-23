package exemples

import java.sql.DriverManager

fun update (){
        val url = "jdbc:sqlite:identifier.sqlitejdbc:sqlite:ruta_del_fitxer_sqlite"
        val con = DriverManager.getConnection(url)
        val st = con.createStatement()

        st.executeUpdate("UPDATE USUARIO SET Telefono = Telefono + 2")

        st.close()
        con.close()
}