// Exercício 1
function imprimir(i){
    console.log(i);
}
imprimir(12);

// Exercício 2
function verificarNome(nome1, nome2){ //Essa função serve para verificar se dois nomes são iguais
mesmoNome = (nome1 == nome2);
console.log("Os nomes são os mesmos? " + mesmoNome);
}
verificarNome("Carlos", "Gabriel");
verificarNome("cwi", "cwi")   // true
verificarNome("cwi", "reset") // false

function verificarMaioridade(idade){ //Essa função serve para verificar se uma pessoa com a idade informada é de maior
maiorDeIdade = (idade >= 18);
console.log("Maior de Idade: " + maiorDeIdade);
}
verificarMaioridade(18);
verificarMaioridade(30) // true
verificarMaioridade(18) // true
verificarMaioridade(5)  // false

function calcularValorComJuros(valor, juros){ //Essa função serve para calcular o valor com o juros, do valor e da taxa informada
valorComJuros = valor * (juros/100 + 1);
console.log("Valor = " + valor + ". Valor com Juros = " + valorComJuros);
}
calcularValorComJuros(5000, 20)
calcularValorComJuros(100, 10)   // 110
calcularValorComJuros(984.5, 10) // 1082.95

function mediaItens(itens){ //Essa função calcula a média de itens informados
soma = 0
for(k=0; k<itens.length; k++){
    soma += itens[k]
}
media = soma/itens.length
console.log("Média: " + media);
}
mediaItens([1, 4, 9, 16, 25]);
mediaItens([1])             // 1
mediaItens([1, 4, 10])      // 5
mediaItens([1, 2, 3, 4, 5]) // 3

function calculoMargemBruta(receita, custo) {
lucroBruto = receita - custo;
margemBruta = (lucroBruto/receita) * 100;
console.log("Margem Bruta: " + margemBruta.toFixed(2) + "%");
}
calculoMargemBruta(5000, 2000);
calculoMargemBruta(1000000, 500000)      // 50
calculoMargemBruta(528459.11, 632501.87) // -19.68[...]