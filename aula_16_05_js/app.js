//criar uma fila
let carro=[];

//adicionar veículos: FIFO
carro.push("Uno")
carro.push("Gol")
carro.push("Santana")

//visualizar a fila
console.log(carro)

//remover
carro.shift();

console.log(carro)

let fila_prioridade = [
    {modelo: "Uno", prioridade: 2},
    {modelo: "Gol", prioridade: 2},
    {modelo: "Ambulância", prioridade: 1},
    {modelo: "Policia", prioridade: 1}
];
fila_prioridade.sort((carro_a, carro_b) => carro_a.prioridade - carro_b.prioridade);
//carro a vem antes do carro b
//carro b vem antes do carro a
//se estão na mesma prioridade, o primeiro a entrar na fila é o primeiro a sair

console.log(fila_prioridade)