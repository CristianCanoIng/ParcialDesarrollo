open class Reserva(
    val idReserva: Int,
    val idHuesped: Int,
    val nombreHuesped: String,
    val emailHuesped: String,
    val numeroHabitacion: Int,
    val tipoHabitacion: String,
    val precioPorNoche: Double,
    val cantidadNoches: Int
) {
    fun calcularTotal(): Double {
        return precioPorNoche * cantidadNoches
    }

    override fun toString(): String {
        return """
            - ID: $idReserva
            - Huesped: $nombreHuesped
            - Cedula del huesped: $idHuesped
            - Email del huesped: $emailHuesped
            - Habitacion: $numeroHabitacion
            - Tipo de Habitacion reservada: $tipoHabitacion
            - Total: ${calcularTotal()}
            
            """.trimIndent()
    }
}
