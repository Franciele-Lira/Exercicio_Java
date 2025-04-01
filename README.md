# Exercicios  Java e a Arte da Abstração com Classes e Encapsulação
---------

### todos os executivos devem ter um menu interativo para chamar as funções e ter uma opção de sair para encerrar a execução

### 1. Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:
* Consultar saldo
* consultar cheque especial
*  Depositar dinheiro;
*  Sacar dinheiro;
*  Pagar um boleto.
*  Verifique se a conta está usando check especial.
## > Siga as seguintes regras para implementar

- Uma conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
- Para valores acima de R$500,00 o cheque especial deverá ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deverá cobrar uma taxa de 20% do valor usado do cheque especial.

--------

### 2.  Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
- Ligar o carro;
- Desligar o carro;
- Acelerar;
- diminuir velocidade;
- virar para esquerda/direita
- verificar velocidade;
- trocar a marcha
- Siga as seguintes regras de implementação

## > Quando o carro criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
- O carro desligado não pode realizar nenhuma função;
- Quando o carro para acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
- Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no mínimo a 0km);
- o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
- A velocidade do carro deve respeitar os seguintes limites para cada velocidade
- se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
- se você estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
- se você estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
- se você estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
- se você estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
- se você estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
- se você estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
- O carro pode ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
- O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;


-------------

### 3.Escreva um código onde temos o controle de banho de um petshop, a maquina de banho dos pets deve ter as seguintes operações:
- Dar banho no pet;
- Abastecer com água;
- Abastecer com shampoo;
- verificar nível de água;
- verificar nível de shampoo;
- verifique se o animal não tem banho;
- colocar pet na maquina;
- retirar pet da máquina;
- Limpe a máquina.
- Siga as seguintes regras para implementação

## > máquina de banho deve permitir apenas 1 animal de estimação por vez;
- Cada banho realizado deverá consumir 10 litros de água e 2 litros de shampoo;
- A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
- Se o animal for retirado da máquina sem estar limpo, será necessário limpar a máquina para permitir a entrada de outro animal;
- A máquina de limpeza irá consumir 3 litros de água e 1 litro de shampoo;
- O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;


