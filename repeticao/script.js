//Exercício 1
valores = [12, 5, 25, 87, 96];
n = 0
while(n < valores.length){
    console.log(valores[n++])
}

//Exercício 2
valoresPMedia = [12, 52, 64, 23, 34, 64, 23, 23, 64, 87, 87, 34, 23, 97]
soma = 0
for(i=0; i<valoresPMedia.length; i++) {
    soma += valoresPMedia[i]
}
media = soma/valoresPMedia.length
console.log(media)

//Exercício 3
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

for(j=0; j<nomesComuns.length; j++){
    if (nomesComuns[j] == "Vinícius"){
        encontrou = true
        break
    } else {
        encontrou = false
    }
}
if(encontrou == true){
    console.log("É, mesmo nome")
} else {
    console.log("Diferentão, hein?")
}
