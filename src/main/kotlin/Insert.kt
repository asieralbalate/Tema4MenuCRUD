package exemples

import java.sql.DriverManager

fun insert(){
    val url = "jdbc:sqlite:identifier.sqlitejdbc:sqlite:ruta_del_fitxer_sqlite"
    val con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("INSERT INTO USUARIO VALUES (1,'Andreu','ANDFE','325456aa',687442144,'LEOMESSI@gmail.com')")

    st.executeUpdate("INSERT INTO USUARIO VALUES (2,'Bernat','BEFEr','284646bb',685412359,'CR7@gmail.com')")

    st.executeUpdate("INSERT INTO USUARIO VALUES (3,'Clàudia','CLALO','265677cc',658741236, 'KMP@gmail.com')")

    st.executeUpdate("INSERT INTO USUARIO VALUES (4,'Damià','DAMDO','405677dd',685412358, 'holahola@gmail.com')")

    st.close()
    con.close()
}