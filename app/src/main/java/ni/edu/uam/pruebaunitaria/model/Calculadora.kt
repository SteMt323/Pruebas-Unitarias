package ni.edu.uam.pruebaunitaria.model

class Calculadora {

    fun validate(a: Int, b: Int): Boolean {
        return a > 0 && b > 0
    }

    fun sumar(a: Int, b: Int): Int {
        if (!validate(a, b)) {
            throw IllegalArgumentException("Los números deben ser positivos")
        }
        return a + b
    }

    fun restar(a: Int, b: Int): Int {
        if (!validate(a, b)) {
            throw IllegalArgumentException("Los números deben ser positivos")
        }
        return a - b
    }

    fun multiplicar(a: Int, b: Int): Int {
        if (!validate(a, b)) {
            throw IllegalArgumentException("Los números deben ser positivos")
        }
        return a * b
    }

    fun dividir(a: Int, b: Int): Int {
        if (!validate(a, b)) {
            throw IllegalArgumentException("Los números deben ser positivos")
        }
        return a / b
    }

}