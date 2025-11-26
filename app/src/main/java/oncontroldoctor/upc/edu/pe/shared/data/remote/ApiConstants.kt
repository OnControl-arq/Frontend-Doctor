package oncontroldoctor.upc.edu.pe.shared.data.remote

object ApiConstants {
    // Cambia la URL de Azure por la de tu localhost
    // 10.0.2.2 es la IP especial para que el emulador de Android vea tu PC
    const val BASE_URL = "http://10.0.2.2:8080/api/v1/"
    const val WS_BASE_URL = "ws://10.0.2.2:8080"

    // Si usas un dispositivo físico, usa tu IP real:
    // const 2val BASE_URL = "http://192.168.1.X:8080/api/v1/"
}