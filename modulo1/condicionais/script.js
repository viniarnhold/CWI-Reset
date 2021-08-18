altura = 1.73;
peso = 86.3;

imc = peso/(altura**2);

if (imc < 18.5) {
    console.log("Seu IMC é: " + imc)
    console.log("Grau de Obesidade: 0 - Magreza")
}
else if (imc < 25.0) {
    console.log("Seu IMC é: " + imc)
    console.log("Grau de Obesidade: 0 - Normal")
}
else if (imc < 30.0) {
    console.log("Seu IMC é: " + imc)
    console.log("Grau de Obesidade: 1 - Sobrepeso")
}
else if (imc < 40.0) {
    console.log("Seu IMC é: " + imc)
    console.log("Grau de Obesidade: 2 - Obesidade")
}
else {
    console.log("Seu IMC é: " + imc)
    console.log("Grau de Obesidade: 3 - Obesidade grave")
    console.log("É importante procurar um médico para avaliar sua saúde")
}
