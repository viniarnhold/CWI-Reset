//Apresentação
nomeCompleto = "Vinícius Gabriel Borba Arnhold";
apelido = "Vini";
idade = 23;
dataNascimento = "17/02/1998";
localNascimento = "São Leopoldo";
altura = 1.73;
trabalhando = true;
apresentação = "Meu nome é " + nomeCompleto
                + "(sou conhecido como " + apelido 
                + ") e tenho " + idade
                + "anos. Nasci no dia " + dataNascimento
                + ". Tenho " + altura
                + "m de altura e atualmente estou "
                + (trabalhando ? "empregado":"desempregado")+ ".";
console.log(apresentação);