<h1 align="center">
    Sistema Bancário Básico
</h1>

## Tecnologias

- Java

## Objetivo do Projeto

Projeto desenvolvido para a aula de Programação Orientada a Objetos, com o objetivo de resolver o seguinte problema:

> Dada duas classes:

<code>Classe Cliente{  
int idCliente;  
String nomeCliente;
}  
Classe Conta {  
long numeroConta;  
Cliente cliente;  
double saldo;
}
</code>

>Crie um programa que permita gravar as informações de um cliente e de várias contas
que esse possua. Uma vez aberta a conta, faça um programa que simule, operações de
depósito, saque, e exibição de saldo para cada conta do cliente.
Não é necessário rigidez em relação aos atributos, você está livre para acrescentar o que
achar pertinente.

>Observações:  
>A) você deve considerar como regra para sacar que só é feito o saque se o cliente
possuir saldo, e para depositar a regra é que o valor seja positivo.  
B) Todo o histórico de transacoes devem ser gravados em um arquivo resultado.txt.  
C) O problema deve ser resolvido totalmente orientado a Objetos, e você deverá
pesquisar sobre as classes em Java, File, InoutStream, OutPutStream, RamdomAccessFile,
Reader, Writer, documentadas a seguir.
