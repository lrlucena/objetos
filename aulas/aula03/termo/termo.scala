// Adaptação do Código de Tomasz Wegrzanowski
// https://dev.to/taw/100-languages-speedrun-episode-85-linguagem-potigol-3829

class Termo1(a: Int):
  val palavras = List("ABCDE")//Arquivo.leia("palavras.txt")
  val palavra = "ABCDE" //aleatorio(_palavras)

  def verifique(acho: String): String = 
    var blocos = ""
    for i <- 1 to 5 do
      if acho(i) == palavra(i) then
        blocos = blocos + "🟩"
      else if palavra.contains(acho(i)) then
        blocos = blocos + "🟨"
      else
        blocos = blocos + "⬛"
    return blocos

@main
def main() =
  val termo = new Termo1(10)
  var acho = ""
  while acho != termo.palavra do
    acho = io.StdIn.readLine()
    if acho.length == 5 then
      println(termo.verifique(acho))
    else
      println("palavra deve ter 5 caracteres")
