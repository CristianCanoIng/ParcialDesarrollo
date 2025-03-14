class SistemaReservas {
    private val reservas = mutableListOf<Reserva>()

    fun registrarReserva(reserva: Reserva) {
        if (reservas.any { it.numeroHabitacion == reserva.numeroHabitacion }) {
            println("Error: La habitación ya está reservada.")
        } else {
            reservas.add(reserva)
            println("Reserva registrada. Total: ${reserva.calcularTotal()}")
        }
    }

    fun cancelarReserva(idReserva: Int) {
        if (reservas.removeIf { it.idReserva == idReserva }) {
            println("Reserva cancelada.")
        } else {
            println("Este Id no existe: $idReserva.")
        }
    }

    fun mostrarReservas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
        } else {
            reservas.forEach { println(it.toString()) }
        }
    }

    fun obtenerReservas(): List<Reserva> {
        return reservas
    }
}