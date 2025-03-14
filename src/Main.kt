fun main() {
    val sistemaReservas = SistemaReservas()
    while (true) {
        println("""
            
                         __,                      ,__
                      __/==+\  MENU DE OPCIONES  /+==\__
                        "  "`   ===============   '"  "
            
        """.trimIndent())
        println("[1] Registrar reserva")
        println("[2] Cancelar reserva")
        println("[3] Mostrar reservas")
        println("[4] Salir")

        print("\n[] Escoja una opcion: ")
        val opcion = readln().toInt()

        when (opcion) {
            1 -> {
                print("+ ID de reserva: ")
                val id = readln().toInt()
                print("+ Cedula del huesped: ")
                val idHuesped = readln().toInt()
                print("+ Nombre huesped: ")
                val nombre = readln()
                print("+ Email huesped: ")
                val email = readln()
                print("+ Numero de habitacion de reserva: ")
                val habitacion = readln().toInt()

                if (sistemaReservas.obtenerReservas().any { it.numeroHabitacion == habitacion }) {
                    println("Esta habitacion ya esta reservada")
                    continue
                }

                print("+ Tipo de habitacion: ")
                val tipo = readln()
                print("+ Precio por noche: ")
                val precio = readln().toDouble()
                print("+ Cantidad de noches: ")
                val noches = readln().toInt()

                val reserva = Reserva(id, idHuesped, nombre, email, habitacion, tipo, precio, noches)
                sistemaReservas.registrarReserva(reserva)
            }
            2 -> {
                println("\nReservas en el sistema\n")
                sistemaReservas.mostrarReservas()
                print("\n+ Ingrese el ID de la reserva a cancelar: ")
                val id = readln().toInt()
                sistemaReservas.cancelarReserva(id)
            }
            3 -> {
                println("\nReservas en el sistema\n")
                sistemaReservas.mostrarReservas()
            }
            4 -> {
                println("Buen dia")
                break
            }
            else -> println("Esta opcion no existe")
        }
    }
}
