//Exercício 1
nome1 = "Carlos";
nome2 = "Gabriel";
mesmoNome = (nome1 == nome2);
console.log(mesmoNome);

//Exercício 2
idade = 16;
maiorDeIdade = (idade > 18);
console.log("Maior de Idade: " + maiorDeIdade);

//Exercício 3
valor = 1000;
valorComJuros = valor * 1.1;
console.log("Valor = " + valor + ". Valor com Juros = " + valorComJuros);

//Exercício 4
item1 = 1;
item2 = 4;
item3 = 9;
item4 = 16;
item5 = 25;
mediaItens = (item1 + item2 + item3 + item4 + item5) / 5;
console.log("Média: " + mediaItens);

//Exercício 5
receita = 100000;
custo = 45000;
lucroBruto = receita - custo;
margemBruta = (lucroBruto/receita) * 100;
console.log("Margem Bruta: " + margemBruta.toFixed(2) + "%");

//Exercício 6
saldoAtual = 1000.00;
saldoAtual -= 99.90;
saldoAtual += 2500;
saldoAtual -= 0.10;
saldoAtual = saldoAtual - (saldoAtual * 0.25);
saldoAtual = saldoAtual - (saldoAtual * 0.50);
console.log("Saldo Atual: " + saldoAtual.toFixed(2));

