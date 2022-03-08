import kotlin.math.round

fun main() {
    println("O que deseja verificar?")
    println("1: Taxa de Natalidade/Mortalidade\n2: Quantidade a ser paga\n3: Sair")
    val choose = readLine()!!.toInt()
    when(choose){
        1 -> {natalidade()}
        2 -> {pagamento()}
        3 -> {println("Adeuss!!")}
    }
}
////////////////////////////////////////////////////////////////////////////////
fun natalidade(){
    println("Digite o nome da cidade: \n")
    val nomeCidade = readLine()!!.toString()
    println("Digite o numero de habitantes\n")
    val numeroHabitantes = readLine()!!.toInt()
    println("O que desejas fazer?")
    println("1: Ver taxa de Natalidade\n2: Ver taxa de Mortalidade\n3: Sair")
    println("")
    val choose = readLine()!!.toInt()
    when(choose){
        1 -> {
            println("Digite o numero de crianças nascidas no ultimo ano: ")
            val bebes = readLine()!!.toInt()
            val natalidade = (bebes * 1000) / numeroHabitantes
            println("A taxa de Natalidade da $nomeCidade é $natalidade")
        }
        2 -> {
            println("Digite o numero de óbitos no ultimo ano: ")
            val obitos = readLine()!!.toInt()
            val mortalidade = (obitos * 1000) / numeroHabitantes
            println("A taxa de Mortalidade da $nomeCidade é $mortalidade")
        }
        3 -> {
            println("Adeus!! :D")
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
fun pagamento(){
    println("Digite o preço a ser pago: ")
    val preco = readLine()!!.toFloat()
    var variancia: Float = 0.0f

    println("Escolha a forma de pagamento")
    println("1: A vista\n2: A prazo (30 dias)\n3: A prazo parcelado")
    val formaPagamento = readLine()!!.toInt()
    when(formaPagamento){
        1 -> {
            variancia = preco - (preco * 0.1f)
        }
        2 -> {
            variancia = preco + (preco * 0.03f)
        }
        3 -> {

            println("Em quantos meses sera pago?")
            val meses = readLine()!!.toInt()

            variancia = round(preco + (preco * (0.015f * meses)))
        }
    }
    println("O Total a ser pago é $variancia")
}