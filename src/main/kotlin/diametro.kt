fun main (){


    print("Digite o diâmetro do círculo: ")

    val diametro  = readLine()!!.toDouble()
    val r = (diametro/2)
    val p = 2* 3.1415 * r

    println("O perimetro do circulo informado é de: ${("%.2f".format(p))}")
    val a = (r*r)*3.141
    println("A area do circulo informado é de: ${("%.2f".format(a))}")
}